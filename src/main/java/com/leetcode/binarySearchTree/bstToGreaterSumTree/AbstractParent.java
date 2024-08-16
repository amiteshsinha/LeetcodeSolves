package com.leetcode.binarySearchTree.bstToGreaterSumTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import com.leetcode.binaryTree.sameTree.SameTree;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertTrue;

/**
 * BSTtoGST
 * 25/06/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract TreeNode bstToGst(TreeNode root);

    SameTree treeCheck = new SameTree();

    @Test
    public void should_give_correct_output1() {
        assertTrue(treeCheck.isSameTree(bstToGst(constructTreeFromArray(new Integer[]{4,1,6,0,2,5,7,null,null,null,3,null,null,null,8})),
        constructTreeFromArray(new Integer[] {30,36,21,36,35,26,15,null,null,null,33,null,null,null,8})));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(treeCheck.isSameTree(bstToGst(constructTreeFromArray(new Integer[]{0,null,1})),
                constructTreeFromArray(new Integer[] {1,null,1})));

    }
}