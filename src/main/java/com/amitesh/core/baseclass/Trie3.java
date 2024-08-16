package com.amitesh.core.baseclass;

public class Trie3 {

    private Node root;

    public Trie3() {
        root = new Node();
    }

    public void insert(String word) {
        root = insertAtRoot(root, word, 0);
    }

    public boolean search(String word) {
        return searchOrStart(root, word, 0, true);
    }

    public boolean startsWith(String prefix) {
        return searchOrStart(root, prefix, 0, false);
    }

    private boolean searchOrStart(Node root, String word, int i, boolean isSearch) {
        if (root == null) {
            return false;
        }
        char temp = word.charAt(i);
        if (temp < root.c) {
            return searchOrStart(root.left, word, i, isSearch);
        } else if (temp > root.c) {
            return searchOrStart(root.right, word, i, isSearch);
        } else if (i < word.length() - 1) {
            // character matches proceed to the next char
            return searchOrStart(root.mid, word, i + 1, isSearch);
        } else {
            return isSearch ? root.isEnd : true;
        }
    }

    private Node insertAtRoot(Node root, String word, int i) {
        char temp = word.charAt(i);
        if (root == null) {
            root = new Node();
           root.c = temp;
        }
        if (temp < root.c) {
            root.left = insertAtRoot(root.left, word, i);
        } else if (temp > root.c) {
            root.right = insertAtRoot(root.right, word, i);
        } else if (i < word.length() - 1) {
            root.mid = insertAtRoot(root.mid, word, i + 1);
        } else {
            root.isEnd = true;
        }
        return root;
    }

    class Node {
        char c;
        Node left, right, mid;
        boolean isEnd;
    }
}
