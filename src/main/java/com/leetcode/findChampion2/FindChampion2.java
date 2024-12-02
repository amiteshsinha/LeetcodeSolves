package com.leetcode.findChampion2;

import java.util.*;

/**
 * This file was created on 26/11/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class FindChampion2 extends AbstractParent {

    @Override
    public int findChampion(int n, int[][] edges) {
        if (n == 1) {
            return 0;
        }
        Set<Integer> distinctNodes = new HashSet<>();
        Map<Integer, List<Integer>> mapOfNodeEdges = new HashMap<>();
        for (int[] edge : edges) {
            distinctNodes.add(edge[0]);
            distinctNodes.add(edge[1]);
            mapOfNodeEdges.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
        }
        int count, temp, max = distinctNodes.size();
        int[] visited;
        Queue<Integer> list;
        for (int i = 0; i < n; i++) {
            if (mapOfNodeEdges.containsKey(i)) {
                count = 0;
                visited = new int[n + 1];
                list = new LinkedList<>();
                list.add(i);
                while (!list.isEmpty()) {
                    temp = list.poll();
                    count++;
                    if (visited[temp] > 0 ){
                        count += visited[temp];
                        if (count + list.size() == max) {
                            return i;
                        }
                    } else if (mapOfNodeEdges.containsKey(temp)) {
                        list.addAll(mapOfNodeEdges.get(temp));
                    }
                }
                if (count >= max) {
                    return i;
                } else {
                    visited[i] = count;
                }
            }
        }
        return -1;
    }

}
