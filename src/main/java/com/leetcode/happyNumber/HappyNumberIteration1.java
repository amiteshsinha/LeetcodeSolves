package com.leetcode.happyNumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberIteration1 extends AbstractParent {

    @Override
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> existingNo = new HashSet<>();
        int s = n;
        boolean retVal = true;
        while (retVal) {
            s = sum(s);
            if (s == 1) {
                return true;
            } else {
                if (!existingNo.add(s)) {
                    return false;
                }
            }
        }
        return false;
    }

    public int sum(int n) {
        int sum = 0, tmp = 0;
        while (n != 0) {
            tmp = n%10;
            sum += tmp*tmp;
            n = n/10;
        }
        return sum;
    }
}
