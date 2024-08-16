package com.leetcode.binaryTree.StepByStepDirectionShortestPath;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertEquals;

/**
 * StepByStepGetDirectionShortestPath
 * 16/07/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String getDirections(TreeNode root, int startValue, int destValue);

    @Test
    public void should_give_correct_output1() {
        assertEquals(getDirections(constructTreeFromArray(new Integer[]{5,1,2,3,null,6,4}),
                3,6), "UURL");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(getDirections(constructTreeFromArray(new Integer[]{2,1}),
                2,1), "L");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(getDirections(constructTreeFromArray(new Integer[]{3,5,1,6,2,0,8,null,null,7,4}),
                5,4), "RR");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(getDirections(constructTreeFromArray(new Integer[]{3,5,1,6,2,0,8,null,null,7,4}),
                5,1), "UR");
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(getDirections(constructTreeFromArray(new Integer[]{3,5,1,6,2,0,8,null,null,7,4}),
                0,7), "UULRL");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(getDirections(constructTreeFromArray(new Integer[]{3,5,1,6,2,0,8,null,null,7,4}),
                7,0), "UUURL");
    }
}