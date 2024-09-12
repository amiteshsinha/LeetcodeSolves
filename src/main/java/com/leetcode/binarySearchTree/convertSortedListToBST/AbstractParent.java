package com.leetcode.binarySearchTree.convertSortedListToBST;

import com.amitesh.core.baseclass.ListNode;
import com.amitesh.core.baseclass.TreeNode.TreeNode;
import com.leetcode.binaryTree.sameTree.SameTree;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.ListNode.createList;
import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * ConvertSortedLinkedListToBST
 * 10/09/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract TreeNode sortedListToBST(ListNode head);
    SameTree sameTree = new SameTree();

    @Test
    public void should_give_correct_output1() {
        assertTrue(sameTree.isSameTree(sortedListToBST(createList(new int[]{-10,-3,0,5,9})),
                constructTreeFromArray(new Integer[]{0,-10,5,null,-3,null,9})));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(sameTree.isSameTree(sortedListToBST(createList(new int[]{})),
                constructTreeFromArray(new Integer[]{})));
    }

    @Test
    public void should_give_correct_output3() {
    }
}