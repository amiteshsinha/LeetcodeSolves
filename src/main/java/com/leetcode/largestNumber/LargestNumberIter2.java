package com.leetcode.largestNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Runtime
 * 3
 * ms
 * Beats
 * 99.36%
 *
 * Memory
 * 41.70
 * MB
 * Beats
 * 99.57%
 */
public class LargestNumberIter2 extends AbstractParent {

    Comparator<String> customComp = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            int minLength = (s1.length() > s2.length()) ? s2.length() : s1.length();
            for (int i = 0; i < minLength; i++) {
                if (s1.charAt(i) > s2.charAt(i)) {
                    return -1;
                } else if (s1.charAt(i) < s2.charAt(i)) {
                    return 1;
                }
            }
            if (s2.length() > s1.length()) {
                return compare(s1, s2.substring(minLength));
            } else if (s2.length() < s1.length()) {
                return compare(s1.substring(minLength), s2);
            }
            return 0;
        }
    };

    @Override
    public String largestNumber(int[] nums) {
        List<String> strArr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            strArr.add(String.valueOf(nums[i]));
        }
        Collections.sort(strArr, customComp);
        StringBuilder str = new StringBuilder();
        for (String i : strArr) {
            str.append(i);
        }
        return str.charAt(0) == '0' ? "0" : str.toString();
    }
}
