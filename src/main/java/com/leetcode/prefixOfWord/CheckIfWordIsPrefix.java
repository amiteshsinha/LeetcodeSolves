package com.leetcode.prefixOfWord;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 41.05
 * MB
 * Beats
 * 86.28%
 *
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class CheckIfWordIsPrefix extends AbstractParent {

    @Override
    public int isPrefixOfWord(String sentence, String searchWord) {
       String[] arr = sentence.split(" ");
       for (int i = 0; i < arr.length; i++) {
           if (arr[i].startsWith(searchWord)) {
               return i + 1;
           }
       }
       return -1;
    }

}
