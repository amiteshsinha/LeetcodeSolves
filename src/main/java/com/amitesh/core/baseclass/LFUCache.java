package com.amitesh.core.baseclass;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class LFUCache<K, V> {
    private final int capacity;
    private int minFrequency;
    private final Map<K, V> cache;
    private final Map<K, Integer> frequencies;
    private final Map<Integer, TreeMap<K, V>> frequencyList;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 0;
        this.cache = new HashMap<>();
        this.frequencies = new HashMap<>();
        this.frequencyList = new HashMap<>();
    }

    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }
        int freq = frequencies.get(key);
        frequencies.put(key, freq + 1);
        frequencyList.get(freq).remove(key);
        if (frequencyList.get(freq).isEmpty()) {
            frequencyList.remove(freq);
            if (minFrequency == freq) {
                minFrequency++;
            }
        }
        frequencyList.computeIfAbsent(freq + 1, k -> new TreeMap<>()).put(key, cache.get(key));
        return cache.get(key);
    }

    public void put(K key, V value) {
        if (capacity <= 0) {
            return;
        }
        if (cache.containsKey(key)) {
            cache.put(key, value);
            get(key); // Update frequency
            return;
        }
        if (cache.size() >= capacity) {
            K evictKey = frequencyList.get(minFrequency).firstKey();
            frequencyList.get(minFrequency).remove(evictKey);
            if (frequencyList.get(minFrequency).isEmpty()) {
                frequencyList.remove(minFrequency);
            }
            cache.remove(evictKey);
            frequencies.remove(evictKey);
        }
        cache.put(key, value);
        frequencies.put(key, 1);
        minFrequency = 1;
        frequencyList.computeIfAbsent(1, k -> new TreeMap<>()).put(key, value);
    }

    public static void main(String[] args) {
        LFUCache<Integer, String> cache = new LFUCache<>(3);

        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");
        System.out.println(cache.cache); // {1=one, 2=two, 3=three}

        cache.get(1);
        cache.put(4, "four");
        System.out.println(cache.cache); // {1=one, 3=three, 4=four}

        cache.get(3);
        cache.put(5, "five");
        System.out.println(cache.cache); // {1=one, 3=three, 5=five}
    }
}
