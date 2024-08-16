package com.leetcode.singleNumber3;

import java.util.Arrays;

public class SingleNumber3 extends AbstractParent {

    @Override
    public int[] singleNumber(int[] nums) {
        if (nums.length == 2) {
            return nums;
        }
        int[] retArr = new int[2];
        int xorVal = 0, temp;
        for (int i = 0; i < nums.length; i++) {
            xorVal = xorVal ^ nums[i];
        }
        System.out.println(Arrays.toString(nums));
        // xor of the 2 numbers - since they are 2 distinct numbers they will have a non-zero Xor
        // which also means that one of them does not match the other by a min of 1 bit.
        // 3 - 011 and 5 101 xor is 110 which is 6.
        System.out.println("xor val :" + xorVal + " : " + Integer.toBinaryString(xorVal));
        System.out.println("negative xor : " + Integer.toBinaryString(-xorVal));
        // We find the right most non 0 bit - which is 110 & 11111010 = 10
        xorVal &= -xorVal;
        System.out.println("right most bit of xor : " + xorVal+ " : " + Integer.toBinaryString(xorVal));
        for (int i = 0; i < nums.length; i++) {
            if ((xorVal & nums[i]) == 0) {
                System.out.println("0 :" + nums[i]+ ":" + Integer.toBinaryString(nums[i]));
                retArr[0] ^= nums[i];
                System.out.println("op 0 :" + retArr[0]+ ":" + Integer.toBinaryString(retArr[0]));
            } else {
                System.out.println("1 :" + nums[i]+ ":" + Integer.toBinaryString(nums[i]));
                retArr[1] ^= nums[i];
                System.out.println("op 1 :" + retArr[1] + ":" + Integer.toBinaryString(retArr[1]));
            }
        }
        return retArr;
    }
}
