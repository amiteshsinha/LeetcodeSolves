package com.leetcode.binaryTree.heightAfterSubTreeRemoval;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

/**
 *
 * This file was created on 26/10/24 / Saturday
 *
 * @author Amitesh Sinha
 */
public class HeightAfterSubtreeRemovalQueriesIter1 extends AbstractParent {

    /**
     * height of the tree after removal of the node.
     * There can be n nodes and max n queries. if we can pre-calculate the result in an array of size n
     * we can instantaneously return the result.
     * WE need all paths till max height of tree.
     * If there is only 1 path with max height and If the node part of that -
     *  then we will need to figure out what is the next biggest height.
     *
     *  Maybe we can construct a parallel tree where we keep
     *
     * @param root
     * @param queries
     * @return
     */
    @Override
    public int[] treeQueries(TreeNode root, int[] queries) {
        int[] retArr = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            //retArr[i] = getMaxDepth(root, queries[i]) - 1;
        }
        return retArr;
    }

    }
