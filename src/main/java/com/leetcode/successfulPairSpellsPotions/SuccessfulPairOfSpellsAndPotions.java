package com.leetcode.successfulPairSpellsPotions;

import java.util.Arrays;

public class SuccessfulPairOfSpellsAndPotions extends AbstractParent {

    /**
     * Runtime
     * 34
     * ms
     * Beats
     * 96.58%
     *
     * Memory
     * 64.23
     * MB
     * Beats
     * 62.77%
     * @param spells
     * @param potions
     * @param success
     * @return
     */
    @Override
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int max, spellLength = spells.length, potionLength = potions.length, mid, start, end ;
        long prod;
        Arrays.sort(potions);
        max = potions[potionLength - 1];
        int[] retValArr = new int[spellLength];
        for (int i = 0; i < spellLength; i++) {
            prod = (long) max*spells[i];
            if (prod < success) {
                retValArr[i] = 0;
                continue;
            }
            start = 0; end = potionLength - 1;
            while (start <= end) {
                mid = (start + end)/2;
                prod = (long) spells[i]*potions[mid];
                if (prod >= success) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            retValArr[i] = potionLength - start;
        }
        return retValArr;
    }
}
