package com.leetcode.maxScoreFormedByLetters;

public class MaxScoreByLettersIter1 extends AbstractParent {

    int maxVal= 0;
    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 81.78%
     * of users with Java
     * Memory
     * 40.93
     * MB
     * Beats
     * 87.71%
     * of users with Java
     */
    @Override
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        // possible to construct word from letters ? combination of words possible from all letters?
        // calculate score of all combinations - get max score
        int[] letterFreqArr = new int[26];
        for (int i = 0; i < letters.length; i++) {
            letterFreqArr[letters[i] - 'a']++;
        }
        getListOfPossibleWordCombinations(words, letterFreqArr, score,0, 0);
        return maxVal;
    }

    private void getListOfPossibleWordCombinations(String[] words, int[] letters, int[] score, int index, int currentScore) {
        if (currentScore != 0) {
           maxVal = Math.max(currentScore, maxVal);
        }
        for (int i = index; i < words.length; i++) {
            boolean isValid = true;
            int wordScore = 0;
            for (int j = 0; j < words[i].length(); j++) {
                letters[words[i].charAt(j) - 'a']--;
                wordScore += score[words[i].charAt(j) - 'a'];
                if (letters[words[i].charAt(j) - 'a'] < 0) {
                    isValid = false;
                }
            }
            if (isValid) {
                currentScore += wordScore;
                getListOfPossibleWordCombinations(words, letters, score,i + 1, currentScore);
                currentScore -= wordScore;
            }
            for (int j = 0; j < words[i].length(); j++) {
                letters[words[i].charAt(j) - 'a']++;
            }
        }
    }
}
