package com.leetcode.binarySearchTree.bstToGreaterSumTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class BSTtoGST extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.56
     * MB
     * Beats
     * 96.72%
     * @param root
     * @return
     */
    int currVal = 0;
    @Override
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }
        bstToGst(root.right);
        root.val += currVal;
        currVal = root.val;
        bstToGst(root.left);
        return root;
    }

    // Apparently the list mode consumes less memory than the class field mode
    // This takes 1 ms with the other leetcode problem statement
    //public TreeNode bstToGst(TreeNode root) {
    //        return bstToGst(root, new ArrayList<Integer>());
    //    }
    //
    //    private TreeNode bstToGst(TreeNode root, List<Integer> list) {
    //        if (root == null) {
    //            return null;
    //        }
    //        bstToGst(root.right, list);
    //        if (!list.isEmpty()) {
    //            root.val += list.get(list.size() - 1);
    //        }
    //        list.add(root.val);
    //        bstToGst(root.left, list);
    //        return root;
    //    }
}
