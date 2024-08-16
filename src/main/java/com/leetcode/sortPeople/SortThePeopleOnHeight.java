package com.leetcode.sortPeople;

import java.util.ArrayList;
import java.util.List;

public class SortThePeopleOnHeight extends AbstractParent {

    @Override
    public String[] sortPeople(String[] names, int[] heights) {
        List<People> peopleList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            People people = new People(names[i], heights[i]);
            peopleList.add(people);
        }
        peopleList.sort((a,b) -> b.height - a.height);
        int i = 0;
        for (People people : peopleList) {
            names[i] = people.name;
            i++;
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
