package com.leetcode.implementTrie;

import com.amitesh.core.baseclass.Trie26;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TrieImplementation {

    public static void main(String[] args) {
        //Trie3 trie = new Trie3();
        Trie26 trie = new Trie26();
        trie.insert("apple");
        assertTrue(trie.search("apple"));   // return True
        assertFalse(trie.search("app"));     // return False
        assertTrue(trie.startsWith("app")); // return True
        trie.insert("app");
        assertTrue(trie.search("app"));     // return True
    }
}
