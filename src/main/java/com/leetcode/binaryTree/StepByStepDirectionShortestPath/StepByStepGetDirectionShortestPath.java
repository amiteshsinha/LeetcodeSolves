package com.leetcode.binaryTree.StepByStepDirectionShortestPath;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class StepByStepGetDirectionShortestPath extends AbstractParent {

    /**
     * Runtime
     * 22
     * ms
     * Beats
     * 68.84%
     * //todo - while doing the LCA -see if the path can be created - if LCA is same as source or destination
     * // then we will need to find path from lca to source/destination using the find path algo
     * Memory
     * 80.06
     * MB
     * Beats
     * 61.30%
     * @param root
     * @param startValue
     * @param destValue
     * @return
     */
    @Override
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lca = lcaOf2Nodes(root, startValue, destValue);
        StringBuilder start = new StringBuilder();
        StringBuilder dest = new StringBuilder();
        findPath(lca, startValue, start);
        findPath(lca, destValue, dest);
        StringBuilder path = new StringBuilder();
        for (int i = 0; i < start.length(); i++) {
            path.append("U");
        }
        path.append(dest);
        //System.out.println("final lca " + lca.val);
        return path.toString();
    }

    private boolean findPath(TreeNode root, int value, StringBuilder start) {
        if (root == null) {
            return false;
        }
        if (root.val == value) {
            return true;
        }
        start.append("L");
        if (findPath(root.left, value, start)) {
            return true;
        }
        start.setLength(start.length() - 1);
        start.append("R");
        if (findPath(root.right, value, start)) {
            return true;
        }
        start.setLength(start.length() - 1);
        return false;
    }

    private TreeNode lcaOf2Nodes(TreeNode root, int startValue, int destValue) {
        if (root == null) {
            return null;
        }
        if (root.val == startValue || root.val == destValue) {
            //System.out.println("returning curr val " + root.val);
            return root;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        TreeNode left = lcaOf2Nodes(root.left, startValue, destValue);
        TreeNode right = lcaOf2Nodes(root.right, startValue, destValue);
        if (left != null && right != null) {
//            System.out.println("returning root as children have val " + root.val
//                    + " right " + right.val + " left " + left.val);
            return root;
        } else if (left != null) {
            //System.out.println("returning left : root " + root.val + " left " + left.val);
            return left;
        } else {
            if (right != null) {
                //System.out.println("returning right : root " + root.val + " right " + right.val);
            } else {
                //System.out.println("right is null : root - " + root.val);
            }
            return right;
        }
    }
}
