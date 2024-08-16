package com.leetcode.binaryTree.minDepthBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;

/**
 * MinDepthBinaryTree
 * 10/06/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minDepth(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        TreeNode root = constructTreeFromArray(new Integer[]{3,9,20,null,null,15,7});
        Assert.assertEquals(minDepth(root), 2);
    }

    @Test
    public void should_give_correct_output2() {
        TreeNode root = constructTreeFromArray(new Integer[]{1,null,2});
        Assert.assertEquals(minDepth(root), 2);
    }

    @Test
    public void should_give_correct_output3() {
        TreeNode root = constructTreeFromArray(new Integer[]{});
        Assert.assertEquals(minDepth(root), 0);
    }

    @Test
    public void should_give_correct_output4() {
        TreeNode root = constructTreeFromArray(new Integer[]{2,null,3,null,4,null,5,null,6});
        Assert.assertEquals(minDepth(root), 5);
    }
}