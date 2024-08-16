package com.leetcode.binaryTree.sameTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * SameTree
 * 06/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isSameTree(TreeNode p, TreeNode q);

    @Test
    public void should_give_correct_output1() {
        assertTrue(isSameTree(constructTreeFromArray(new Integer[]{1,2,3}), constructTreeFromArray(new Integer[]{1,2,3})));
    }

    @Test
    public void should_give_correct_output2() {
        assertFalse(isSameTree(constructTreeFromArray(new Integer[]{1,2}), constructTreeFromArray(new Integer[]{1,null,2})));
    }

    @Test
    public void should_give_correct_output3() {
        assertFalse(isSameTree(constructTreeFromArray(new Integer[]{1,2,1}), constructTreeFromArray(new Integer[]{1,1,2})));
    }
}