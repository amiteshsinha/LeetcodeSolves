package com.leetcode.isomorphicStrings;

public class IsomorphicStringsIter2 extends AbstractParent {

    /**
     */
    @Override
    public boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[129];
        int[] tMap = new int[129];
        for (int i = 0; i < t.length();i++) {
            if (sMap[s.charAt(i)] != tMap[t.charAt(i)]) {
                return false;
            }
            tMap[t.charAt(i)] = i + 1;
            sMap[s.charAt(i)] = i + 1;
        }
        return true;
    }
}
