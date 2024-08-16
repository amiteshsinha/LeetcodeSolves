package com.leetcode.longestsubstring;

/**
 * We use HashSet to store the characters in current window [i, j)[i,j) (j = ij=i initially).
 * Then we slide the index jj to the right. If it is not in the HashSet, we slide jj further.
 * Doing so until s[j] is already in the HashSet.
 * At this point, we found the maximum size of substrings without duplicate characters start with index i.
 * If we do this for all ii, we get our answer.
 */
public class LongestSubstringSlidingWindow extends AbstractLongestSubstringTest {

    public static void main(String[] args) {
        LongestSubstringSlidingWindow obj = new LongestSubstringSlidingWindow();
        int val = obj.lengthOfLongestSubstring("bbbb");
    }

    @Override
    public int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();
        int[] charArray = new int[128];
        int maxLength = 0, i = 0, j = i;
        while (i < stringLength && j < stringLength) {
            if (charArray[s.charAt(j)] == 0) {
                charArray[s.charAt(j++)] = 1;
                maxLength = Math.max(maxLength, j - i);
            } else {
                charArray[s.charAt(i++)] = 0;
            }
        }
        return maxLength;
    }
}
