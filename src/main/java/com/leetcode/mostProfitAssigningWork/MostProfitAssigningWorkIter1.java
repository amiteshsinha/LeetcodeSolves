package com.leetcode.mostProfitAssigningWork;

public class MostProfitAssigningWorkIter1 extends AbstractParent {

    /**
     * Runtime
     * 5
     * ms
     * Beats
     * 99.02%
     *
     * Memory
     * 45.88
     * MB
     * Beats
     * 31.08%
     *
     * @param difficulty
     * @param profit
     * @param worker
     * @return
     */
    @Override
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0, profitLength = profit.length, currMaxProfit = 0, maxDifficulty = 0;
        for (int i : difficulty) {
            maxDifficulty = Math.max(i, maxDifficulty);
        }
        int[] difficultProfit = new int[maxDifficulty + 1];
        for (int i = 0; i < profitLength; i++) { // same difficulty task can have different profits
            difficultProfit[difficulty[i]] = Math.max(profit[i], difficultProfit[difficulty[i]]);
        }
        for (int i = 0; i <= maxDifficulty; i++) {
            currMaxProfit = Math.max(difficultProfit[i], currMaxProfit);
            difficultProfit[i] = currMaxProfit;
        }
         //int tempIndex = 1;
        for (int i : worker) {
            if (i > maxDifficulty) {
                maxProfit += difficultProfit[maxDifficulty];
                //System.out.println(tempIndex + " worker " + i + " profit " + difficultProfit[maxDifficulty]);
            } else {
                //System.out.println(tempIndex + " worker " + i + " profit " + difficultProfit[i]);
                maxProfit += difficultProfit[i];
            }
            //tempIndex++;
        }
        return maxProfit;
    }
}
