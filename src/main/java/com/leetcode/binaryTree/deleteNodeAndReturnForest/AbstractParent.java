package com.leetcode.binaryTree.deleteNodeAndReturnForest;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static java.util.Arrays.asList;
import static org.testng.Assert.assertEquals;

/**
 * DeleteNodes
 * 17/07/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<TreeNode> delNodes(TreeNode root, int[] to_delete);

    @Test
    public void should_give_correct_output1() {
        assertEquals(delNodes(constructTreeFromArray(new Integer[]{1,2,3,4,5,6,7}), new int[]{3,5}),
                asList(constructTreeFromArray(new Integer[]{1,2,null,4}),
                        constructTreeFromArray(new Integer[]{6}),
                        constructTreeFromArray(new Integer[]{7})));
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(delNodes(constructTreeFromArray(new Integer[]{1,2,4,null,3}), new int[]{3}),
                asList(constructTreeFromArray(new Integer[]{1,2,4})));
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(delNodes(constructTreeFromArray(new Integer[]{1,2,null,4,3}), new int[]{2,3}),
                asList(constructTreeFromArray(new Integer[]{1}), constructTreeFromArray(new Integer[]{4})));
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(delNodes(constructTreeFromArray(new Integer[]{1,2,3,4,5,6,7}), new int[]{1}),
                asList(constructTreeFromArray(new Integer[]{2,4,5}),
                        constructTreeFromArray(new Integer[]{3,6,7})));
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(delNodes(constructTreeFromArray(new Integer[]{1,2,3,4,5,6,7}), new int[]{1,7}),
                asList(constructTreeFromArray(new Integer[]{2,4,5}),
                        constructTreeFromArray(new Integer[]{3,6})));
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(delNodes(constructTreeFromArray(new Integer[]{1,2,null,4,3}), new int[]{2,3}),
                asList(constructTreeFromArray(new Integer[]{1}), constructTreeFromArray(new Integer[]{4})));
    }
}