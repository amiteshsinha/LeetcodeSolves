package com.leetcode.MinNoOfPushesTypeWord;

public class MinNoOfPushesToTypeWordIter1 extends AbstractParent {

    /**
     * @param word
     * @return
     */
    @Override
    public int minimumPushes(String word) {
        int retVal = 0, temp, multiplier = 1, max = 0;
        //top 8 highest freq words have 1 key
        // next 8 have 2 and so on
        int[] wordFreqCount = new int[26];
        char[] charArr = word.toCharArray();
        for (char c : charArr) {
            temp = c - 'a';
            wordFreqCount[temp]++;
            if (wordFreqCount[temp] > max) {
                max = wordFreqCount[temp];
            }
        }
        int[] freqArr = new int[max + 1];
        for (int i : wordFreqCount) {
            if (i > 0) {
                freqArr[i]++;
            }
        }
        temp = 0;
        while (max >= 0) {
            if (freqArr[max] > 0) {
                temp++;
                if (temp > 8 * multiplier) {
                    multiplier++;
                }
                retVal += max * multiplier;
                freqArr[max]--;
            } else {
                max--;
            }
        }
        return retVal;
    }
}
