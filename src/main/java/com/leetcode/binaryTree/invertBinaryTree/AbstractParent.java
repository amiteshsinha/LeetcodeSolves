package com.leetcode.binaryTree.invertBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import com.leetcode.binaryTree.sameTree.SameTree;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertTrue;

/**
 * InvertBinaryTree
 * 06/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract TreeNode invertTree(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        assertTrue(new SameTree().isSameTree(invertTree(constructTreeFromArray(new Integer[]{4, 2, 7, 1, 3, 6, 9})),
                constructTreeFromArray(new Integer[]{4, 7, 2, 9, 6, 3, 1})));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(new SameTree().isSameTree(invertTree(constructTreeFromArray(new Integer[]{2,1,3})),
                constructTreeFromArray(new Integer[]{2, 3, 1})));
    }

    @Test
    public void should_give_correct_output3() {
        assertTrue(new SameTree().isSameTree(invertTree(constructTreeFromArray(new Integer[]{})),
                constructTreeFromArray(new Integer[]{})));
    }
}