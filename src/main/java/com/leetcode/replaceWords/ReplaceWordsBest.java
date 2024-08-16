package com.leetcode.replaceWords;

import java.util.List;

public class ReplaceWordsBest extends AbstractParent {

    class Node {
        Node[] nodes;
        String word;
        boolean isEnd;

        Node() {
            nodes = new Node[26];
        }

        void insertAtRoot(String word, int index) {
            if (index >= word.length()) {
                return;
            }
            int k = word.charAt(index) - 'a';
            if (nodes[k] == null) {
                nodes[k] = new Node();
            }
            if (index == word.length() - 1) {
                nodes[k].word = word;
                nodes[k].isEnd = true;
            }
            nodes[k].insertAtRoot(word, index + 1);
        }

        String searchOrStart(String word, int index) {
            if (index >= word.length()) {
                return null;
            }
            Node node = nodes[word.charAt(index) - 'a'];
            if (node == null) {
                return null;
            }
            if (node.isEnd) {
                return node.word;
            }
            return node.searchOrStart(word, index + 1);
        }
    }

    /**
     * Runtime
     * 10
     * ms
     * Beats
     * 88.51%
     * of users with Java
     * Memory
     * 55.07
     * MB
     * Beats
     * 74.87%
     * of users with Java
     *
     * In a trie we can save the word too.
     * Approach  -
     * STEP1 - create a trie with root words and save word in the trie
     * STEP2 - split the sentence into words by space
     * STEP3 - for each word check if the root is present in the trie - if it is then return the shortest matching word (i.e. isEnd = true)
     * If the word is not present in the trie then return null
     * STEP4 - replace the word in the sentence with the word from trie
     * @param dictionary
     * @param sentence
     * @return
     */
    @Override
    public String replaceWords(List<String> dictionary, String sentence) {
        Node trie = new Node();
        for (String word : dictionary) {
            trie.insertAtRoot(word, 0);
        }
        String[] wordList = sentence.split(" ");
        for (int i = 0;i < wordList.length; i++) {
            String root = trie.searchOrStart(wordList[i], 0);
            if (root != null) {
                wordList[i] = root;
            }
        }
       return String.join(" ", wordList);
    }
}
