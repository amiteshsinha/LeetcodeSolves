package com.leetcode.sumOfPrefixScoresOfStrings;

/**
 * Runtime
 * 317
 * ms
 * Beats
 * 47.44%
 *
 * Memory
 * 197.43
 * MB
 * Beats
 * 34.18%
 * This file was created on 09/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class SumOfPrefixScoreOfStrings extends AbstractParent {

    /**
     * Approach - used a modified trie to store all the words along with the sum of the count for each prefix
     * Iteration 1 - store the words from the array
     * Iteration 2 - for the same words - find the total prefix sum.
     * Complexity is 2*O(n)
     * @param words
     * @return
     */
    @Override
    public int[] sumPrefixScores(String[] words) {
        Trie26 trie = new Trie26();
        int[] retArr = new int[words.length];
        for (String word : words) {
            trie.insert(word);
        }
        for (int i = 0; i < words.length; i++) {
            retArr[i] = trie.search(words[i]);
        }
        return retArr;
    }

    class Trie26 {

        private Node root;

        public Trie26() {
            root = new Node();
        }

        public void insert(String word) {
            root.insertAtRoot(word, 0);
        }

        public int search(String word) {
            return root.getPrefixCount(word, 0);
        }

        class Node {
            Node[] nodes;
            int count;
            boolean isEnd;

            Node() {
                nodes = new Node[26];
                count = 0;
            }

            void insertAtRoot(String word, int index) {
                if (index >= word.length()) {
                    return;
                }
                int k = word.charAt(index) - 'a';
                if (nodes[k] == null) {
                    nodes[k] = new Node();
                }
                nodes[k].count++;
                if (index == word.length() - 1) {
                    nodes[k].isEnd = true;
                }
                nodes[k].insertAtRoot(word, index + 1);
            }

            int getPrefixCount(String word, int index) {
                if (index >= word.length()) {
                    return 0;
                }
                Node node = nodes[word.charAt(index) - 'a'];
                if (node == null) {
                    return 0;
                }
                if (index == word.length() - 1) {
                    return node.count;
                }
                return node.count + node.getPrefixCount(word, index + 1);
            }
        }
    }

}
