package com.leetcode.noComplement;

public class NumberComplement extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 26.96%
     * Analyze Complexity
     * Memory
     * 40.15
     * MB
     * Beats
     * 80.96%
     * @param num
     * @return
     */
    @Override
    public int findComplement(int num) {
        char[] arr = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                arr[i] = '0';
            } else {
                arr[i] = '1';
            }
        }
        return Integer.valueOf(new String(arr), 2);
    }
}
