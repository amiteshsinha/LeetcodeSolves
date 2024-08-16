package com.leetcode.binaryTree.createBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import com.leetcode.binaryTree.sameTree.SameTree;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertTrue;

/**
 * CreateBinaryTreeFromDescription
 * 15/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract TreeNode createBinaryTree(int[][] descriptions);

    private SameTree treeCheck = new SameTree();
    @Test
    public void should_give_correct_output1() {
        assertTrue(treeCheck.isSameTree(createBinaryTree(new int[][]{{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}}),
        constructTreeFromArray(new Integer[]{50,20,80,15,17,19})));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(treeCheck.isSameTree(createBinaryTree(new int[][]{{1,2,1},{2,3,0},{3,4,1}}),
        constructTreeFromArray(new Integer[]{1,2,null,null,3,4})));
    }

    @Test
    public void should_give_correct_output3() {
    }
}