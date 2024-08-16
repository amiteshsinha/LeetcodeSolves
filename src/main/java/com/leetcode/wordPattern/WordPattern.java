package com.leetcode.wordPattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 41.30
     * MB
     * Beats
     * 35.43%
     * @param pattern
     * @param s
     * @return
     */
    @Override
    public boolean wordPattern(String pattern, String s) {
        String[] patternArr = new String[26];
        Map<String, Character> wordCharMap = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        int index;
        for (int i = 0; i < words.length; i++) {
            index = pattern.charAt(i) - 'a';
            if (patternArr[index] != null) {
                if (!patternArr[index].equals(words[i])) {
                    return false;
                }
            } else{
                patternArr[index] = words[i];
            }
            if (wordCharMap.containsKey(words[i])) {
                if (wordCharMap.get(words[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                wordCharMap.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
