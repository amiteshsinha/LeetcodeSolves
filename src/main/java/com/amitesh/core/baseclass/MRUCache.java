package com.amitesh.core.baseclass;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

//https://en.wikipedia.org/wiki/Cache_replacement_policies#MRU
public class MRUCache {

    LinkedHashMap<String, Integer> cacheMap;
    int capacity;

    public MRUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new LinkedHashMap<>(capacity);
    }

    public int get(String key) {
        int val = -1;
        if (cacheMap.containsKey(key)) {
            val = cacheMap.remove(key);
            cacheMap.put(key, val);
        }
        return val;
    }

    public void put(String key, int value) {
        if (cacheMap.containsKey(key)) {
            cacheMap.remove(key);
        } else {
            if (cacheMap.size() >= capacity) {
                Iterator<String> reverseIterator = new LinkedList<String>(cacheMap.keySet()).descendingIterator();
                while (reverseIterator.hasNext()) {
                    cacheMap.remove(reverseIterator.next());
                    break;
                }
            }
        }
        cacheMap.put(key, value);
    }

    public static void main(String[] args) {
        MRUCache mruCache = new MRUCache(4);
        mruCache.put("A", 1);
        mruCache.put("B", 2);
        mruCache.put("C", 3);
        mruCache.put("D", 4);
        System.out.println(mruCache.cacheMap);
        mruCache.put("E", 2);
        System.out.println(mruCache.cacheMap); // E-2 should replace D-4
        System.out.println("C" + mruCache.get("C"));
        System.out.println(mruCache.cacheMap);
        mruCache.put("D", 9);
        System.out.println(mruCache.cacheMap);
        System.out.println("B" + mruCache.get("B"));
        System.out.println(mruCache.cacheMap);
    }
}
