package com.leetcode.noOfAtoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoOfAtoms extends AbstractParent {
    int i = 0;

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 99.77%
     *
     * Memory
     * 41.52
     * MB
     * Beats
     * 70.59%
     * @param formula
     * @return
     */
    @Override
    public String countOfAtoms(String formula) {
        StringBuilder ret = new StringBuilder();
        Map<String, Integer> temp = getCountMap(formula.toCharArray());
        List<String> atomList = new ArrayList<>(temp.keySet());
        Collections.sort(atomList);
        for (String atom : atomList) {
            ret.append(atom);
            if (temp.get(atom) > 1) {
                ret.append(temp.get(atom));
            }
        }
        return ret.toString();
    }

    private Map<String, Integer> getCountMap(char[] s) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Integer> tempMap = null;
        StringBuilder temp = new StringBuilder();
        int count = 0;
        while (i < s.length) {
            if (s[i] == ')' || s[i] == '(' || Character.isUpperCase(s[i])) {
                if (tempMap != null) {
                    count = (count == 0) ? 1 : count;
                    for (String atom : tempMap.keySet()) {
                        if (countMap.containsKey(atom)) {
                            countMap.put(atom, countMap.get(atom) + tempMap.get(atom) * count);
                        } else {
                            countMap.put(atom, tempMap.get(atom) * count);
                        }
                    }
                    count = 0;
                    tempMap = null;//temp map to null ?
                }
                if (temp.length() > 0) {
                    count = (count == 0) ? 1 : count;
                    String key = temp.toString();
                    countMap.put(key, countMap.getOrDefault(key, 0) + count);
                    count = 0;
                    temp = new StringBuilder();
                }
            }
            if (s[i] == ')') {
                i++;
                return countMap;
            } else if (s[i] == '(') {
                i++;
                tempMap = getCountMap(s);
            } else {
                if (Character.isUpperCase(s[i])) {
                    temp.append(s[i]);
                } else if (Character.isLowerCase(s[i])) {
                    temp.append(s[i]);
                } else if (Character.isDigit(s[i])) {
                    count = count * 10 + (s[i] - '0');
                }
                i++;
            }
        }

        if (tempMap != null) {
            count = (count == 0) ? 1 : count;
            for (String atom : tempMap.keySet()) {
                if (countMap.containsKey(atom)) {
                    countMap.put(atom, countMap.get(atom) + tempMap.get(atom) * count);
                } else {
                    countMap.put(atom, tempMap.get(atom) * count);
                }
            }
            count = 0;
            tempMap = null;
        }
        if (temp.length() > 0) {
            count = (count == 0) ? 1 : count;
            String key = temp.toString();
            countMap.put(key, countMap.getOrDefault(key, 0) + count);
        }
        return countMap;
    }
}
