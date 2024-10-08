package com.leetcode.LRUCache;

import org.testng.Assert;

public class LRUCache extends AbstractParent {

    @Override
    public void test() {
        com.amitesh.core.baseclass.LRUCache lRUCache = new com.amitesh.core.baseclass.LRUCache(5);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        Assert.assertEquals(lRUCache.get(1), 1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        Assert.assertEquals(lRUCache.get(2), -1);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        Assert.assertEquals(lRUCache.get(1), -1);    // return -1 (not found)
        Assert.assertEquals(lRUCache.get(3), 3);    // return 3
        Assert.assertEquals(lRUCache.get(4),4);    // return 4
    }
}
