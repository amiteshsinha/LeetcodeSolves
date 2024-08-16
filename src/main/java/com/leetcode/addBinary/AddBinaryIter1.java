package com.leetcode.addBinary;

public class AddBinaryIter1 extends AbstractParent {


    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.86
     * MB
     * Beats
     * 86.06%
     * of users with Java
     * @param a
     * @param b
     * @return
     */
    @Override
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder retVal = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            carry += (i >= 0) ? a.charAt(i--) - '0' : 0;
            carry += (j >= 0) ? b.charAt(j--) - '0' : 0;
            retVal.append(carry % 2);
            carry = carry / 2;
        }
        return retVal.reverse().toString();
    }
}
