package com.leetcode.xor.countTripletsOfXor;

public class CountTripletsThatCanFormArrOfEqualXor extends AbstractParent {

    // As per the question we need to divide the array into 2 halves between i, j ,k such that
    // arr[i]^arr[i+1].. arr[j-1] == arr[j]^arr[j+1]..arr[k]
    // also note that 0 <= i < j <= k < arr.length which means j can be equal to k so its just the number
    // xOR of a number with itself is 0

    /**
     * Runtime
     * 24
     * ms
     * Beats
     * 30.77%
     * of users with Java
     * Memory
     * 41.08
     * MB
     * Beats
     * 56.92%
     * of users with Java
     */
    @Override
    public int countTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0, b = 0;
            for (int m = i; m < arr.length; m++) {
                a = a ^ arr[m];
                b= 0;
                for (int n = m + 1; n < arr.length; n++) {
                    b = b ^ arr[n];
                    if (a == b) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

//    private void countTripletsFor(int[] arr, int i) {
//        if (i == arr.length) {
//            return;
//        }
//        int a = 0, b= 0;
//        for (int m = i; m < arr.length; m++) {
//            a = a ^ arr[m];
//            b= 0;
//            for (int n = m + 1; n < arr.length; n++) {
//                b = b ^ arr[n];
//                //&& !hashset.contains(i + "," + (m + 1) + "," + n)
//                if (a == b) {
//                    hashset.add(i + "," + (m + 1) + "," + n);
//                    System.out.println(i + "," + (m + 1) + "," + n + " : " + a);
//                    count++;
//                }
//            }
//        }
//        countTripletsFor(arr, i+ 1);
//    }
}
