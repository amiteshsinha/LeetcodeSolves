package com.leetcode.mostProfitAssigningWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MostProfitAssigningWork extends AbstractParent {

    /**
     * Runtime
     * 20
     * ms
     * Beats
     * 62.04%
     *
     * Memory
     * 46.21
     * MB
     * Beats
     * 10.20%
     * @param difficulty
     * @param profit
     * @param worker
     * @return
     */
    @Override
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0, profitLength = profit.length, currMaxProfit = 0, taskIndex = 0;
        // pair difficulty and profit and sort by difficulty
        List<Task> taskList = new ArrayList<>();
        Task task;
        for (int i = 0; i < profitLength; i++) {
            task = new Task(difficulty[i], profit[i]);
            taskList.add(task);
        }
        taskList.sort(Comparator.comparingInt(a -> a.difficulty));
        // sort worker -
        Arrays.sort(worker);
        // for each worker take the work with maximum profit
        //int tempIndex = 1;
        for (int i : worker) {
            while (taskIndex < profitLength) {
                task = taskList.get(taskIndex);
                if (task.difficulty > i) {
                    break;
                }
                // worker can perform the task
                currMaxProfit = Math.max(task.profit, currMaxProfit);
                taskIndex++;
            }
            //System.out.println(tempIndex + " worker " + i + " profit " + currMaxProfit);
            maxProfit += currMaxProfit;
            //tempIndex++;
        }
        return maxProfit;
    }

    class Task {
        int difficulty;
        int profit;

        Task(int difficulty, int profit) {
            this.difficulty = difficulty;
            this.profit = profit;
        }
    }
}
