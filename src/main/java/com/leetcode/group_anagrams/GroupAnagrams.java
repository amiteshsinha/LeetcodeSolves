package com.leetcode.group_anagrams;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<List<String>> result = groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> aMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sortedString = new String(charArray);

            if (aMap.containsKey(sortedString)) {
                aMap.get(sortedString).add(str);
            } else {
                List<String> alist = new ArrayList<>();
                alist.add(str);
                aMap.put(sortedString, alist);
            }
        }
        return aMap.values().stream().collect(Collectors.toList());
    }


}
