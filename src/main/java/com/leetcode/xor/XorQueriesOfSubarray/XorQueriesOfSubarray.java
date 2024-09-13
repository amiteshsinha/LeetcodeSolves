package com.leetcode.xor.XorQueriesOfSubarray;

public class XorQueriesOfSubarray extends AbstractParent {

    @Override
    public int[] xorQueries(int[] arr, int[][] queries) {
        int i,j;
        int[] retArr = new int[queries.length];
        for (j = 0; j < queries.length; j++) {
            int[] query = queries[j];
            for (i = query[0]; i <= query[1]; i++) {
                retArr[j] ^= arr[i];
            }
        }
        return retArr;
    }
}
