package com.leetcode.replaceWords;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReplaceWords extends AbstractParent {

    @Override
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, Comparator.comparing(String::length));
        String[] wordList = sentence.split(" ");
        int[] refList = new int[wordList.length];
        int count = wordList.length;
        for (String root : dictionary) {
            for (int i = 0; i < wordList.length; i++) {
               if (wordList[i].startsWith(root) && refList[i] == 0) {
                   wordList[i] = root;
                   refList[i] = 1;
                   count--;
               }
            }
            if (count == 0) {
                break;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String word : wordList) {
            builder.append(word);
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
