package com.leetcode.isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringsIter1 extends AbstractParent {

    /**
     * Runtime
     * 20
     * ms
     * Beats
     * 14.54%
     * of users with Java
     * Memory
     * 42.34
     * MB
     * Beats
     * 45.48%
     * of users with Java
     */
    @Override
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < t.length();i++) {
            if (sMap.containsKey(s.charAt(i))) {
                if (sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                sMap.put(s.charAt(i), t.charAt(i));
            }
            if (tMap.containsKey(t.charAt(i))) {
                if (tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                tMap.put(t.charAt(i), s.charAt(i));

            }
        }
        return true;
    }
}
