package com.leetcode.removekdigits;

public class RemoveKDigits extends AbstractParent {

    /**
     * greedy approach - Run a loop from 0 - k and in each iteration get the min string possible. Reuse the string as input.
     * Update1 - In this approach we are doing Integer.parseInt which works for smaller numbers but will fail for excessively large numbers.
     * hence we need to replace the parseint with string comparison for min number
     *
     * Update2 - Now we get timelimit exceeded for TC- should_give_correct_op9() - input string = 10k , k = 1000
     * @param num
     * @param k
     * @return
     */
    @Override
    public String removeKdigits(String num, int k) {
        if (num.length() <= k) {
            return "0";
        }
        int nonZeroChars = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '0') {
                nonZeroChars++;
            }
        }
        if (nonZeroChars <= k) {
            return "0";
        }
        String retVal = num;
        for (int i = 0; i < k; i++) {
            retVal = removeSingleDigit(retVal);
            if (retVal == "0") {
                break;
            }
        }
        return retVal;
    }

    private String removeSingleDigit(String retVal) {
        if (retVal.length() == 1) {
            return "0";
        }
        //int min = Integer.MAX_VALUE;
        String min = retVal;
        for (int i = 0; i < retVal.length(); i++) {
            String temp = retVal.substring(0, i) + retVal.substring(i + 1);
            //min = Math.min(Integer.parseInt(temp), min);
            if (temp == "") {
                return "0";
            }
            min = compareStringForMinIntVal(temp, min);
            if (min == "0") {
                return "0";
            }
        }
        return min;
        //return Integer.toString(min);
    }

    private String compareStringForMinIntVal(String temp, String cur) {
        // reduce trailing 0s if any for temp;
        int i = 0;
        for (i = 0; i< temp.length();i++) {
            if (temp.charAt(i) != '0') {
                break;
            }
        }
        if (i > 0) {
            if (i >= temp.length()) {
                return "0";
            }
            temp = temp.substring(i);
        }
        if (cur.length() < temp.length()) {
            return cur;
        } else if (temp.length() < cur.length()) {
            return temp;
        } else {
            for (i = 0; i < cur.length(); i++) {
                if (cur.charAt(i) != temp.charAt(i)) {
                    return cur.charAt(i) > temp.charAt(i) ? temp : cur;
                }
            }
            return cur;// strings are identical - return cur;
        }
    }
}
