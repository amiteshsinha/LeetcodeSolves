package com.leetcode.binarySearchTree.lca2nodes;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertEquals;

/**
 * LCAOf2Nodes
 * 25/06/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);

    @Test
    public void should_give_correct_output1() {
        assertEquals(lowestCommonAncestor(constructTreeFromArray(new Integer[]{6,2,8,0,4,7,9,null,null,3,5}),
                new TreeNode(2), new TreeNode(8)).val, 6);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(lowestCommonAncestor(constructTreeFromArray(new Integer[]{6,2,8,0,4,7,9,null,null,3,5}),
                new TreeNode(2), new TreeNode(4)).val, 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(lowestCommonAncestor(constructTreeFromArray(new Integer[]{1,2}),
                new TreeNode(1), new TreeNode(2)).val, 1);
    }
}