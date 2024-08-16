package com.leetcode.xor.countTripletsOfXor;

public class CountTripletsThatCanFormArrOfEqualXorIter1 extends AbstractParent {

    // As per the question we need to divide the array into 2 halves between i, j ,k such that
    // arr[i]^arr[i+1].. arr[j-1] == arr[j]^arr[j+1]..arr[k]
    // also note that 0 <= i < j <= k < arr.length which means j can be equal to k so its just the number
    // xOR of a number with itself is 0

    /**
     * a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
     * b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
     *
     * Assume a == b, thus
     * a ^ a = b ^ a, thus
     * 0 = b ^ a, thus
     * arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1] ^ arr[j] ^ arr[j + 1] ^ ... ^ arr[k] = 0
     * For all pairs of i and k, where arr[i] ^ arr[i + 1] ^ ... ^ arr[k] = 0, then any j (i < j <= k) will be good to set as the answer
     * Hence we count number of js when xor is 0
     */
    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 40.92
     * MB
     * Beats
     * 68.72%
     * of users with Java
     */
    @Override
    public int countTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            for (int m = i; m < arr.length; m++) {
                a = a ^ arr[m];
                if (a == 0) {
                    count += (m - i);
                }
            }
        }
        return count;
    }
}
