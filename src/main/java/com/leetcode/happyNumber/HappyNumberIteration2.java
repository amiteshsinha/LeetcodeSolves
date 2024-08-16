package com.leetcode.happyNumber;

public class HappyNumberIteration2 extends AbstractParent {

    @Override
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        int fast = n, slow = n;
        do {
            slow = sum(slow);
            fast = sum(sum(fast));
        } while (fast != slow);
        return slow == 1;
    }

    public int sum(int n) {
        int sum = 0, tmp = 0;
        while (n != 0) {
            tmp = n%10;
            sum += tmp*tmp;
            n = n/10;
        }
        return sum;
    }
}
