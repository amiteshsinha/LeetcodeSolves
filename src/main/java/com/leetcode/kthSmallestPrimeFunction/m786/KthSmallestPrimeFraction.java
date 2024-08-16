package com.leetcode.kthSmallestPrimeFunction.m786;

import com.amitesh.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KthSmallestPrimeFraction extends AbstractParent {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,11};
        int length = arr.length;
        int max = length*(length - 1)/2;
        double[] fractArr = new double[max];
        Map<Double, Pair> map = new HashMap<>();
        int d = 0;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                double fraction = (double)arr[i] / arr[j];
                map.put(fraction, Pair.Of(arr[i], arr[j]));
                System.out.println(arr[i] + "/" + arr[j] + ": " + fraction);
                fractArr[d] = fraction;
                d++;
            }
        }
        Arrays.sort(fractArr);
        int k = 1;
        while (k <= max) {
            double p = fractArr[k - 1];
            System.out.println(k + ": " + p + " : " + map.get(p));
            k++;
        }
    }


    @Override
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        if (arr.length == 2) {
            return arr;
        }
        int length = arr.length;
        int max = length*(length - 1)/2;
        double[] fractArr = new double[max];
        Map<Double, int[]> map = new HashMap<>();
        double fraction = 0;
        int d = 0;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                 fraction = (double)arr[i]/arr[j];
                map.put(fraction, new int[]{arr[i], arr[j]});
                fractArr[d] = fraction;
                d++;
            }
        }
        Arrays.sort(fractArr);
        return map.get(fractArr[k - 1]);
    }
}
