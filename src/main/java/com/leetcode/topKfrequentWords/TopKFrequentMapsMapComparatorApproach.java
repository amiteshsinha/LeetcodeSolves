package com.leetcode.topKfrequentWords;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

public class TopKFrequentMapsMapComparatorApproach extends TopKFreqWordsAbstract {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Long> freqMap = of(words).collect(groupingBy(identity(), counting()));

        final Comparator<Map.Entry<String, Long>> valueComparator = comparingByValue(Comparator.reverseOrder());
        return new LinkedList<>(freqMap.entrySet().stream()
                .sorted(valueComparator.thenComparing(comparingByKey()))
                .limit(k)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new)).keySet());
    }
}
