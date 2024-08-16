package com.leetcode.binaryTree.symmetricTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * SymmetricTree
 * 06/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isSymmetric(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        assertTrue(isSymmetric(constructTreeFromArray(new Integer[]{1,2,2,3,4,4,3})));
    }

    @Test
    public void should_give_correct_output2() {
        assertFalse(isSymmetric(constructTreeFromArray(new Integer[]{1, 2, 2, null, 3, null, 3})));
    }

    @Test
    public void should_give_correct_output3() {
        assertTrue(isSymmetric(constructTreeFromArray(new Integer[]{1})));
    }

    @Test
    public void should_give_correct_output4() {
        assertTrue(isSymmetric(constructTreeFromArray(new Integer[]{1,2,2})));
    }
}