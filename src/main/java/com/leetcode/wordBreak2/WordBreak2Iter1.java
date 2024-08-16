package com.leetcode.wordBreak2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak2Iter1 extends AbstractParent {
    Set<String> wordSet;
    List<String> wordList;
    List<String> tempList = new ArrayList<>();
    String s;

    @Override
    public List<String> wordBreak(String s, List<String> wordDict) {
        this.s = s;
        wordSet = new HashSet<>(wordDict);
        return new AbstractList<String>() {
            @Override
            public String get(int index) {
                init();
                return wordList.get(index);
            }

            @Override
            public int size() {
                init();
                return wordList.size();
            }
            public void init() {
                if (wordList != null) return;
                wordList = new ArrayList<String>();
                getValidWordList(0);
            }
        };
    }

    private void getValidWordList(int index) {
        if (index >= s.length()) {
            wordList.add(String.join(" ", tempList));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String word = s.substring(index, i + 1);
            if (wordSet.contains(word)) {
                tempList.add(word);
                getValidWordList(i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
