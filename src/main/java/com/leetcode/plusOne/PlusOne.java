package com.leetcode.plusOne;

public class PlusOne extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.51
     * MB
     * Beats
     * 73.27%
     * of users with Java
     *
     * If the 1st digit is not 9 then we can use the same arr else we create a new arr
     * @param digits
     * @return
     */
    @Override
    public int[] plusOne(int[] digits) {
        boolean isA9OnlyArr = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                isA9OnlyArr = false;
                break;
            }
        }
        int[] ans = isA9OnlyArr ? new int[digits.length + 1] : digits;
        int remainder = 1, curr;
        for (int i = digits.length - 1, j = ans.length - 1; j >= 0; i--, j--) {
            curr = (i >= 0) ? remainder + digits[i] : remainder;
            ans[j] =  curr%10;
            remainder = curr/10;
            if (remainder == 0) {
                break;
            }
        }
        return ans;
    }
}
