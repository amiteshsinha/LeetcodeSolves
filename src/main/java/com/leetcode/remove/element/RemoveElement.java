package com.leetcode.remove.element;

public class RemoveElement extends AbstractParent {


    @Override
    public int removeElement(int[] nums, int val) {
        int fwd = 0, back = nums.length - 1;
        while (fwd < back) {
            if (nums[back] == val) {
                back--;
                continue;
            }
            if (nums[fwd] != val) {
                fwd++;
                continue;
            }
            // here we have fwd at a val index and back at a non val index;
            nums[fwd] = nums[back];
            nums[back] = val;
            fwd++;
            back--;
        }

        for (fwd = 0; fwd <= nums.length - 1; fwd++) {
            if (nums[fwd] == val) {
                break;
            }
        }
        return fwd;

    }
}
