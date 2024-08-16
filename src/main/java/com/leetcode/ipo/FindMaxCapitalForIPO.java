package com.leetcode.ipo;

public class FindMaxCapitalForIPO extends AbstractParent {

    // time limit exceeded
    // k which is the max no of distinct tasks is <= profits/capital size
    int retMaxCap;
    @Override
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        retMaxCap = w;
        if (k > capital.length) {
            k = capital.length;
        }
        findMaximizedCapital(k, w, profits, capital, profits.length);
        return retMaxCap;
    }

    public void findMaximizedCapital(int k, int w, int[] profits, int[] capital, int length) {
        retMaxCap = Math.max(retMaxCap, w);
        int temp;
        for (int i = 0; i < length; i++ ) {
           if (w >= capital[i] && k > 0) {
               // either choose this and complete it or ignore it
               w += profits[i];
               temp = capital[i];
               capital[i] = Integer.MAX_VALUE;
               k -= 1;
               findMaximizedCapital(k, w, profits, capital, length);
               k += 1;
               capital[i] = temp;
               w -= profits[i];
           }
       }
    }
}
