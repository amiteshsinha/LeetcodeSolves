package com.leetcode.takeGiftFromRichestPie;

import java.util.Arrays;

/**
 *
 * This file was created on 12/12/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public class TakeGiftFromRichestPieIter1 extends AbstractParent {

    @Override
    public long pickGifts(int[] gifts, int k) {
        long retVal = 0;
        int index, tempVal;
        double temp;
        for (int i = 0; i < k; i++) {
            index = getMaxOfGifts(gifts);
            tempVal = gifts[index];
            temp = Math.floor(Math.sqrt(gifts[index]));
            gifts[index] = (int)temp;
            if (tempVal == gifts[index]) {
                break;
            }
        }
        for (int x : gifts) {
            retVal += x;
        }
        return retVal;
    }

    private int getMaxOfGifts(int[] gifts) {
        int max = 0, index = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] > max) {
                max = gifts[i];
                index = i;
            }
        }
        return index;
    }

}
