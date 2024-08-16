package com.amitesh.core.baseclass;

import java.security.NoSuchAlgorithmException;
import java.util.SortedMap;
import java.util.TreeMap;

public class ConsistentHashing {
    public final TreeMap<Integer, String> ring;
    public final int noOfReplicas;

    public ConsistentHashing(int noOfReplicas) throws NoSuchAlgorithmException {
        this.ring = new TreeMap<>();
        this.noOfReplicas = noOfReplicas;
    }

    public void addServer(String server) {
        for (int i = 0; i < noOfReplicas; i++) {
            ring.put((server + i).hashCode(), server);
        }
    }

    public void removeServer(String server) {
        for (int i = 0; i < noOfReplicas; i++) {
            ring.remove((server + i).hashCode());
        }
    }

    public String getServer(String key) {
        if (ring.isEmpty()) {
            return null;
        }
        int hash = key.hashCode();
        if (!ring.containsKey(hash)) {
            SortedMap<Integer, String> tailMap = ring.tailMap(hash);
            hash = tailMap.isEmpty() ? ring.firstKey() : tailMap.firstKey();
        }
        return ring.get(hash);
    }

    /**
     * The addServer method adds a server to the hash ring by generating virtual nodes for it and inserting them into the TreeMap.
     * The removeServer method removes a server from the hash ring by removing all of its virtual nodes from the TreeMap.
     * The getServer method retrieves the server to which a particular key belongs by finding the virtual node with a hash value
     * greater than or equal to the hash value of the key and returning the name of the corresponding server.
     * @param args
     * @throws NoSuchAlgorithmException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        ConsistentHashing ch = new ConsistentHashing(3);
        ch.addServer("server1");
        ch.addServer("server2");
        ch.addServer("server3");
        System.out.println("key1: is present on server: " + ch.getServer("key1"));
        System.out.println("key67890: is present on server: " + ch.getServer("key67890"));

        ch.removeServer("server1");
        System.out.println("After removing server1");

        System.out.println("key1: is present on server: " + ch.getServer("key1"));
        System.out.println("key67890: is present on server: " + ch.getServer("key67890"));

    }

}
