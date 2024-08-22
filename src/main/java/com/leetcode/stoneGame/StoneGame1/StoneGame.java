package com.leetcode.stoneGame.StoneGame1;

import java.util.Arrays;

/**
 * time limit exceededd
 */
public class StoneGame extends AbstractParent {

    @Override
    public boolean stoneGame(int[] piles) {
        int sum = Arrays.stream(piles).sum();
        return getMaxSum(piles,sum/2, 0, 0, true, 0, piles.length - 1);
    }

    private boolean getMaxSum(int[] piles, int limit, int AliceCurrSum, int BobCurrSum, boolean isAliceTurn, int left, int right) {
        // when its alice's turn we assume that she picks
        if (left == right - 1) {
            return (AliceCurrSum + Math.max(piles[left], piles[right]) > limit);
        }
        if (isAliceTurn) {
            return getMaxSum(piles, limit, AliceCurrSum + piles[left], BobCurrSum, false, left + 1, right) ||
             getMaxSum(piles,limit, AliceCurrSum + piles[right], BobCurrSum, false, left, right - 1);
        } else {
            return getMaxSum(piles, limit, AliceCurrSum, BobCurrSum + piles[left], true, left + 1, right) ||
             getMaxSum(piles, limit, AliceCurrSum, BobCurrSum + piles[right], true, left, right - 1);
        }
    }
}
