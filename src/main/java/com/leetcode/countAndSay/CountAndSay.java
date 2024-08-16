package com.leetcode.countAndSay;

public class CountAndSay extends AbstractCountAndSay {

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(6));
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            return say(countAndSay(n - 1));
        }
    }


    public String say(String n) {
        String retString = "";
        int i = 0;
        char prev = 'a';
        int count = 0;
        while (i < n.length()) {
            char currentChar = n.charAt(i);
            if (currentChar == prev) {
                count++;
            } else {
                if (prev == 'a') {
                    prev = currentChar;
                } else {
                    retString += count + "" + prev;
                    prev = currentChar;
                }
                count = 1;
            }
            i++;
        }
        retString += count + "" + prev;
        return retString;
    }
}
