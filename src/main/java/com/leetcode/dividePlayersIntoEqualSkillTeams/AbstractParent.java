package com.leetcode.dividePlayersIntoEqualSkillTeams;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * DividePlayersIntoEqualSkillTeams
 * This file was created on 04/10/24 / Friday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract long dividePlayers(int[] skill);

    @Test
    public void should_give_correct_output1() {
        assertEquals(dividePlayers(new int[]{3,2,5,1,3,4}), 22);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(dividePlayers(new int[]{3,4}), 12);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(dividePlayers(new int[]{1,1,2,3}), -1);
    }
}
