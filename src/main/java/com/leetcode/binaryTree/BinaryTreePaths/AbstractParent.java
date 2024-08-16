package com.leetcode.binaryTree.BinaryTreePaths;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertTrue;

/**
 * BinaryTreeLeafPaths
 * 07/06/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<String> binaryTreePaths(TreeNode root);

    @Test
    public void should_give_correct_output1() {
        assertTrue(binaryTreePaths(constructTreeFromArray(new Integer[]{1,2,3,null,5})).containsAll(Arrays.asList("1->2->5","1->3")));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(binaryTreePaths(constructTreeFromArray(new Integer[]{3,9,20,null,null,15,7})).containsAll(Arrays.asList("3->9","3->20->15",
                "3->20->7")));
    }

    @Test
    public void should_give_correct_output3() {
        assertTrue(binaryTreePaths(constructTreeFromArray(new Integer[]{1,2,2,3,3,null,null,4,4})).containsAll(Arrays.asList("1->2", "1->2->3",
                "1->2->3", "1->2->3->4","1->2->3->4")));
    }

    @Test
    public void should_give_correct_output4() {
        assertTrue(binaryTreePaths(constructTreeFromArray(new Integer[]{1})).containsAll(Arrays.asList("1")));
    }

    @Test
    public void should_give_correct_output5() {
        assertTrue(binaryTreePaths(constructTreeFromArray(new Integer[]{1,2,3,4})).containsAll(Arrays.asList("1->2->4","1->3")));
    }
}