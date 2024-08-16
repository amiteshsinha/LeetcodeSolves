package com.leetcode.isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings extends AbstractParent {

    /**
     * Runtime
     * 11
     * ms
     * Beats
     * 54.55%
     * of users with Java
     * Memory
     * 42.21
     * MB
     * Beats
     * 61.43%
     * of users with Java
     * @param s
     * @param t
     * @return
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
            } else if (tMap.containsKey(t.charAt(i))) {
                if (tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                tMap.put(t.charAt(i), s.charAt(i));
                sMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
