package com.leetcode.NoOfFlowersInFullBloom;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NoOfFlowersFullBloom extends AbstractParent {
    //todo - fix this
    @Override
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        Arrays.sort(flowers, (a,b) -> a[0] - b[0]);
        Deque<FlowerPeriod> flowerPeriodQueue = new ArrayDeque<>();
        for (int[] flowerBloomPeriod : flowers) {
            if (flowerPeriodQueue.isEmpty() || flowerPeriodQueue.peekLast().end < flowerBloomPeriod[0]) {
                FlowerPeriod flowerPeriod = new FlowerPeriod(flowerBloomPeriod[0], flowerBloomPeriod[1], 1);
                flowerPeriodQueue.offerLast(flowerPeriod);
            } else {
                FlowerPeriod currflowerPeriod = flowerPeriodQueue.pollLast();
                int temp = currflowerPeriod.end;
                currflowerPeriod.end = flowerBloomPeriod[0] - 1;

            }
        }
        return null;
    }

    class FlowerPeriod {
        int start;
        int end;
        int count;
        FlowerPeriod (int start, int end, int count) {
            this.start = start;
            this.end = end;
            this.count = count;
        }
    }
}
