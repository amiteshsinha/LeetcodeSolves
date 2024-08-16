package com.leetcode.binaryTree.convertBinaryTreeToSortedArray;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * ConvertSortedArrayToBinary
 * 02/06/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract TreeNode sortedArrayToBST(int[] nums);

    @Test
    public void should_give_correct_output1() {
        TreeNode root = sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }

    @Test
    public void should_give_correct_output2() {
    }

    @Test
    public void should_give_correct_output3() {
    }
}