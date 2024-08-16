package com.leetcode.topKfrequentWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFreqWordsModApproach extends TopKFreqWordsAbstract {

    @Override
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mapOfWordAndFrequency = new HashMap<>();


        for(String word : words) {
            mapOfWordAndFrequency.put(word, mapOfWordAndFrequency.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(mapOfWordAndFrequency.entrySet());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        List<String> wordList = new ArrayList<>(mapOfWordAndFrequency.keySet());
        wordList.sort((w1, w2) -> mapOfWordAndFrequency.get(w1).equals(mapOfWordAndFrequency.get(w2))
                ? w1.compareTo(w2) : mapOfWordAndFrequency.get(w2) - mapOfWordAndFrequency.get(w1));
        return wordList.subList(0, k);
    }
}
