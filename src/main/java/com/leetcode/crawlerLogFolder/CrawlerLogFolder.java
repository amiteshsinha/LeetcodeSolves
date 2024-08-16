package com.leetcode.crawlerLogFolder;

public class CrawlerLogFolder extends AbstractParent {


    @Override
    public int minOperations(String[] logs) {
        int count = 0;
        for (String move : logs) {
            if (move.charAt(1) == '.') {
                if (count > 0) {
                    count--;
                }
            } else if (move.charAt(0) == '.') {
                continue;
            } else {
                count++;
            }
        }
        return count;
    }
}
