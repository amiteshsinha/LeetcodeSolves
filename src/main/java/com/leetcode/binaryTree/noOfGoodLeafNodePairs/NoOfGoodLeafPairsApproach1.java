package com.leetcode.binaryTree.noOfGoodLeafNodePairs;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NoOfGoodLeafPairsApproach1 extends AbstractParent {

    int retVal = 0;
    List<Map<TreeNode, Integer>> listOfParentDistances;

    /**
     * This wont work because nodes dont have unique values and there can be a tree like [1,1,1]. Since we dont control hashcode and equals map
     * wont save the 2 leaf nodes as separate
     * @param root
     * @param distance
     * @return
     */
    public int countPairs(TreeNode root, int distance) {
        if (distance == 1) {
            return 0;
        }
        listOfParentDistances = new ArrayList<>();
        getDistanceOfLeafNode(root, 0, new ArrayList<>(), distance);

        for (int i = 0; i < listOfParentDistances.size(); i++) {
            for (int j = i + 1; j < listOfParentDistances.size(); j++) {
                Map<TreeNode, Integer> distMap1 = listOfParentDistances.get(i);
                Map<TreeNode, Integer> distMap2 =  listOfParentDistances.get(j);
                for (TreeNode parent : distMap2.keySet()) {
                    if (distMap1.containsKey(parent)) {
                        if (distMap1.get(parent) + distMap2.get(parent) <= distance) {
                            retVal++;
                        }
                        break;
                    }
                }
            }
        }
        return retVal;
    }

    private void getDistanceOfLeafNode(TreeNode root, int currDist, List<TreeNode> parentList, int distance) {
        if (root == null) {
            return;
        }
        if (currDist > distance) {
            return;
        }
        if (root.left == null && root.right == null) {
            Map<TreeNode, Integer> parentNodeMap = new LinkedHashMap<>();
            int count = 1;
            for (int i = parentList.size() - 1; i > -1; i--) {
                parentNodeMap.put(parentList.get(i), count++);
            }
            listOfParentDistances.add(parentNodeMap);
            return;
        }
        parentList.add(root);
        getDistanceOfLeafNode(root.left, currDist + 1,parentList, distance);
        getDistanceOfLeafNode(root.right, currDist + 1,parentList, distance);
        parentList.remove(parentList.size() - 1);
    }
}
