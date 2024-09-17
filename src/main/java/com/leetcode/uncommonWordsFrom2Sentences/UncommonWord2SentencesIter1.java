package com.leetcode.uncommonWordsFrom2Sentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

public class UncommonWord2SentencesIter1 extends AbstractParent {

    /**
     * 2
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 41.62
     * MB
     * Beats
     * 96.72%
     * much better approach - merge all word counts into a map and only return those for which count is 1
     * @param s1
     * @param s2
     * @return
     */
    //A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
    @Override
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Words = s1.split(" ");
        String[] s2Words = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        List<String> wordList = new ArrayList<>();
        for (String word : s1Words) {
            map.put(word, map.getOrDefault(word, 0)  + 1);
        }
        for (String word : s2Words) {
            map.put(word, map.getOrDefault(word, 0)  + 1);
        }
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                wordList.add(word);
            }
        }
        return wordList.toArray(new String[wordList.size()]);
    }
}
