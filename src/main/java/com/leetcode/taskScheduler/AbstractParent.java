package com.leetcode.taskScheduler;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * TaskSchedulerBruteForce
 * 19/03/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int leastInterval(char[] tasks, int n);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(leastInterval(new char[]{'A','A','A','B','B','B'}, 2),
                8, "AB AB AB");
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(leastInterval(new char[]{'A','A','A','B','B','B'}, 3),
                10, "AB  AB  AB");
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(leastInterval(new char[]{'A','C','A','B','D','B'}, 1),
                6, "ABABCD");
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(leastInterval(new char[]{'A','A','A','A','B','B','B','C','C','D','E'}, 2),
                11, "ABCABCABDAE");
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(leastInterval(new char[]{'A','A','A','A','B','B','B','C','C','D','E'}, 3),
                13, "ABCDABCEAB  A");
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(leastInterval(new char[]{'A','A','A','B','B','B','C','C','C','D','D','D','E','E','E'}, 3),
                15, "ABCDEABCDEABCDE");
    }

    @Test
    public void should_give_correct_output7() {
        Assert.assertEquals(leastInterval(new char[]{'A','A','A','B','B','B', 'C','C','C', 'D', 'D', 'E'}, 2),
                12, "ABCABCADBCDE");
    }

    @Test
    public void should_give_correct_output8() {
        Assert.assertEquals(leastInterval(new char[]{'A','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}, 29),
                31, "ABCDEFGHIJKLMNOPQRSTUVWXYZ    A");
    }

    @Test
    public void should_give_correct_output9() {
        Assert.assertEquals(leastInterval(new char[]{'A','A','B','B','C','C','D','D','E','E','F','F','G','G','H','H','I','I','J','J','K','K','L','L','M','M','N','N','O','O','P','P','Q','Q','R','R','S','S','T','T','U','U','V','V','W','W','X','X','Y','Y','Z','Z'}, 2),
                52, "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }
}