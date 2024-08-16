package com.leetcode.happyNumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber extends AbstractParent {

    @Override
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> existingNo = new HashSet<>();
        String s = n + "";
        boolean retVal = true;
        while (retVal) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += Math.pow(Integer.parseInt(s.charAt(i) + ""), 2);
            }
            if (sum == 1) {
                return true;
            } else {
                if (existingNo.contains(sum)) {
                    return false;
                } else {
                    existingNo.add(sum);
                    s = sum + "";
                }
            }
        }
        return false;
    }
}
