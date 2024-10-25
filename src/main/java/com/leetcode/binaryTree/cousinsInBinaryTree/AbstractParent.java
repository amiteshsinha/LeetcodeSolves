package com.leetcode.binaryTree.cousinsInBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * CousinsInBinaryTree
 * <p>
 * This file was created on 23/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean isCousins(TreeNode root, int x, int y);

    @Test
    public void should_give_correct_output_1() {
        assertFalse(isCousins(constructTreeFromArray(new Integer[]{1,2,3,4}), 4, 3));
    }

    @Test
    public void should_give_correct_output_2() {
        assertTrue(isCousins(constructTreeFromArray(new Integer[]{1,2,3,null,4,null,5}), 4, 5));
    }

    @Test
    public void should_give_correct_output_3() {
        assertFalse(isCousins(constructTreeFromArray(new Integer[]{1,2,3,null,4}), 2, 3));
    }
}
