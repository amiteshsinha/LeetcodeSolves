package com.leetcode.addBinary;

public class AddBinary extends AbstractParent {

    public static void main(String[] args) {
        System.out.println("& List");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + "&" + j + " : " + (i & j));
            }
        }
        System.out.println("^ List");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + "^" + j + " : " + (i ^ j));
            }
        }
        System.out.println("| List");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + "|" + j + " : " + (i | j));
            }
        }
    }

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 42.07
     * MB
     * Beats
     * 64.25%
     * of users with Java
     * @param a
     * @param b
     * @return
     */
    @Override
    public String addBinary(String a, String b) {
       // Only works for smaller numbers not huge ones
       // return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        int i = a.length() - 1, j = b.length() - 1, k = Math.max(i, j), aBit = 0, bBit = 0, remainder = 0, curr = 0;
        StringBuilder retVal = new StringBuilder();
        while (k >= 0) {
            aBit =  (i >= 0) ? a.charAt(i) - '0': 0;
            bBit =  (j >= 0) ? b.charAt(j) - '0': 0;
            curr = remainder ^ aBit ^ bBit;
            retVal.append(curr);
            remainder = ((aBit | bBit) == 1 && remainder == 1) || ((aBit & bBit) == 1 && remainder == 0) ? 1 : 0 ;
            i--;
            j--;
            k--;
        }
        if (remainder == 1) {
            retVal.append(remainder);
        }
        return retVal.reverse().toString();
    }
}
