package com.leetcode.topKfrequentWords;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public abstract class TopKFreqWordsAbstract {

    abstract List<String> topKFrequent(String[] words, int k);

    @Test
    public void should_return_correct_list1() {
        assert(topKFrequent(new String[]{"i", "love", "levi", "i", "love", "coding"}, 3)
                .equals(Arrays.asList("i", "love", "coding")));
    }

    @Test
    public void should_return_correct_list2() {
        assert(topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4)
                .equals(Arrays.asList("the", "is", "sunny", "day")));
    }
}
