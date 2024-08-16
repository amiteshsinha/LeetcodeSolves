package com.leetcode.palindromPartitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning extends AbstractParent {

    @Override
    public List<List<String>> partition(String s) {
        List<List<String>> tempList = new ArrayList<>();
        getSubsetList(s, 0, tempList, new ArrayList<>());
        return tempList;
    }

    private void getSubsetList(String s, int start, List<List<String>> retList, ArrayList<String> temp) {
        // Base Condition, which means when we have done partition at the end (n), then add it to our ultimate result
        if (start == s.length()) {
            retList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {// what we are checking over here is, if we partition the string from index to i Example-(0, 0) is palindrome or not
                temp.add(s.substring(start, i + 1));// take the substring and store it in our list & call the next substring from index + 1
                getSubsetList(s, i + 1, retList, temp);// as we have done for (0, 0) then our next will be from (1)
                temp.remove(temp.size() - 1);// please make sure you remove when you backtrack.
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        for (; start < end; start++ , end--) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}
