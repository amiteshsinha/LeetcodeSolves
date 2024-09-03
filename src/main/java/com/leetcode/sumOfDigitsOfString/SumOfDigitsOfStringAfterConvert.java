package com.leetcode.sumOfDigitsOfString;

public class SumOfDigitsOfStringAfterConvert extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 41.29
     * MB
     * Beats
     * 96.58%
     * @param s
     * @param k
     * @return
     */
    @Override
    public int getLucky(String s, int k) {
        int temp, retVal = 0;
        for (char c : s.toCharArray()) {
            temp = c - 'a' + 1;
            if (temp > 9) {
                temp = getSumOfDigits(temp);
            }
            retVal += temp;
        }
        while (k > 1) {
            retVal = getSumOfDigits(retVal);
            k--;
        }
        return retVal;
    }

    private int getSumOfDigits(int retVal) {
        int temp = 0, remainder = 0;
        while (retVal > 9) {
            remainder = retVal % 10;
            retVal /= 10;
            temp += remainder;
        }
        temp += retVal;
        return temp;
    }
}
