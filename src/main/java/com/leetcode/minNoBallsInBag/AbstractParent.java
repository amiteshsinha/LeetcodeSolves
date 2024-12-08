package com.leetcode.minNoBallsInBag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * minNoBallsInBag
 * <p>
 * This file was created on 07/12/24 / Saturday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int minimumSize(int[] nums, int maxOperations);

    /**
     *Orig - 1,2,3,4,5,6,7,8,9
     *stp1 - 1,2,3,3,4,5,6,6,7,8
     *stp2 - 1,2,3,3,4,4,4,5,6,6,7
     *stp3 - 1,2,3,3,3,4,4,4,4,5,6,6
     *stp4 - 1,2,3,3,3,3,3,4,4,4,4,5,6
     *stp5 - 1,2,3,3,3,3,3,3,3,4,4,4,4,5
     *stp6 - 1,2,2,3,3,3,3,3,3,3,3,4,4,4,4
     *stp7 - 1,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4
     *stp8 - 1,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,4
     *
     *Orig - 1,2,3,4,5,6,7,8,9
     *stp1 - 1,2,3,3,4,5,6,6,7,8
     *stp2 - 1,2,2,3,3,4,5,6,6,6,7
     *stp3 - 1,2,2,3,3,3,4,4,5,6,6,6
     *stp4 - 1,2,2,3,3,3,3,3,4,4,5,6,6
     *stp5 - 1,2,2,3,3,3,3,3,3,3,4,4,5,6
     *stp6 - 1,2,2,3,3,3,3,3,3,3,3,3,4,4,5
     *stp7 - 1,2,2,2,3,3,3,3,3,3,3,3,3,3,4,4
     *stp8 - 1,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,4
     *
     */
    @Test
    public void should_give_correct_output_1() {
        assertEquals(minimumSize(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8), 4);
    }


    /**
     * [9]
     * [6,3]
     * [3,3,3]
     */
    @Test
    public void should_give_correct_output_2() {
        assertEquals(minimumSize(new int[]{9}, 2), 3);
    }

    /**
     * if 2 steps then in the end the number of items in the bag would be 3 (2 + 1) so we can divide 15/3 = 5
     * [15]
     * [5,10]
     * [5,5,5]
     *
     * if say we had to do 3 operations instead of 2 - endNoItems = 4 (3 + 1) so we divide 15/4 = 3 && 15%4 = 3
     * so end would be three 4s and one 3
     * [15]
     * [7,8]
     * [4,4,7]
     * [3,4,4,4]
     *
     * if say we had to do 4 operations instead of 3 - - endNoItems = 5 (4 + 1) so we divide 15/5 = 3 && 15%5 = 0
     * [15]
     * [6,9]
     * [3,6,6]
     * [3,3,3,6]
     * [3,3,3,3,3]
     */
    @Test
    public void should_give_correct_output_3() {
        assertEquals(minimumSize(new int[]{15}, 2), 5);
    }

    @Test
    public void should_give_correct_output_4() {
        assertEquals(minimumSize(new int[]{15}, 3), 4);
    }

    @Test
    public void should_give_correct_output_5() {
        assertEquals(minimumSize(new int[]{15}, 4), 3);
    }

    /**
     * what happens when we add another number in this mix?
     * [7,15], maxOps = 2 - what if we sum this = 22 and increase steps by 1 = 3 22/(3 + 1) = 5,5,5,5,2 wont work since
     * in the end we dont get 5 ints we get only 4. so 22/3 = 7,7,7,1
     *
     *[7,15], maxOps = 3 - 22/4 = 5,5,5,5,2
     * [7,7,8]
     * [4,4,7,7]
     * [3,4,4,4,7] this is not correct instead it should go
     *
     * [7,15]
     * [5,7,10]
     * [5,5,5,7]
     * [2,5,5,5,5]
     */
    @Test
    public void should_give_correct_output_6() {
        assertEquals(minimumSize(new int[]{15}, 4), 3);
    }
}
