package com.amitesh.core.baseclass;

import java.util.Map;

public abstract class GenericPrinter {

    public static <T> void print2dArray(T[][] array) {
        for (T[] row : array) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println("key: " + key + " value: " + map.get(key));
        }
    }
}
