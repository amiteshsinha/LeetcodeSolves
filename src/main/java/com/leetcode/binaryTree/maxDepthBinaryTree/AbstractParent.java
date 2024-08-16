package com.leetcode.binaryTree.maxDepthBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;

/**
 * MaxDepthOfBinaryTree
 * 01/06/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxDepth(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        TreeNode root = constructTreeFromArray(new Integer[]{3,9,20,null,null,15,7});
        Assert.assertEquals(maxDepth(root), 3);
    }

    @Test
    public void should_give_correct_output2() {
        TreeNode root = constructTreeFromArray(new Integer[]{1,null,2});
        Assert.assertEquals(maxDepth(root), 2);
    }

    @Test
    public void should_give_correct_output3() {
        TreeNode root = constructTreeFromArray(new Integer[]{});
        Assert.assertEquals(maxDepth(root), 0);
    }

    @Test
    public void should_give_correct_output4() {
        TreeNode root = constructTreeFromArray(new Integer[]{0});
        Assert.assertEquals(maxDepth(root), 1);
    }
}