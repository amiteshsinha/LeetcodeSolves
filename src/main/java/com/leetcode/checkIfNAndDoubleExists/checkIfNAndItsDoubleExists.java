package com.leetcode.checkIfNAndDoubleExists;

import java.util.HashSet;
import java.util.Set;

/**
 * Runtime
 * 1
 * ms
 * Beats
 * 98.03%
 *
 * Memory
 * 43.56
 * MB
 * Beats
 * 12.37%
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class checkIfNAndItsDoubleExists extends AbstractParent {

    @Override
    public boolean checkIfExist(int[] arr) {
        Set<Integer> existingSet = new HashSet<>();
        for (int i : arr) {
            if (existingSet.contains(i*2) || (i%2 == 0 && existingSet.contains(i/2))) {
                return true;
            }
            existingSet.add(i);
        }
        return false;
    }

}
