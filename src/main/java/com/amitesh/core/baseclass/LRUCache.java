package com.amitesh.core.baseclass;

import org.testng.Assert;

import java.util.LinkedHashMap;


public class LRUCache {

    LinkedHashMap<Integer, Integer> cacheMap;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {
        int val = -1;
        if (cacheMap.containsKey(key)) {
            val = cacheMap.remove(key);
            cacheMap.put(key, val);
        }
        return val;
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            cacheMap.remove(key);
        } else {
            if (cacheMap.size() >= capacity) {
                for (Integer removedKey : cacheMap.keySet()) {
                    cacheMap.remove(removedKey);
                    break;
                }
            }
        }
        cacheMap.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
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
