package com.leetcode.binaryTree.kthLargestSumPerLevelBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertEquals;

/**
 * KthLargestSumPerLevelBTree
 * <p>
 * This file was created on 22/10/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract long kthLargestLevelSum(TreeNode root, int k);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(kthLargestLevelSum(constructTreeFromArray(new Integer[]{5,8,9,2,1,3,7,4,6}), 2), 13);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(kthLargestLevelSum(constructTreeFromArray(new Integer[]{1,2,null,3}), 1), 3);
    }

    @Test
    public void should_give_correct_output_3() {
    }
}
