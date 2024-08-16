package com.leetcode.pairwiseANDsum;

import static java.lang.String.format;

public class PairwiseANDSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int d = arr[i] & arr[j];
                System.out.println(format("and of %d and %d is : %d", arr[i], arr[j], d));
                k += d;
            }
        }
        System.out.println(k);
    }
}
