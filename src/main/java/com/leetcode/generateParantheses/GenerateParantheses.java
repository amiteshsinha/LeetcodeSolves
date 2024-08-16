package com.leetcode.generateParantheses;

import java.util.ArrayList;
import java.util.List;

/**
 * N*2 positions, and N brackets of each type (2N!) / N!*N!
 * 1 - 1  1*2 = 2!/1!*1! = 2 -   () //incorrect- )(    00, 01, 10
 * <p>
 * 2 - 2  2*3 = 4!/2!*2! = 6 -    //incorrect- )()(, ))((, )((), ())(     0000, 0001, 0010, 0011, 0100, 0101, 0110  - 0101, 0011'
 * ()(), 5 - 0101
 * (()), 3 - 0011
 * <p>
 * 3 - 5  5*4 = 6!/3!*3! = 20 -
 * ((())), 7  - 000111
 * (()()), 11 - 001011
 * (())(), 13 - 001101
 * ()(()), 19 - 010011
 * ()()(), 21 - 010101
 * <p>
 * 4 - 14 14*5 = 8!/4!*4! = 70 -
 * ()()()(), 85 - 01010101 //not included
 * (()()()), 43 - 00101011
 * (())()(), 53 - 00110101
 * ()(())(), 77 - 01001101 //not included
 * ()()(()), 83 - 01010011 //not included
 * (())(()), 51 - 00110011
 * (()())(), 45 - 00101101
 * ()(()()), 75 - 01001011 // not included
 * ((())()), 27 - 00011011
 * (()(())), 39 - 00100111
 * ((()))(), 29 - 00011101
 * ()((())), 71 - 01000111
 * (((()))), 15 - 00001111
 * ((()())), 23 - 00010111
 * <p>
 * 5 - 42 42*6 = 10!/5!*5! = 252
 */
public class GenerateParantheses extends AbstractGenerateParanthesesTests {

    public static void main(String[] args) {
        AbstractGenerateParanthesesTests generateParantheses = new GenerateParantheses();
        for (int i = 1; i <= 8; i++) {
            generateParantheses.generateParenthesis(i);
            System.out.println();
        }
    }

    /**
     * Algorithm - for any given value n - we need to find parantheses string which need to be of length 2n.
     * For n = 3 - we need parantheses string of length 6 - for ex  - ((()))
     *
     * For generating all the parantheses we are using brute force approach.
     * Approach - we are going to use bitmap for generating all combinations for the parantheses treating 0 as "(" and 1 as ")"
     * For ex - 0101 becomes ()() and 0011 becomes 0011.
     * So we need bit strings of length 2n. How do we find the start and end of the range for which we need to check
     * if we look at the sample data - we find that the min number always corresponds to the all enclosed parantheses eg- ((()))
     * and the max number of the range always corresponds to n pair of parantheses in line eg - ()()().
     * Hence - we first generate binary strings corresponding to min and max for n and then convert them to range of numbers.
     * if we look at all the data - we see that all the valid parantheses strings always correspond to odd numbers
     * (since even no would mean last bit is 0 and that means "(" at end which is not valid)
     *
     * So- for all odd numbers in the range of  min and max (both inclusive) - find out the parantheses string
     * validate if the parantheses string generated is valid or not - if it is - add to the return list.
     *
     * @param n
     * @return
     */
    @Override
    public List<String> generateParenthesis(int n) {
        StringBuilder tempStringMax = new StringBuilder();
        StringBuilder tempStringMin = new StringBuilder();
        for (int i = 0; i < n; i++) {
            tempStringMax.append("01");
            tempStringMin.append("1");
        }
        int min = Integer.parseInt(tempStringMin.toString(), 2);
        int max = Integer.parseInt(tempStringMax.toString(), 2);
        List<String> retList = new ArrayList<>();
        for (int i = min; i <= max; i = i + 2) {
            if (n == Integer.bitCount(i)) {
                char[] charArr = Integer.toBinaryString(i).toCharArray();
                //System.out.println(i + " " + Integer.bitCount(i) + " " + new String(charArr));
                int stringLength = 2 * n, arrayLength = charArr.length - 1, forward = n;
                char[] finalArr = new char[stringLength];
                while (stringLength > 0) {
                    if (arrayLength >= 0) {
                        if (charArr[arrayLength] == '1') {
                            finalArr[stringLength - 1] = ')';
                        } else {
                            finalArr[stringLength - 1] = '(';
                            forward--;
                        }
                        arrayLength--;
                    } else {
                        if (forward > 0) {
                            finalArr[stringLength - 1] = '(';
                            forward--;
                        }
                    }
                    stringLength--;
                }
                if (isValid(finalArr)) {
                    String finalString = new String(finalArr);
                    //System.out.println(finalString);
                    retList.add(finalString);
                }
            }
        }
        return retList;
    }
}
