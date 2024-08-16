package com.leetcode.binaryTree.uniValuedBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * UnivaluedBinaryTree
 * 09/06/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isUnivalTree(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        assertTrue(isUnivalTree(TreeNode.constructTreeFromArray(new Integer[]{1,1,1,1,1,null,1})));
    }

    @Test
    public void should_give_correct_output2() {
        assertFalse(isUnivalTree(TreeNode.constructTreeFromArray(new Integer[]{2,2,2,5,2})));
    }

    @Test
    public void should_give_correct_output3() {
    }
}