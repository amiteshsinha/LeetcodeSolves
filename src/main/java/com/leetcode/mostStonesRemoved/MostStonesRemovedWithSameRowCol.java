package com.leetcode.mostStonesRemoved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostStonesRemovedWithSameRowCol extends AbstractParent {

    @Override
    public int removeStones(int[][] stones) {
         Node[] xCoOrdParentArr = new Node[100000];
         Node[] yCoOrdParentArr = new Node[100000];
        int retVal = 0, x, y;
        for (int[] coOrds : stones) {
            x = coOrds[0]; y = coOrds[1];
            Node temp = new Node(x, y);
            if (xCoOrdParentArr[x] != null) {
                xCoOrdParentArr[x].childList.add(temp);
                retVal++;
                continue;
            } else {
                xCoOrdParentArr[x] = temp;
            }
            if (yCoOrdParentArr[y] != null) {
                yCoOrdParentArr[y].childList.add(temp);
                retVal++;
                continue;
            } else {
                yCoOrdParentArr[y] = temp;
            }
        }
        return retVal;
    }

    class Node {
        int x;
        int y;
        List<Node> childList = new ArrayList<>();
        Node(int _x, int _y) {
            x = _x;
            y = _y;
        }
    }
}
