package com.leetcode.takeKfromLeftOrRight;

public class TakeKCharsFromLeftorRight extends AbstractParent {

    // need to find the max substring which can be removed from s so that all other chars length is greater than or equal to k
    //We can use sliding window approach.
    @Override
    public int takeCharacters(String s, int k) {
        if (k == 0) {
            return 0;
        }
        char[] charArray = s.toCharArray();
        int[] charFreq = new int[3];
        for (int i = 0; i < s.length(); i++) {
            charFreq[charArray[i] - 'a']++;
        }
        // s.length() < 3*k wont work because s might not have one or more of a,b or c
        if (charFreq[0] < k || charFreq[1] < k || charFreq[2] < k) {
            return -1;
        }
        int start = 0, retVal = s.length();
        for (char c : charArray) {
            charFreq[c - 'a']--;
            if (charFreq[0] < k || charFreq[1] < k || charFreq[2] < k) {
                //after removing other non essential characters - what is the min (1 is added to account for the current missed character)
                retVal = Math.min(charFreq[0] + charFreq[1] + charFreq[2] + 1, retVal);
                while (charArray[start] != c) {
                    charFreq[charArray[start] - 'a']++;
                    start++;
                }
                charFreq[charArray[start] - 'a']++;
                start++;
            }
        }
        return Math.min(charFreq[0] + charFreq[1] + charFreq[2], retVal);
    }

}
