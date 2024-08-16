package com.leetcode.binaryTree.deleteNodeAndReturnForest;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DeleteNodes extends AbstractParent {
    List<TreeNode> retList = null;

    @Override
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        retList = new ArrayList<>();
        retList.add(root);
        for (int i = 0; i < to_delete.length; i++) {
            deleteFromNodes(to_delete[i]);
        }
        return retList;
    }

    private void deleteFromNodes(int i) {
        TreeNode deletedNode = null;
        for (TreeNode node : retList) {
            if (node.val == i) {
                deletedNode = node;
                retList.remove(deletedNode);
                break;
            } else {
                deletedNode = treeDeleteNode(node, i);
                if (deletedNode != null) {
                    break;
                }
            }
        }
        if (deletedNode.left != null) {
            retList.add(deletedNode.left);
            deletedNode.left = null;
        }
        if (deletedNode.right != null) {
            retList.add(deletedNode.right);
            deletedNode.right = null;
        }
    }

    private TreeNode treeDeleteNode(TreeNode node, int i) {
        if (node == null) {
            return null;
        }
        TreeNode deletedNode = null;
        if (node.left != null && node.left.val == i) {
            deletedNode = node.left;
            node.left = null;
        } else if (node.right != null && node.right.val == i) {
            deletedNode = node.right;
            node.right = null;
        }
        if (deletedNode != null) {
            return deletedNode;
        }
        TreeNode right = treeDeleteNode(node.right, i);
        TreeNode left = treeDeleteNode(node.left, i);
        if (left != null) {
            return left;
        } else {
            return right;
        }
    }
}
