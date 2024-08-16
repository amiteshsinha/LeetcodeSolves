package com.leetcode.bestBuyStock;

public class BestBuyStock extends AbstractParent {

    /**
     * Timelimit exceeded
     * @param stockArray
     * @return
     */
    public int getMaxProfix(int[] stockArray) {
        int retVal = 0;
        for (int i = 0; i < stockArray.length; i++) {
            for (int j = i + 1; j < stockArray.length; j++) {
                if (stockArray[j] - stockArray[i] > retVal) {
                    retVal = stockArray[j] - stockArray[i];
                }
            }
        }
        return retVal;
    }
}
