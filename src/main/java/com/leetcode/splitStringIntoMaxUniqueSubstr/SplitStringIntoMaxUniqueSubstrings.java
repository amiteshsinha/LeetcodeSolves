package com.leetcode.splitStringIntoMaxUniqueSubstr;

import java.util.HashSet;
import java.util.Set;

/**
 * This file was created on 21/10/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class SplitStringIntoMaxUniqueSubstrings extends AbstractParent {

    @Override
    public int maxUniqueSplit(String s) {
        Set<String> uniqueSubstrSet = new HashSet<>();
        return getMaxUniqueSplit(s, 0, uniqueSubstrSet);
    }

    private int getMaxUniqueSplit(String s, int start, Set<String> uniqueSubstrSet) {
        String temp;
        int val = 0;
        for (int i = start; i < s.length(); i++) {
            temp = s.substring(start, i + 1);
            if (!uniqueSubstrSet.contains(temp)) {
                uniqueSubstrSet.add(temp);
                val = getMaxUniqueSplit(s, i + 1, uniqueSubstrSet);
                uniqueSubstrSet.remove(temp);
            }
            val = Math.max(val, getMaxUniqueSplit(s, i + 1, uniqueSubstrSet));
        }
        return val;
    }

}
