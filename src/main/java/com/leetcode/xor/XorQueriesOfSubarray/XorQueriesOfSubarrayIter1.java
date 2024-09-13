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
    public int[] xorQueries1(int[] arr, int[][] queries) {
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

    /**
     * Convert provided array to prefix array - better in terms of memory from previous approach
     * Runtime
     * 2
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 55.11
     * MB
     * Beats
     * 95.96%
     * @param arr
     * @param queries
     * @return
     */
    public int[] xorQueries(int[] arr, int[][] queries) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] ^= arr[i - 1];
        }
        int[] retArr = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            retArr[j] = (queries[j][0] > 0)  ? arr[queries[j][1]] ^ arr[queries[j][0] - 1] : arr[queries[j][1]];
        }
        return retArr;
    }
}
