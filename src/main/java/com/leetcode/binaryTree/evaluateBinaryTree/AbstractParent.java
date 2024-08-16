package com.leetcode.binaryTree.evaluateBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;

/**
 * EvaluateBinaryTree
 * 20/05/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean evaluateTree(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        TreeNode root = constructTreeFromArray(new Integer[]{2,1,3,null,null,0,1});
        Assert.assertEquals(evaluateTree(root), true);
    }

    @Test
    public void should_give_correct_output2() {
        TreeNode root = constructTreeFromArray(new Integer[]{0});
        Assert.assertEquals(evaluateTree(root), false);
    }

    @Test
    public void should_give_correct_output3() {
        TreeNode root = constructTreeFromArray(new Integer[]{1});
        Assert.assertEquals(evaluateTree(root), true);
    }
}