package com.leetcode.palindromPartitioning;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningIter1 extends AbstractParent {

        List<List<String>> tempList;
        List<String> temp = new ArrayList<>();
        String s;

    /**
     * Takes 0 ms 
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
            this.s = s;
            return new AbstractList<List<String>>() {
                @Override
                public int size() {
                    init();
                    return tempList.size();
                }

                @Override
                public List<String> get(int index) {
                    init();
                    return tempList.get(index);
                }

                private void init() {
                    if (tempList != null) return;
                    tempList = new ArrayList<List<String>>();
                    getSubsetList(0);
                }
            };
        }

        private void getSubsetList(int start) {
            if (start == s.length()) {
                tempList.add(new ArrayList<>(temp));
                return;
            }
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    temp.add(s.substring(start, i + 1));
                    getSubsetList(i + 1);
                    temp.remove(temp.size() - 1);
                }
            }
        }

        private boolean isPalindrome(String s, int start, int end) {
            for (; start < end; start++, end--) {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
            }
            return true;
        }
}
