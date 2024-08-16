package com.leetcode.wordBreak;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakIter1Incorrect extends AbstractParent {

    /**
     * Incorrect approach
     * @param s
     * @param wordDict
     * @return
     */
    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, String> blankMap = new HashMap<>();
        for (String word : wordDict) {
            blankMap.put(word, word.replaceAll(".", " "));
        }
        String temp = s;
        for (int i = 0; i < wordDict.size(); i++) {
            temp = s;
            int j = i;
            do {
                temp = temp.replaceAll(wordDict.get(j), blankMap.get(wordDict.get(j)));
                temp = temp.trim();
                if (temp.isEmpty()) {
                    break;
                }
                j++;
                if (j == wordDict.size()) {
                    j = 0;
                }
            }
            while (j != i);
            if (temp.isEmpty()) {
                break;
            }
        }
        return temp.isEmpty();
    }
}
