package com.leetcode.removeduplicates.sortedarray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public abstract class AbstractParent {

    public abstract int removeDuplicates(int[] nums);

    @Test
    public void test1(){
        int[] nums = new int[]{1,1,2};
        assertEquals(removeDuplicates(nums), 2);
        assertEquals(nums, new int[]{1,2,2});
    }

    @Test
    public void test2(){
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        assertEquals(removeDuplicates(nums), 5);
        assertEquals(nums, new int[]{0,1,2,3,4,2,2,3,3,4});
    }

    @Test
    public void test3(){
        int[] nums = new int[]{1,2};
        assertEquals(removeDuplicates(nums), 2);
        assertEquals(nums, new int[]{1,2});
    }

    @Test
    public void test4(){
        int[] nums = new int[]{1,1,1,1};
        assertEquals(removeDuplicates(nums), 1);
        assertEquals(nums, new int[]{1,1,1,1});
    }

    @Test
    public void test5(){
        int[] nums = new int[]{1,7,9,11,11,11};
        assertEquals(removeDuplicates(nums), 4);
        assertEquals(nums, new int[]{1,7,9,11,11,11});
    }

}
