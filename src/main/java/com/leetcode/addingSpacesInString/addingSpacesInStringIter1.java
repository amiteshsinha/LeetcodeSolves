package com.leetcode.addingSpacesInString;

/**
 * Runtime
 * 10
 * ms
 * Beats
 * 98.36%
 *
 * Memory
 * 79.06
 * MB
 * Beats
 * 78.28%
 * This file was created on 03/12/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class addingSpacesInStringIter1 extends AbstractParent {

    static char SPACE = ' ';

    @Override
    public String addSpaces(String s, int[] spaces) {
        char[] charArr = new char[s.length() + spaces.length];
        int start = 0;
        for(int index = 0; index < spaces.length; index++) {
            //temp = s.substring(start, spaces[index]);
            for (int i = start; i < spaces[index] ; i++) {
                charArr[i + index] = s.charAt(i);
            }
            charArr[spaces[index] + index] = SPACE;
            start = spaces[index];
        }
        for(int i = start; i < s.length(); i++) {
            charArr[i + spaces.length] = s.charAt(i);
        }
        return new String(charArr);
    }

}
