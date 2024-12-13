package com.leetcode.longestSpecialSubstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Runtime
 * 4
 * ms
 * Beats
 * 80.25%
 *
 * Memory
 * 43.20
 * MB
 * Beats
 * 83.93%
 * This file was created on 10/12/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class LongestSpecialSubstringOccuringAtleastThrice extends AbstractParent {

    @Override
    public int maximumLength(String s) {
        int[] charFreq = new int[26];
        Map<Character, List<Node>> nodeCharMap = new HashMap<>();
        int retVal = -1;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            charFreq[c - 'a']++;
            List<Node> tempList = nodeCharMap.computeIfAbsent(c, k -> new ArrayList<>());
            if (tempList.isEmpty()) {
                tempList.add(new Node(i, i + 1));
            } else {
                Node lastNode = tempList.get(tempList.size() - 1);
                if (lastNode.end == i) {
                    lastNode.end = i + 1;
                } else {
                    tempList.add(new Node(i, i + 1));
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (charFreq[i] >= 3) {
                // find longest contiguous occurrence of this char
                int[] tempFreqArr = new int[charFreq[i] + 1];
                List<Node> nodeList = nodeCharMap.get((char) (i + 'a'));
                for (Node node : nodeList) {
                    tempFreqArr[node.size()]++;
                }
                for (int j = tempFreqArr.length - 1; j > 0; j--) {
                    if (tempFreqArr[j] > 0) {
                        retVal = Math.max(retVal, j - 2);
                        if (tempFreqArr[j] >= 3) {
                            retVal = Math.max(retVal, j);
                        } else if (tempFreqArr[j] > 1 || (j > 0 && tempFreqArr[j - 1] > 0)) {
                            retVal = Math.max(retVal, j - 1);
                        }
                        break;
                    }
                }
            }
        }
        return retVal;
    }

    public class Node {
        int start;
        int end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int size() {
            return end - start;
        }
    }

}
