package com.leetcode.binaryTree.noOfGoodLeafNodePairs;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertEquals;

/**
 * NoOfGoodLeafPairs
 * 18/07/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int countPairs(TreeNode root, int distance);

    @Test
    public void should_give_correct_output1() {
        assertEquals(countPairs(constructTreeFromArray(new Integer[]{1,2,3,null,4}), 3), 1);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(countPairs(constructTreeFromArray(new Integer[]{1,2,3,4,5,6,7}), 3), 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(countPairs(constructTreeFromArray(new Integer[]{7,1,4,6,null,5,3,null,null,null,null,null,2}), 3), 1);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(countPairs(constructTreeFromArray(new Integer[]{11,99,88,77,null,null,66,55,null,null,44,33,null,null,22}), 4), 0);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(countPairs(constructTreeFromArray(new Integer[]{1,1,1}), 2), 1);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(countPairs(constructTreeFromArray(new Integer[]{1,1,1,1,1,1,1}), 3), 2);
    }
}