package com.leetcode.minBitFlitsConvertNo;

public class MinBitFlitsToConvertNo extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 6.95%
     *
     * Memory
     * 40.55
     * MB
     * Beats
     * 35.00%
     * @param start
     * @param goal
     * @return
     */
    @Override
    public int minBitFlips(int start, int goal) {
        String startStr = getBinaryString(start);
        String endStr = getBinaryString(goal);
        return (startStr.length() > endStr.length()) ? 
                getMinBitFlips(startStr, endStr) : getMinBitFlips(endStr, startStr);
    }

    private String getBinaryString(int start) {
        return Integer.toBinaryString(start);
    }

    private int getMinBitFlips(String start, String end) {
        int retVal = 0;
        // start is always bigger than end
        int startlen = start.length(), endlen = end.length(), i = 0, j = 0;
        while (startlen - i != endlen) {
            if (start.charAt(i) == '1') {
                retVal++;
            }
            i++;
        }
        while (i != startlen) {
            if (start.charAt(i) != end.charAt(j)) {
                retVal++;
            }
            i++;
            j++;
        }
        return retVal;
    }
}
