package com.leetcode.topKfrequentWords;

import java.util.*;

public class TopKFrequentWordsMyOrgApproach extends TopKFreqWordsAbstract {

    @Override
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mapOfWordAndFrequency = new HashMap<>();
        for(String word : words) {
            if (mapOfWordAndFrequency.containsKey(word)) {
                mapOfWordAndFrequency.put(word, mapOfWordAndFrequency.get(word) + 1);
            } else {
                mapOfWordAndFrequency.put(word, 1);
            }
        }
        List<FrequencyNode> frequencyNodeList = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : mapOfWordAndFrequency.entrySet()) {
            FrequencyNode frequencyNode = new FrequencyNode(entry.getKey(), entry.getValue());
            frequencyNodeList.add(frequencyNode);
        }
        frequencyNodeList.sort(Comparator.comparing(FrequencyNode::getFrequency, Comparator.reverseOrder())
                .thenComparing(FrequencyNode::getWord));
        List<String> returnList = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            returnList.add(frequencyNodeList.get(i).getWord());
        }
        return returnList;
    }

    class FrequencyNode {
        String word;
        int frequency;

        public FrequencyNode(String word, int frequency) {
            this.word = word;
            this.frequency = frequency;
        }

        public String getWord() {
            return word;
        }

        public int getFrequency() {
            return frequency;
        }
    }

}
