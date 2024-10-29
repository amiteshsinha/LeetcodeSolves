package com.leetcode.binaryTree.heightAfterSubTreeRemoval;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertEquals;

/**
 * HeightAfterSubtreeRemovalQueries
 * <p>
 * This file was created on 26/10/24 / Saturday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int[] treeQueries(TreeNode root, int[] queries);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(treeQueries(constructTreeFromArray(new Integer[]{1,3,4,2,null,6,5,null,null,null,null,null,7}),
                        new int[]{4}),
                new int[]{2});
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(treeQueries(constructTreeFromArray(new Integer[]{5,8,9,2,1,3,7,4,6}),
                        new int[]{3,2,4,8}),
                new int[]{3,2,3,2});
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(treeQueries(constructTreeFromArray(new Integer[]{1,null,5,3,null,2,4}),
                        new int[]{3,5,4,2,4}),
                new int[]{1,0,3,3,3});
    }
}
