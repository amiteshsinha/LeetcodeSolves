package com.leetcode.removeSubFoldersInFileSystem;

import java.util.*;

/**
 * Runtime
 * 66
 * ms
 * Beats
 * 34.49%
 *
 * Memory
 * 66.52
 * MB
 * Beats
 * 18.98%
 *
 * This file was created on 25/10/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class RemoveSubFoldersFromFileSystem extends AbstractParent {

    @Override
    public List<String> removeSubfolders(String[] folder) {
        List<String> retList = new ArrayList<>();
        Map<String, Node> nodeMap = new HashMap<>();
        for (String s : folder) {
            String[] folderArr = s.split("/");
            updateKeyInMap(folderArr, 1, nodeMap);
        }
        for (String s : nodeMap.keySet()) {
            findParentFolder(nodeMap, s, new ArrayList<>(), retList);
        }
        return retList;
    }

    private void findParentFolder(Map<String, Node> nodeMap, String s, List<String> list, List<String> retList) {
        Node tempNode = nodeMap.get(s);

        Map<String, Node> tempMap = tempNode.childMap;
        list.add(s);
        // final cond
        if (tempNode.isParent) {
            StringBuilder builder = new StringBuilder();
            for (String temp : list) {
                builder.append("/");
                builder.append(temp);
            }
            retList.add(builder.toString());
            return;
        }
        //nodeMap.get(s) is not a parent do stuff
        for (String temp : tempMap.keySet()) {
            findParentFolder(tempMap, temp, list, retList);
            list.remove(list.size() - 1);
        }
    }

    private void updateKeyInMap(String[] folderArr, int i, Map<String, Node> nodeMap) {
        if (i == folderArr.length) {
            return;
        }
        if (!nodeMap.containsKey(folderArr[i])) {
            nodeMap.put(folderArr[i], new Node(folderArr[i]));
        }
        if (i == folderArr.length - 1) {
            nodeMap.get(folderArr[i]).isParent = true;
        }
        updateKeyInMap(folderArr, i + 1, nodeMap.get(folderArr[i]).childMap);
    }

    class Node {
        String val;
        boolean isParent;
        Map<String, Node> childMap;

        public Node(String val) {
            this.val = val;
            this.childMap = new HashMap<>();
        }
    }

}
