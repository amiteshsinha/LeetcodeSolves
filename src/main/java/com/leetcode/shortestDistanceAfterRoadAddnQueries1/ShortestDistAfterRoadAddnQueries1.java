package com.leetcode.shortestDistanceAfterRoadAddnQueries1;

/**
 * This file was created on 27/11/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class ShortestDistAfterRoadAddnQueries1 extends AbstractParent {

    @Override
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int [] retArr = new int[queries.length];
        int[] nodeArr = new int[n];
        for (int i = 1; i < n;i++) {
            nodeArr[i] = 1 + nodeArr[i - 1];
        }
        int currMax = n - 1;
        for (int i = 0;i < queries.length; i++) {
            int[] query = queries[i];
            nodeArr[query[1]] = Math.min(nodeArr[query[1]], nodeArr[query[0]] + 1);
            retArr[i] = nodeArr[n - 1];
        }
        return retArr;
    }

}
