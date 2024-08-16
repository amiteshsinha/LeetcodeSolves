package com.leetcode.countAndSay;

public class CountAndSay2 extends AbstractCountAndSay {

    public static void main(String[] args) {
        System.out.println(new CountAndSay2().countAndSay(6));
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            return say(countAndSay(n - 1));
        }
    }


    public String say(String n) {
        StringBuilder retString = new StringBuilder();
        char prev = n.charAt(0);
        int count = 1;
        for (int i = 1; i < n.length(); i++) {
            char current = n.charAt(i);
            if (current != prev) {
                retString.append(count).append(prev);
                count = 1;
                prev = current;
            } else {
                count++;
            }
        }
        retString.append(count).append(prev);
        return retString.toString();
    }
}
