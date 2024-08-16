package com.leetcode.binarySearchTree.balanceBST;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import com.leetcode.binaryTree.sameTree.SameTree;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertTrue;

/**
 * BalanceBST
 * 26/06/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    SameTree tree = new SameTree();

    public abstract TreeNode balanceBST(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        assertTrue(tree.isSameTree(balanceBST(constructTreeFromArray(new Integer[]{1,null,2,null,3,null,4,null,null})),
                constructTreeFromArray(new Integer[]{2,1,3,null,null,null,4})));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(tree.isSameTree(balanceBST(constructTreeFromArray(new Integer[]{2,1,3})),
                constructTreeFromArray(new Integer[]{2,1,3})));
    }

    @Test
    public void should_give_correct_output3() {
    }
}