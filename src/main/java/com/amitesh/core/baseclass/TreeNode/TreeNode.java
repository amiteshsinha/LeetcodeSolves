package com.amitesh.core.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TreeNode{");
        sb.append("val=").append(val);
        sb.append('}');
        return sb.toString();
    }

    public static TreeNode constructTreeFromArray(Integer[] arr) {
        if (arr.length == 0) {
            return null;
        }
        if (arr.length == 1) {
            return new TreeNode(arr[0]);
        }
        TreeNode root;
        List<TreeNode> treeList = new ArrayList<>();
        int i = 0 , j = 0;
        while (i < arr.length/2) {
            if (!treeList.isEmpty() && treeList.size()  > j) {
                root = treeList.get(j);
            } else {
                root = new TreeNode(arr[j]);
                treeList.add(root);
            }
            if (root != null) {
                root.left = getVal(arr, 2 * i + 1);
                treeList.add(root.left);
                root.right = getVal(arr, 2 * i + 2);
                treeList.add(root.right);
                i++;
                j++;
            } else {
                j++;
            }
        }
        return treeList.get(0);
    }

    private static TreeNode getVal(Integer[] arr, int k) {
        return (k >= arr.length || arr[k] == null) ? null : new TreeNode(arr[k]);
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.val);
            inOrderTraversal(node.right);
        }
    }

    public static void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.val);
        }
    }

    public static void revPreOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            revPreOrderTraversal(node.right);
            revPreOrderTraversal(node.left);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
