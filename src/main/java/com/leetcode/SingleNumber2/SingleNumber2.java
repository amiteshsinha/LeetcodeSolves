package com.leetcode.SingleNumber2;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 extends AbstractParent {

    @Override
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int k : map.keySet()) {
            if (map.get(k) == 1) {
                return k;
            }
        }
        // you will get xor of all numbers plus that unique no
        return 0;
    }
}
