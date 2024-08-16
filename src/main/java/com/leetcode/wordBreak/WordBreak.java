package com.leetcode.wordBreak;

import java.util.List;

public class WordBreak extends AbstractParent {

    String s;
    List<String> wordDict;
    Boolean[] subResponseArr;
    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 99.16%
     * of users with Java
     * Memory
     * 40.87
     * MB
     * Beats
     * 99.86%
     * of users with Java
     */
    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        subResponseArr = new Boolean[s.length()];
        this.s = s;
        this.wordDict = wordDict;
        return getValidWordList(0);
    }

    private boolean getValidWordList(int index) {
        if (index == s.length()) {
            return true;
        }
        if (subResponseArr[index] != null) {
            return subResponseArr[index];
        }
        for (int i = 0; i < wordDict.size(); ++i) {
            String word = wordDict.get(i);
            if (s.startsWith(word, index) && getValidWordList(index + word.length())) {
                return subResponseArr[index] = true;
            }
        }
        return subResponseArr[index] = false;
    }
}
