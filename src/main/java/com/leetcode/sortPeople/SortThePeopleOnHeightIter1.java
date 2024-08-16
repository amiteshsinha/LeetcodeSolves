package com.leetcode.sortPeople;

public class SortThePeopleOnHeightIter1 extends AbstractParent {

    /**
     * Runtime
     * 7
     * ms
     * Beats
     * 90.64%
     *
     * Memory
     * 45.07
     * MB
     * Beats
     * 82.91%
     * @param names
     * @param heights
     * @return
     */
    @Override
    public String[] sortPeople(String[] names, int[] heights) {
        int maxHeight = 0;
        for (int i : heights) {
            if (i > maxHeight) {
                maxHeight = i;
            }
        }
        People[] peopleList = new People[maxHeight + 1];
        for (int i = 0; i < names.length; i++) {
            People people = new People(names[i], heights[i]);
            peopleList[heights[i]] = people;
        }
        int i = 0;
        for (int j = maxHeight; j >= 0; j--) {
            if (peopleList[j] != null) {
                names[i] = peopleList[j].name;
                i++;
            }
        }
        return names;
    }

    class People {
        final String name;
        final int height;
        People(String name, int height) {
            this.name = name;
            this. height = height;
        }
    }
}
