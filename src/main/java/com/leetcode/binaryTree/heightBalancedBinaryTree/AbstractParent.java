package com.leetcode.binaryTree.heightBalancedBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * HeightBalancedBinaryTree
 * 06/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isBalanced(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        assertTrue(isBalanced(constructTreeFromArray(new Integer[]{3,9,20,null,null,15,7})));
    }

    @Test
    public void should_give_correct_output2() {
        assertFalse(isBalanced(constructTreeFromArray(new Integer[]{1,2,2,3,3,null,null,4,4})));
    }

    @Test
    public void should_give_correct_output3() {
        assertTrue(isBalanced(constructTreeFromArray(new Integer[]{})));
    }

    @Test
    public void should_give_correct_output4() {
        assertFalse(isBalanced(constructTreeFromArray(new Integer[]{1,2,2,3,null,null,3,4,null,null,4})));
    }
}