package com.leetcode.dividePlayersIntoEqualSkillTeams;

import java.util.Arrays;

/**
 * This file was created on 04/10/24 / Friday
 */
public class DividePlayersIntoEqualSkillTeams extends AbstractParent {

    @Override
    public long dividePlayers(int[] skill) {
        if (skill.length == 2) {
            return skill[0]*skill[1];
        }
        Arrays.sort(skill);
        long retVal = 0l;
        int avg = skill[0] + skill[skill.length - 1], temp;
        for (int i = 0, j = skill.length - 1; i <j; i++,j--) {
            temp = skill[i] + skill[j];
            if (temp != avg) {
                return -1;
            }
            retVal += skill[i] * skill[j];
        }
        return retVal;
    }

}
