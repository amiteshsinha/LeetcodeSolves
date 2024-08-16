package com.leetcode.lastStoneWeight;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class LastStoneWeight {

    private static int lastStoneWeight(int[] stones) {
        return lastStoneWeight3(stones);
    }

    private static int lastStoneWeight3(int[] stones) {
        List<Integer> integerList = new ArrayList<>();
        for(int i = stones.length-1; i >= 0 ; i--)
        {
            if(i != 0){
                Arrays.sort(stones);
                stones[i-1] =  stones[i] - stones[i-1];
            }else{
                return stones[i];
            }
        }
        return 0;
    }

    /**
     * Approach 2 is better in response time than 1 even though both are O(nlogn)
     * @param stones
     * @return
     */
    private static int lastStoneWeight2(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        while (stones.length > 1) {
            int maxIndex = stones.length - 1;
            Arrays.sort(stones);
            int i = stones[maxIndex];
            stones[maxIndex] = 0;
            maxIndex--;
            if (stones[maxIndex] == 0) {
                return i;
            } else if (i == 0) {
                return 0;
            } else {
                int k = stones[maxIndex];
                stones[maxIndex] = 0;
                if (i != k) {
                    stones[maxIndex] = i - k;
                }
            }
        }
        return 0;
    }

    private static int lastStoneWeight1(int[] stones) {
        PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        reversePriorityQueue.addAll(Arrays.stream(stones).boxed().collect(Collectors.toList()));
        while (reversePriorityQueue.size() > 1) {
            int i = reversePriorityQueue.poll();
            int k = reversePriorityQueue.poll();
            System.out.println(i + " " + k);
            if (i != k) {
                reversePriorityQueue.offer(i - k);
            }
            System.out.println(reversePriorityQueue);
        }
        return (reversePriorityQueue.isEmpty()) ? 0 : reversePriorityQueue.poll();
    }

    @Test
    public void should_return_correct_result1() {
        assert (lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}) == 1);
    }

    @Test
    public void should_return_correct_result2() {
        assert (lastStoneWeight(new int[]{1}) == 1);
    }

    @Test
    public void should_return_correct_result3() {
        assert (lastStoneWeight(new int[]{3, 3}) == 0);
    }

    @Test
    public void should_return_correct_result6() {
        assert (lastStoneWeight(new int[]{1,2,3,5,8,13}) == 0);
    }

    @Test
    public void should_return_correct_result4() {
        assert (lastStoneWeight(new int[]{5, 6, 7, 8, 9}) == 3);
    }

    @Test
    public void should_return_correct_result5() {
        assert (lastStoneWeight(new int[]{4, 5, 6, 7, 8, 9}) == 1);
    }
}
