package com.leetcode.maxScoreRemovingSubstring;

public class MaxScoreRemovingSubstringIter2 extends AbstractParent {

    // ab is x points , ba is y points
    // start counting from left about count of a and b = if count is not zero for both then we can consume
    // them so if we get b first then a and we have
    @Override
    public int maximumGain(String s, int x, int y) {
        if (y > x) {
            return getScore(y, x, s, 'b','a');
        } else {
            return getScore(x, y, s, 'a', 'b');
        }
    }

    private int getScore(int x, int y, String s, char first, char second) {
        char c;
        int score = 0;
       char[] charArr = s.toCharArray();
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            c = charArr[i];
            if (stringBuilder.length() > 0 && c == second && stringBuilder.charAt(stringBuilder.length() - 1) == first) {
                 score +=x;
                 stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }else {
                stringBuilder.append(c);
            }
        }
        charArr = stringBuilder.toString().toCharArray();
        stringBuilder = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            c = charArr[i];
            if (stringBuilder.length() > 0 && c == first && stringBuilder.charAt(stringBuilder.length() - 1) == second) {
                score += y;
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }else {
                stringBuilder.append(c);
            }
        }
        return score;
    }
}

/**
 * if (charArr[i] == 'b' && !stack.isEmpty() && stack.peek() == 'a') {
 * stack.pop();
 * // stack had a and we are trying to put b
 * score += x;
 * } else if (charArr[i] == 'a' && !stack.isEmpty() && stack.peek() == 'b') {
 * stack.pop();
 * score += y;
 * } else {
 */