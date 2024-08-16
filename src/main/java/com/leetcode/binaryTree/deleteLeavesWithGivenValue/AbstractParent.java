package com.leetcode.binaryTree.deleteLeavesWithGivenValue;

import com.amitesh.core.baseclass.TreeNode.TreeNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.amitesh.core.baseclass.TreeNode.TreeNode.constructTreeFromArray;

/**
 * DeleteLeavesFromBTwithValue
 * 17/05/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

      private Integer[] createArrayFromTreeNode(TreeNode root, int length) {
          List<TreeNode> treeList = new ArrayList<>();
          treeList.add(root);
          int i = 0;
          int k = length/2 + 1;
          while (i < k) {
              TreeNode node = treeList.get(i);
              if (node != null) {
                  treeList.add(node.left);
                  treeList.add(node.right);
              }
              i++;
          }
          Integer[] arr = new Integer[length];
          for (i = 0; i < length; i++) {
              arr[i] = treeList.get(i) == null ? null : treeList.get(i).val;
          }
          return arr;
      }

    public abstract TreeNode removeLeafNodes(TreeNode root, int target);

    @Test
    public void should_give_correct_output1() {
        TreeNode root = constructTreeFromArray(new Integer[]{1,2,3,2,null,2,4});
        Integer[] expectedArr = new Integer[]{1,null,3,null,4};
        Assert.assertEquals(createArrayFromTreeNode(removeLeafNodes(root, 2), expectedArr.length), expectedArr);
    }

    @Test
    public void should_give_correct_output2() {
        TreeNode root = constructTreeFromArray(new Integer[]{1,3,3,3,2});
        Integer[] expectedArr = new Integer[]{1,3,null,null,2};
        Assert.assertEquals(createArrayFromTreeNode(removeLeafNodes(root, 3), expectedArr.length), expectedArr);

    }

    @Test
    public void should_give_correct_output3() {
        TreeNode root = constructTreeFromArray(new Integer[]{1,2,null,2,null,2});
        Integer[] expectedArr = new Integer[]{1};
        Assert.assertEquals(createArrayFromTreeNode(removeLeafNodes(root, 2), expectedArr.length), expectedArr);

    }
}