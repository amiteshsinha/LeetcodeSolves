package com.leetcode.xor.XorQueriesOfSubarray;

public class XorQueriesOfSubarrayIter1 extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 55.72
     * MB
     * Beats
     * 82.94%
     * @param arr
     * @param queries
     * @return
     */
    @Override
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXorQueryArr = new int[arr.length + 1];
        int i,j;
        for (i = 1; i <= arr.length; i++) {
            prefixXorQueryArr[i] = arr[i - 1]^prefixXorQueryArr[i - 1];
        }
        int[] retArr = new int[queries.length];
        for (j = 0; j < queries.length; j++) {
            int[] query = queries[j];
            retArr[j] = prefixXorQueryArr[query[1] + 1]^prefixXorQueryArr[query[0]];
        }
        return retArr;
    }
}
