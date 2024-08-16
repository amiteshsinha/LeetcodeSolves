package com.leetcode.graph.removeMaxEdgesWithTraversal;

public class RemoveMaxNoEdgesWithTraversalWorking extends AbstractParent {

    int reqdEdge;
    @Override
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind a = new UnionFind(n);
        UnionFind b = new UnionFind(n);
        // boolean aUnite, bUnite;
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                // here we use bitwise OR instead of normal OR because normal OR has a circuit breaker - if 1st param is true - 2nd is not evaluated.
                // We need to run Unite for both a and b. Hence - the following can be written as
//                aUnite = a.unite(edge[1], edge[2]);
//                bUnite = b.unite(edge[1], edge[2]);
//                if (aUnite || bUnite) {
//                    reqdEdge++;
//                }
                if (a.unite(edge[1], edge[2]) | b.unite(edge[1], edge[2])) {
                   reqdEdge++;
                }
            }
        }
        for (int[] edge : edges) {
            if (edge[0] == 1 && a.unite(edge[1], edge[2])) {
                reqdEdge++;
            } else if (edge[0] == 2 && b.unite(edge[1], edge[2])) {
                reqdEdge++;
            }
        }
        return (a.united() && b.united()) ? edges.length - reqdEdge : -1;
    }

    class UnionFind {
        int[] component;
        int distinctComponents;

        public UnionFind(int n) {
            component = new int[n+1];
            for (int i = 0; i <= n; i++) {
                component[i] = i;
            }
            distinctComponents = n;
        }

        private boolean unite(int a, int b) {
            if (findComponent(a) != findComponent(b)) {
                component[findComponent(a)] = b;
                distinctComponents--;
                return true;
            }

            return false;
        }

        private int findComponent(int a) {
            if (component[a] != a) {
                component[a] = findComponent(component[a]);
            }
            return component[a];
        }

        private boolean united() {
            return distinctComponents == 1;
        }

    }
}
