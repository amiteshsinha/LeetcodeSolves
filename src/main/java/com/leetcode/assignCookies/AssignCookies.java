package com.leetcode.assignCookies;

import java.util.Arrays;

public class AssignCookies extends AbstractParent {
    /**
     * Assumption - the arrays are sorted
     * @param g
     * @param s
     * @return
     */
    @Override
    public int findContentChildren(int[] g, int[] s) {
        int max = 0, i = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            // found cookie match - assigning
         if (g[i] <= s[j]) {
             max++;
             i++;
             j++;
         } else if (g[i] > s[j]) {
             // greed is more - move j
             j++;
         }
        }
        return max;
    }
}
