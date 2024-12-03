package com.leetcode.addingSpacesInString;

/**
 * Runtime
 * 24
 * ms
 * Beats
 * 58.36%
 * <p>
 * Memory
 * 81.88
 * MB
 * Beats
 * 7.32%
 * This file was created on 03/12/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class addingSpacesInString extends AbstractParent {

    static String SPACE = " ";

    @Override
    public String addSpaces(String s, int[] spaces) {
        StringBuilder stringBuilder = new StringBuilder();
        int start = 0;
        String temp;
        for(int index : spaces) {
            temp = s.substring(start, index);
            stringBuilder.append(temp);
            stringBuilder.append(SPACE);
            start = index;
        }
        stringBuilder.append(s.substring(start));
        return stringBuilder.toString();
    }

}
