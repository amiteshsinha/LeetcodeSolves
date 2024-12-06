package com.leetcode.movePieceToObtainString;

import java.util.ArrayList;
import java.util.List;

/**
 * This file was created on 05/12/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public class MovePieceToObtainString extends AbstractParent {

    @Override
    public boolean canChange(String start, String target) {
        // left cannot go towards right and vice versa
        int sIndex = 0 , tIndex = 0, len = start.length();
        while (sIndex < len || tIndex < len) {
            while (sIndex < len && start.charAt(sIndex) == '_') {
                sIndex++;
            }
            while (tIndex < len && target.charAt(tIndex) == '_') {
                tIndex++;
            }
            // if 1 index has reached end and the other has not then return false
            if (sIndex == len  || tIndex == len) {
                return sIndex == len && tIndex == len;
            }

            if (start.charAt(sIndex) != target.charAt(tIndex)) {
                return false;
            }
            if (start.charAt(sIndex) == 'L' && sIndex < tIndex) {
                return false;
            }
            if (start.charAt(sIndex) == 'R' && sIndex > tIndex) {
                return false;
            }
            sIndex++;
            tIndex++;
        }
        return true;
    }

}
