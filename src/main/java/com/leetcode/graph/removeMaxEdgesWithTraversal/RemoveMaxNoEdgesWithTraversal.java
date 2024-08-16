package com.leetcode.graph.removeMaxEdgesWithTraversal;

public class RemoveMaxNoEdgesWithTraversal extends AbstractParent {

    int count = 0;
    @Override
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        if (edges.length < n - 1) {
            return -1;
        }

        int[] aRouteCount = new int[n + 1];
        int[] bRouteCount = new int[n + 1];
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                aRouteCount[edge[1]]++;
                aRouteCount[edge[2]]++;
                bRouteCount[edge[1]]++;
                bRouteCount[edge[2]]++;
            } else if (edge[0] == 1) {
                aRouteCount[edge[1]]++;
                aRouteCount[edge[2]]++;
            } else {
                bRouteCount[edge[1]]++;
                bRouteCount[edge[2]]++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (aRouteCount[i] == 0 || bRouteCount[i] == 0) {
                return -1;
            }
        }
        for (int[] edge : edges) {
            if (edge[0] == 1 && aRouteCount[edge[1]] > 1 && aRouteCount[edge[2]] > 1) {
                count++;
                aRouteCount[edge[1]]--;
                aRouteCount[edge[2]]--;
            }
            if (edge[0] == 2 && bRouteCount[edge[1]] > 1 && bRouteCount[edge[2]] > 1) {
                count++;
                bRouteCount[edge[1]]--;
                bRouteCount[edge[2]]--;
            }
        }
        return count;
    }

    private void removeEdges(int[][] edges, int n,  int[] allowed) {


    }

    private boolean canTraverse(int[][] edges, int n, int k, int[] allowed) {
        int[] traversalArr = new int[n + 1];
        int pathType;
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            pathType = edge[0];
            if (allowed[i] == 0 && (pathType == k || pathType == 3)) {
                if (traversalArr[edge[2]] == 0) {
                    n--;
                    traversalArr[edge[2]] = 1;
                }
                if (traversalArr[edge[1]] == 0) {
                    n--;
                    traversalArr[edge[1]] = 1;
                }
                if (n == 0) {
                    return true;
                }
            }
        }
        return n == 0;
    }
}
