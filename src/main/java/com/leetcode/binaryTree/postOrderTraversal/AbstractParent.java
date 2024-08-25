package com.leetcode.binaryTree.postOrderTraversal;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static java.util.Arrays.asList;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * PostOrderTraversal
 * 25/08/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<Integer> postorderTraversal(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        assertEquals(postorderTraversal(constructTreeFromArray(new Integer[]{1,null,2,3})),
                asList(3,2,1));
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(postorderTraversal(constructTreeFromArray(new Integer[]{1})),
                asList(1));
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(postorderTraversal(constructTreeFromArray(new Integer[]{})),
                asList());
    }
}