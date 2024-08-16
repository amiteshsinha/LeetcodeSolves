package com.leetcode.maxScoreRemovingSubstring;

public class MaxScoreRemovingSubstring extends AbstractParent {
    // time limit exceeded
    // ab is x points , ba is y points
    @Override
    public int maximumGain(String s, int x, int y) {
        int score = 0, currLength ;
        while (s.contains("ba") || s.contains("ab")) {
            currLength = s.length();
            if (x > y) {
                if (s.contains("ab")) {
                    s = s.replaceAll("ab", "");
                    score += x * (currLength - s.length()) / 2;
                    currLength = s.length();
                } else if (s.contains("ba")) {
                    s = s.replaceAll("ba", "");
                    score += y*(currLength - s.length())/2;
                }
            } else {
                if (s.contains("ba")) {
                    s = s.replaceAll("ba", "");
                    score += y * (currLength - s.length()) / 2;
                    currLength = s.length();
                } else if (s.contains("ab")) {
                    s = s.replaceAll("ab", "");
                    score += x*(currLength - s.length())/2;
                }
            }
        }
        return score;
    }
}
