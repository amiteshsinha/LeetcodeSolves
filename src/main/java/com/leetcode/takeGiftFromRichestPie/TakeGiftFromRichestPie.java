package com.leetcode.takeGiftFromRichestPie;

import java.util.Arrays;

/**
 * Runtime
 * 28
 * ms
 * Beats
 * 5.76%
 *
 * Memory
 * 44.97
 * MB
 * Beats
 * 5.05%
 * This file was created on 12/12/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public class TakeGiftFromRichestPie extends AbstractParent {

    @Override
    public long pickGifts(int[] gifts, int k) {
        long retVal = 0;
        double temp;
        int[] tempArr = gifts.clone();
        for (int i = 0; i < k; i++) {
            Arrays.sort(gifts);
            temp = Math.floor(Math.sqrt(gifts[gifts.length - 1]));
            gifts[gifts.length - 1] = (int)temp;
            if (Arrays.equals(tempArr, gifts)) {
                break;
            } else {
                tempArr = gifts.clone();
            }
        }
        for (int x : gifts) {
            retVal += x;
        }
        return retVal;
    }

}
