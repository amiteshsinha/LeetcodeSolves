package com.leetcode.wordBreak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WordBreakFail extends AbstractParent {

    /**
     * Takes a lot of time for very long strings
     * @param s
     * @param wordDict
     * @return
     */
    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Set<Character> set = s.chars().mapToObj(e -> (char)e).collect(Collectors.toSet());
        Set<Character> dictSet = wordDict.stream().flatMap(d -> d.chars().mapToObj(e -> (char)e)).collect(Collectors.toSet());
        if (!dictSet.containsAll(set)){
            return false;
        }
        List<List<String>> wordList = new ArrayList<>();
        return getValidWordList(s, wordSet, 0, wordList, new ArrayList<String>());
    }

    private boolean getValidWordList(String s, Set<String> wordSet, int index, List<List<String>> wordList, ArrayList<String> tempList) {
        if (index >= s.length()) {
            wordList.add(new ArrayList<>(tempList));
            return true;
        }
        boolean isValid = false;
        for (int i = index; i < s.length(); i++) {
            String word = s.substring(index, i + 1);
            if (wordSet.contains(word)) {
                tempList.add(word);
                isValid = getValidWordList(s, wordSet, i + 1, wordList, tempList);
                if (isValid) {
                    break;
                }
                tempList.remove(tempList.size() - 1);
            }
        }
        return isValid;
    }
}
