package com.leetcode.constructStringWithRepeatLimit;

/**
 * Runtime
 * 15
 * ms
 * Beats
 * 95.34%
 *
 * Memory
 * 45.28
 * MB
 * Beats
 * 96.25%
 * This file was created on 17/12/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class ConstructStringWithRepeatLimit extends AbstractParent {

    @Override
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] charFreq = new int[26];
        int charCount = 0, maxCharIndex = 25, writeIndex = 0;
        for(int i = 0; i < s.length(); i++) {
            charFreq[s.charAt(i) - 'a']++;
            charCount++;
        }
        // replaced StringBuilder with charArray and that brought runtime down from 22 ms to 15 ms
        char[] sb = new char[s.length()];
        //step 2 - append characters with frequency less than or equal to repeatLimit
        //need to remember what the last character was - so we need to start from end again
        while (charCount > 0) {
            for(int i = 25; i >= 0; i--) {
                if (charFreq[i] > 0) {
                    maxCharIndex = i;
                    break;
                }
            }
            if (writeIndex > 0 && sb[writeIndex - 1] == (char) ('a' + maxCharIndex)) {
                return String.valueOf(sb, 0, writeIndex);
            }
            for(int i = repeatLimit; i > 0 && charFreq[maxCharIndex] > 0; i--) {
                sb[writeIndex++] = ((char) ('a' + maxCharIndex));
                charCount--;
                charFreq[maxCharIndex]--;
            }
            //if the maxCharIndex is exhausted - then break - else add 1 of the next character
            if (charFreq[maxCharIndex] == 0) {
                continue;
            }
            //step 3 - find the next character and append one of it to the result
            for (int i = maxCharIndex - 1; i >=0; i--) {
                if (charFreq[i] > 0) {
                    sb[writeIndex++] = ((char) ('a' + i));
                    charFreq[i]--;
                    charCount--;
                    break;
                }
            }
        }
        return String.valueOf(sb);
    }

}
