package com.leetcode.uncommonWordsFrom2Sentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

public class UncommonWord2Sentences extends AbstractParent {

    /**
     * Runtime
     * 7
     * ms
     * Beats
     * 8.11%
     *
     * Memory
     * 42.46
     * MB
     * Beats
     * 9.48%
     * @param s1
     * @param s2
     * @return
     */
    //A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
    @Override
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Words = s1.split(" ");
        Map<String, Long> s1WordMap = new HashMap<>(of(s1Words).collect(groupingBy(identity(), counting())));
        String[] s2Words = s2.split(" ");
        Map<String, Long> s2WordMap = new HashMap<>(of(s2Words).collect(groupingBy(identity(), counting())));
        List<String> wordList = new ArrayList<>();
        for (String word : s2WordMap.keySet()) {
            if (!s1WordMap.containsKey(word)) {
                if (s2WordMap.get(word) == 1) {
                    wordList.add(word);
                }
            } else {
                s1WordMap.remove(word);
                //s2WordMap.put(word, -1L);
            }
        }
        for (String word : s1WordMap.keySet()) {
            if (s1WordMap.get(word) == 1) {
                wordList.add(word);
            }
        }
        return wordList.toArray(new String[wordList.size()]);
    }
}
