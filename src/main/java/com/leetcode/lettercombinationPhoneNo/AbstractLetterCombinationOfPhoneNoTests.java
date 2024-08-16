package com.leetcode.lettercombinationPhoneNo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractLetterCombinationOfPhoneNoTests {

    protected static Map<Integer, List<String>> initialMap;

    static {
        initialMap = new HashMap<>();
        initialMap.put(2, Arrays.asList("a", "b", "c"));
        initialMap.put(3, Arrays.asList("d", "e", "f"));
        initialMap.put(4, Arrays.asList("g", "h", "i"));
        initialMap.put(5, Arrays.asList("j", "k", "l"));
        initialMap.put(6, Arrays.asList("m", "n", "o"));
        initialMap.put(7, Arrays.asList("p", "q", "r", "s"));
        initialMap.put(8, Arrays.asList("t", "u", "v"));
        initialMap.put(9, Arrays.asList("w", "x", "y", "z"));
    }

    abstract public List<String> getAllCombinationsOfPhoneNo(String input);

    @Test
    public void should_return_correct_list_of_words() {
        assert(getAllCombinationsOfPhoneNo("2").containsAll(Arrays.asList("a","b","c")));
    }

    @Test
    public void should_return_correct_list_of_words_2() {
        assert(getAllCombinationsOfPhoneNo("").isEmpty());
    }

    @Test
    public void should_return_correct_list_of_words_4() {
        assert(getAllCombinationsOfPhoneNo("23").containsAll(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf")));
    }



}
