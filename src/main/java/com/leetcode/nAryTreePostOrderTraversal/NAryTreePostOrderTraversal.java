package com.leetcode.nAryTreePostOrderTraversal;

import com.amitesh.core.baseclass.nAryTreeNode.Node;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostOrderTraversal extends AbstractParent {

    List<Integer> retOrderList = new ArrayList<>();

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 44.41
     * MB
     * Beats
     * 90.29%
     */
    @Override
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return retOrderList;
        }
        if (root.children != null && !root.children.isEmpty()) {
            for (Node node : root.children) {
                postorder(node);
            }
            retOrderList.add(root.val);
        } else {
            retOrderList.add(root.val);
        }
        return retOrderList;
    }
}
