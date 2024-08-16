package com.amitesh.core.baseclass;

public class Trie26 {

    private Node root;

    public Trie26() {
        root = new Node();
    }

    public void insert(String word) {
        root.insertAtRoot(word, 0);
    }

    public boolean search(String word) {
        return root.searchOrStart( word, 0, true);
    }

    public boolean startsWith(String prefix) {
        return root.searchOrStart(prefix, 0, false);
    }

    class Node {
        Node[] nodes;
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
                nodes[k].isEnd = true;
            }
            nodes[k].insertAtRoot(word, index + 1);
        }

        boolean searchOrStart(String word, int index, boolean isSearch) {
            if (index >= word.length()) {
                return false;
            }
            Node node = nodes[word.charAt(index) - 'a'];
            if (node == null) {
                return false;
            }
            if (index == word.length() - 1) {
                return isSearch ? node.isEnd : true;
            }
            return node.searchOrStart(word, index + 1, isSearch);
        }
    }
}
