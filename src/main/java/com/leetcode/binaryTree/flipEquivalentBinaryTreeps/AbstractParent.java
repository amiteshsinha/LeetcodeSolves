package com.leetcode.binaryTree.flipEquivalentBinaryTreeps;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * FlipEquivalentBinaryTrees
 * <p>
 * This file was created on 24/10/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean flipEquiv(TreeNode root1, TreeNode root2);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(flipEquiv(constructTreeFromArray(new Integer[]{1,2,3,4,5,6,null,null,null,7,8}),
                constructTreeFromArray(new Integer[]{1,3,2,null,6,4,5,null,null,null,null,8,7})));
    }

    @Test
    public void should_give_correct_output_2() {
        assertTrue(flipEquiv(constructTreeFromArray(new Integer[]{}), constructTreeFromArray(new Integer[]{})));
    }

    @Test
    public void should_give_correct_output_3() {
        assertFalse(flipEquiv(constructTreeFromArray(new Integer[]{1}),
                constructTreeFromArray(new Integer[]{})));
    }

    @Test
    public void should_give_correct_output_4() {
        assertFalse(flipEquiv(constructTreeFromArray(new Integer[]{0,3,1,null,null,null,2}),
                constructTreeFromArray(new Integer[]{0,3,1,2})));
    }

    @Test
    public void should_give_correct_output_5() {
        assertFalse(flipEquiv(constructTreeFromArray(new Integer[]{}),
                constructTreeFromArray(new Integer[]{1})));
    }
}
