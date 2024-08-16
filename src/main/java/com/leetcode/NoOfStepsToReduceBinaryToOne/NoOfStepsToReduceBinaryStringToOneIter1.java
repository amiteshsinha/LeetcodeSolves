package com.leetcode.NoOfStepsToReduceBinaryToOne;

public class NoOfStepsToReduceBinaryStringToOneIter1 extends AbstractParent {

    // 10 to 31
//    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        boolean isLess;
//        for (int i = 10; i < 500; i++) {
//            int k = (int)Math.pow(2, i);
//            isLess = k < Integer.MAX_VALUE;
//            String s = Integer.toBinaryString(k);
//            System.out.println(i + " : " + k + " : binary : " + s + " : " + isLess);
//            if (!isLess) {
//                break;
//            }
//        }
//    }

    static int[] maxArr = new int[10001];
    static {
        maxArr[1] = 0;
        maxArr[2] = 1;
        maxArr[4] = 2;
        for (int i = 3; i < 10000; i++) {
            if (maxArr[i] == 0) {
                if (i % 2 == 0) {
                    maxArr[i] = maxArr[i / 2] + 1;
                } else {
                    maxArr[i] = maxArr[i + 1] + 1;
                }
            }
            if (2*i <= 10000) {
                maxArr[2*i] = maxArr[i] + 1;
            }
            System.out.println(i + " : binary string : " + Integer.toBinaryString(i) + " : steps : " + maxArr[i]);
        }
    }
    /**
     */
    @Override
    public int numSteps(String s) {
        int retVal = 0;
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() != 1) {
            if (sb.length() >= 31) {
                // divide by 2
                if (sb.charAt(sb.length() - 1) == '0') {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    StringBuilder temp = new StringBuilder("0");
                    int i = sb.length() - 2, carry = 1;
                    while (i >= 0 || carry == 1) {
                        carry += (i >= 0) ? sb.charAt(i--) - '0' : 0;
                        temp.append(carry % 2);
                        carry = carry / 2;
                    }
                    sb = temp.reverse();
                }
                retVal++;
            } else {
                int k = Integer.parseInt(sb.toString(), 2);
                int[] maxArr = new int[k + 1];
                maxArr[1] = 0;
                maxArr[2] = 1;
                maxArr[4] = 2;
                for (int i = 3; i < k; i++) {
                    if (maxArr[i] == 0) {
                        if (i % 2 == 0) {
                            maxArr[i] = maxArr[i / 2] + 1;
                        } else {
                            maxArr[i] = maxArr[i + 1] + 1;
                        }
                    }
                    if (2*i <= k) {
                        maxArr[2*i] = maxArr[i] + 1;
                    }
                    if (maxArr[k] != 0) {
                        return retVal + maxArr[k];
                    }
                }
                return retVal + maxArr[k];
            }
        }
        return retVal;
    }
}
