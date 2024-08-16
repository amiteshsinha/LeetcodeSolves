package com.leetcode.scoreOfAString;

public class ScoreOfAString extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 99.87%
     * of users with Java
     * Memory
     * 41.52
     * MB
     * Beats
     * 94.65%
     * of users with Java
     * @param s
     * @return
     */
    @Override
    public int scoreOfString(String s) {
        int length = s.length() - 1;
        int score = 0;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < length; i++) {
            score += Math.abs(charArr[i] - charArr[i + 1]);
        }
        return score;
    }
}
