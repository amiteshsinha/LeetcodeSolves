package com.leetcode.zigzagconversion;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public abstract class AbstractParent {

    public abstract String convert(String s, int numRows);

    @Test
    public void test1() {
        assertEquals(convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
    }

    @Test
    public void test2() {
        assertEquals(convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
    }

    @Test
    public void test3() {
        assertEquals(convert("A",1), "A");
    }

    @Test
    public void test4() {
        assertEquals(convert("ABCDEF",1), "ABCDEF");
    }

    @Test
    public void test5() {
        assertEquals(convert("ABCDEF",2), "ACEBDF");
    }

    @Test
    public void test6() {
        assertEquals(convert("ABCDEF",3), "AEBDFC");
    }

    @Test
    public void test7() {
        assertEquals(convert("ABCDEF",4), "ABFCED");
    }

    @Test
    public void test8() {
        assertEquals(convert("ABCDEF",5), "ABCDFE");
    }

    @Test
    public void test9() {
        assertEquals(convert("ABCDEF",6), "ABCDEF");
    }

    @Test
    public void test10() {
        assertEquals(convert("ABCDEF",7), "ABCDEF");
    }

    @Test
    public void test11() {
        assertEquals(convert("PAYPALISHIRING", 5), "PHASIYIRPLIGAN");
    }
}
