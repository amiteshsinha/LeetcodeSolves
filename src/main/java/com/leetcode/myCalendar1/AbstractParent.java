package com.leetcode.myCalendar1;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * MyCalendar1
 * <p>
 * This file was created on 09/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {

    public abstract void print();

    public abstract boolean book(int start, int end);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(book(10,20));
        assertFalse(book(15,25));
        assertTrue(book(20,30));
        print();
    }

    @Test
    public void should_give_correct_output_2() {
        assertTrue(book(10,20));
        assertTrue(book(5,8));
        assertTrue(book(25,30));
        print();
    }

    @Test
    public void should_give_correct_output_3() {
        assertTrue(book(10,20));
        assertTrue(book(20,25));
        assertTrue(book(7,10));
        assertFalse(book(10,15));
        print();
    }
}
