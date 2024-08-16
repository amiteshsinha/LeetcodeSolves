package com.leetcode.binaryTree.sumOfLeftLeafNodes;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * SumOfLeftLeaves
 * 05/06/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int sumOfLeftLeaves(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(sumOfLeftLeaves(TreeNode.constructTreeFromArray(new Integer[]{3,9,20,null,null,15,7})), 24);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(sumOfLeftLeaves(TreeNode.constructTreeFromArray(new Integer[]{1})), 0);
    }

    @Test
    public void should_give_correct_output3() {
    }
}