package com.leetcode.topKfrequentWords;

import java.util.*;

public class TopKFrequentWordsUsingPriorityQueue extends TopKFreqWordsAbstract {

    @Override
    List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> queue = new PriorityQueue<>((w1, w2) -> count.get(w1).equals(count.get(w2))
                ? w2.compareTo(w1) : count.get(w1) - count.get(w2));
        for (String word : count.keySet()) {
            queue.offer(word);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<String> ans = new ArrayList();
        while (!queue.isEmpty()) ans.add(queue.poll());
        Collections.reverse(ans);
        return ans;
    }
}
