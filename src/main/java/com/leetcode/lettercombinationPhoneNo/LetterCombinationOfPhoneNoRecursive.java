package com.leetcode.lettercombinationPhoneNo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationOfPhoneNoRecursive extends AbstractLetterCombinationOfPhoneNoTests {

    @Override
    public List<String> getAllCombinationsOfPhoneNo(String digits) {
        int[] noArr = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            noArr[i] = Integer.parseInt(digits.charAt(i) + "");
        }
        return backtrack(noArr, 0, "", new LinkedList<>());
    }

    private List<String> backtrack(int[] digits, int start, String current, List<String> finalList) {
        if (digits == null || digits.length == 0) {
            return Collections.emptyList();
        }
        if (start == digits.length) {
            finalList.add(current);
            return finalList;
        } else {
            String temp = current;
            for (String letter : initialMap.get(digits[start])) {
                current += letter;
                backtrack(digits, start + 1, current, finalList);
                current = temp;
            }
        }
        return finalList;
    }
}
