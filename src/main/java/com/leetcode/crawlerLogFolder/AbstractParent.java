package com.leetcode.crawlerLogFolder;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * CrawlerLogFolder
 * 10/07/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minOperations(String[] logs);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minOperations(new String[]{"d1/","d2/","../","d21/","./"}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}), 3);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minOperations(new String[]{"d1/","../","../","../"}), 0);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(minOperations(new String[]{"./","../","./"}), 0);
    }
}