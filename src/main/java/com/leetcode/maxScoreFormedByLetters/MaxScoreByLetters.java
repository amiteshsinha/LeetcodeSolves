package com.leetcode.maxScoreFormedByLetters;

import java.util.Arrays;

public class MaxScoreByLetters extends AbstractParent {

    int maxVal= 0;

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 81.78%
     * of users with Java
     * Memory
     * 42.13
     * MB
     * Beats
     * 33.90%
     * of users with Java
     * @param words
     * @param letters
     * @param score
     * @return
     */
    @Override
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        // possible to construct word from letters ? combination of words possible from all letters?
        // calculate score of all combinations - get max score
        int[] letterFreqArr = new int[26];
        for (int i = 0; i < letters.length; i++) {
            letterFreqArr[letters[i] - 'a'] += 1;
        }
        getListOfPossibleWordCombinations(words, letterFreqArr, score,0, 0);
        return maxVal;
    }

    private void getListOfPossibleWordCombinations(String[] words, int[] letters, int[] score, int index, int currentScore) {
        if (currentScore != 0) {
           maxVal = Math.max(currentScore, maxVal);
        }
        for (int i = index; i < words.length; i++) {
            Pair<Integer, int[]> consumedLetterArrPair = isPossibleToMakeWord(words[i], letters, score);
            if (consumedLetterArrPair.getKey() != 0) {
                currentScore += consumedLetterArrPair.getKey();
                getListOfPossibleWordCombinations(words, consumedLetterArrPair.getValue(), score,i + 1, currentScore);
                currentScore -= consumedLetterArrPair.getKey();
            }
        }
    }

    private Pair<Integer, int[]> isPossibleToMakeWord(String word, int[] letters, int[] score) {
        int[] lettersModArr = Arrays.copyOf(letters, letters.length);
        int wordScore = 0;
        for (int i = 0; i < word.length(); i++) {
            if (lettersModArr[word.charAt(i) - 'a'] > 0) {
                lettersModArr[word.charAt(i) - 'a'] -= 1;
                wordScore += score[word.charAt(i) - 'a'];
            } else {
                return new Pair(0, letters);
            }
        }
        return new Pair(wordScore, lettersModArr);
    }

    class Pair<K, V> {

        /**
         * Key of this <code>Pair</code>.
         */
        private K key;

        /**
         * Gets the key for this pair.
         *
         * @return key for this pair
         */
        public K getKey() {
            return key;
        }

        /**
         * Value of this this <code>Pair</code>.
         */
        private V value;

        /**
         * Gets the value for this pair.
         *
         * @return value for this pair
         */
        public V getValue() {
            return value;
        }

        /**
         * Creates a new pair
         *
         * @param key   The key for this pair
         * @param value The value to use for this pair
         */
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
