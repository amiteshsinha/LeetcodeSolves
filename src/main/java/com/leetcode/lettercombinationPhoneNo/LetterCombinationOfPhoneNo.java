package com.leetcode.lettercombinationPhoneNo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationOfPhoneNo extends AbstractLetterCombinationOfPhoneNoTests {

    @Override
    public List<String> getAllCombinationsOfPhoneNo(String digits) {
        if (digits == null || digits.trim().isEmpty()) {
            return Collections.emptyList();
        }
        List<String> retList = new LinkedList<>();
        for (int i = 0; i < Math.min(4, digits.length()); i++) {
            Integer no = Integer.parseInt(digits.charAt(i) + "");
            if (no >= 2 && no <= 9) {
                List<String> letterForCurrentChar = initialMap.get(no);
                if (retList.isEmpty()) {
                    retList.addAll(letterForCurrentChar);
                } else {
                    List<String> tempList = new LinkedList<>();
                    for (String existingString : retList) {
                        for (String current : letterForCurrentChar) {
                            tempList.add(existingString + current);
                        }
                    }
                    retList = tempList;
                }
            }
        }
        return retList;
    }
}
