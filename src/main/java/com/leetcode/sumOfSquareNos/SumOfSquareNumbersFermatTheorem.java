package com.leetcode.sumOfSquareNos;

public class SumOfSquareNumbersFermatTheorem extends AbstractParent {

    /**
     * Fermat's theorem
     * Any positive number n is expressible as a sum of two squares if and only if the prime factorization of n,
     * every prime of the form (4k+3) occurs an even number of times.
     *
     */

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.64
     * MB
     * Beats
     * 14.02%
     * @param c
     * @return
     */
    @Override
    public boolean judgeSquareSum(int c) {
        int count;
        for (int i = 2; i*i <= c; i ++) {
            if (c%i == 0) {// i is a divisor of c and i is of the format 4k + 3
                count = 0;
                while (c%i == 0) {
                    count++;
                    c /= i;
                }
                if (i%4 == 3 && count %2 != 0) {
                    return false;
                }
            }
        }
        return c % 4 != 3;
    }

    /**
     * This takes 1 second even though the loop is skipping to the next 4k + 3 number
     * Runtime
     * 1
     * ms
     * Beats
     * 98.86%
     *
     * Memory
     * 40.22
     * MB
     * Beats
     * 50.69%
     * @param c
     * @return
     */
    public boolean judgeSquareSum1(int c) {
        int count = 0;
        if (c == 0) {
            return true;
        }
        if (c %4 == 0) {
            while (c%4 == 0) {
                c /= 4;
            }
        }
        if (c %2 == 0) {// for case of c == 6
            c /= 2;
        }
        for (int i = 3; i*i <= c; i += 4) {
            if (c%i == 0) {// i is a divisor of c and i is of the format 4k + 3
                while (c%i == 0) {
                    count++;
                    c /= i;
                }
                if (count %2 != 0) {
                    return false;
                }
            }
        }
        return c % 4 != 3;
    }
}
