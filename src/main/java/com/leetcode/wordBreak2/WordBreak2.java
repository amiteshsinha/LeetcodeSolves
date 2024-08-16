package com.leetcode.wordBreak2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak2 extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 94.29%
     * of users with Java
     * Memory
     * 41.95
     * MB
     * Beats
     * 18.81%
     * of users with Java
     * @param s
     * @param wordDict
     * @return
     */
    @Override
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        List<String> wordList = new ArrayList<>();
        getValidWordList(s, wordSet, 0, wordList, new ArrayList<String>());
        return wordList;
    }

    private void getValidWordList(String s, Set<String> wordSet, int index, List<String> wordList, ArrayList<String> tempList) {
        if (index >= s.length()) {
            wordList.add(String.join(" ", tempList));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String word = s.substring(index, i + 1);
            if (wordSet.contains(word)) {
                tempList.add(word);
                getValidWordList(s, wordSet, i + 1, wordList, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
