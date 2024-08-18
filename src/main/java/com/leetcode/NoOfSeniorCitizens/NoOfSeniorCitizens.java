package com.leetcode.NoOfSeniorCitizens;

public class NoOfSeniorCitizens extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 42.06
     * MB
     * Beats
     * 92.01%
     * @param details
     * @return
     */
    @Override
    public int countSeniors(String[] details) {
        int retVal = 0;
        for (String person : details) {
            if ((person.charAt(11) - '0')*10 + (person.charAt(12)- '0') > 60) {
                retVal++;
            }
        }
        return retVal;
    }
}
