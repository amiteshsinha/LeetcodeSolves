package com.leetcode.binaryTree.pathSum;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * PathSum
 * 25/06/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean hasPathSum(TreeNode root, int targetSum);

    @Test
    public void should_give_correct_output1() {
        assertTrue(hasPathSum(constructTreeFromArray(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1}),
                22));
    }

    @Test
    public void should_give_correct_output2() {
        assertFalse(hasPathSum(constructTreeFromArray(new Integer[]{1,2,3}), 5));
    }

    @Test
    public void should_give_correct_output3() {
        assertFalse(hasPathSum(constructTreeFromArray(new Integer[]{}), 0));
    }

    @Test
    public void should_give_correct_output4() {
        assertFalse(hasPathSum(constructTreeFromArray(new Integer[]{1,2}), 1));
    }
}