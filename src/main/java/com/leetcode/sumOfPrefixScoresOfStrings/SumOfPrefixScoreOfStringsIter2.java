package com.leetcode.sumOfPrefixScoresOfStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Runtime
 * 243
 * ms
 * Beats
 * 94.31%
 *
 * Memory
 * 187.20
 * MB
 * Beats
 * 62.91%
 * This file was created on 09/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class SumOfPrefixScoreOfStringsIter2 extends AbstractParent {

    private Node root = new Node();

    public void insert(String word) {
        Node node = root;
        for (char ch : word.toCharArray()) {
            if (!node.containKey(ch)) {
                node.put(ch, new Node());
            }
            node.inc(ch);
            node = node.get(ch);
        }
    }

    public int search(String word) {
        Node node = root;
        int preCount = 0;
        for (char ch : word.toCharArray()) {
            preCount += node.retCount(ch);
            node = node.get(ch);
        }
        return preCount;
    }

    /**
     *
     * @param words
     * @return
     */
    @Override
    public int[] sumPrefixScores(String[] words) {
        int[] retArr = new int[words.length];
        for (String word : words) {
            insert(word);
        }
        for (int i = 0; i < words.length; i++) {
            retArr[i] = search(words[i]);
        }
        return retArr;
    }
}

class Node {
    int count = 0;
    Node[] list = new Node[26];

    public boolean containKey(char ch) {
        return list[ch - 'a'] != null;
    }

    public Node get(char ch) {
        return list[ch - 'a'];
    }

    public void put(char ch, Node new_node) {
        list[ch - 'a'] = new_node;
    }

    public void inc(char ch) {
        list[ch - 'a'].count++;
    }

    public int retCount(char ch) {
        return list[ch - 'a'].count;
    }
}
