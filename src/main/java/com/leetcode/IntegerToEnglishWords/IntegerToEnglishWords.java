package com.leetcode.IntegerToEnglishWords;

import java.util.HashMap;
import java.util.Map;

/**
 * Runtime
 * 2
 * ms
 * Beats
 * 82.11%
 * Analyze Complexity
 * Memory
 * 41.46
 * MB
 * Beats
 * 92.95%
 */
public class IntegerToEnglishWords extends AbstractParent {
    public static final String SPACE = " ";
    static Map<Integer, String> wordMap = new HashMap<>();
    StringBuilder word = new StringBuilder();
    StringBuilder tempWord = new StringBuilder();
    static {
        wordMap.put(0, "Zero");
        wordMap.put(1, "One");
        wordMap.put(2, "Two");
        wordMap.put(3, "Three");
        wordMap.put(4, "Four");
        wordMap.put(5, "Five");
        wordMap.put(6, "Six");
        wordMap.put(7, "Seven");
        wordMap.put(8, "Eight");
        wordMap.put(9, "Nine");
        wordMap.put(10, "Ten");
        wordMap.put(11, "Eleven");
        wordMap.put(12, "Twelve");
        wordMap.put(13, "Thirteen");
        wordMap.put(14, "Fourteen");
        wordMap.put(15, "Fifteen");
        wordMap.put(16, "Sixteen");
        wordMap.put(17, "Seventeen");
        wordMap.put(18, "Eighteen");
        wordMap.put(19, "Nineteen");
        wordMap.put(20, "Twenty");
        wordMap.put(30, "Thirty");
        wordMap.put(40, "Forty");
        wordMap.put(50, "Fifty");
        wordMap.put(60, "Sixty");
        wordMap.put(70, "Seventy");
        wordMap.put(80, "Eighty");
        wordMap.put(90, "Ninety");
        wordMap.put(100, "Hundred");
        wordMap.put(1000, "Thousand");
        wordMap.put(1000000, "Million");
        wordMap.put(1000000000, "Billion");
    }
    @Override
    public String numberToWords(int num) {
        if (num == 0) {
            return wordMap.get(0);
        }
        int divisor = 1000000000, temp;
        while (divisor >= 1000) {
            if (num >= divisor) {
                temp =num % divisor;
                num /= divisor;
                getWordForNum(num);
                word.append(tempWord)
                        .append(wordMap.get(divisor))
                        .append(SPACE);
                tempWord = new StringBuilder();
                num = temp;
            }
            divisor /= 1000;
        }
        getWordForNum(num);
        word.append(tempWord);
        return word.toString().trim();
    }

    private void getWordForNum(int num) {
        if (num > 99) {
            num = getRemainder(num, 100);
        }
        if (num > 9) {
            num = getRemainder(num, 10);
        }
        if (num > 0) {
            getRemainder(num, 1);
        }
    }

    private int getRemainder(int num, int divisor) {
        int temp = num % divisor;
        if (divisor == 10) {
            if (num > 20) {
                num /= divisor;
                tempWord.append(wordMap.get(num*10));
                tempWord.append(SPACE);
            } else {
                tempWord.append(wordMap.get(num));
                tempWord.append(SPACE);
                return 0;
            }
        } else {
            num /= divisor;
            tempWord.append(wordMap.get(num));
            tempWord.append(SPACE);
        }
        if (divisor == 100) {
            tempWord.append(wordMap.get(divisor));
            tempWord.append(SPACE);
        }
        return temp;
    }
}
