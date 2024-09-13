package com.leetcode.validateIPAddress;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * ValidateIPAddress
 * 12/09/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String validIPAddress(String queryIP);

    @Test
    public void should_give_correct_output1() {
        assertEquals(validIPAddress("192.168.1.1"), "IPv4");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(validIPAddress("192.168.1.0"), "IPv4");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(validIPAddress("192.168.01.1"), "Neither");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(validIPAddress("192.168.1.00"), "Neither");
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(validIPAddress("192.168@1.1"), "Neither");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(validIPAddress("172.16.254.1"), "IPv4");
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(validIPAddress("256.256.256.256"), "Neither");
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"), "IPv6");
    }

    @Test
    public void should_give_correct_output9() {
        assertEquals(validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"), "IPv6");
    }

    @Test
    public void should_give_correct_output_10() {
        assertEquals(validIPAddress("2001:0db8:85a3::8A2E:037j:7334"), "Neither");
    }

    @Test
    public void should_give_correct_output_11() {
        assertEquals(validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"), "Neither");
    }

    @Test
    public void should_give_correct_output_12() {
        assertEquals(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"), "IPv6");
    }

    @Test
    public void should_give_correct_output_13() {
        assertEquals(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"), "Neither");
    }

    @Test
    public void should_give_correct_output_14() {
        assertEquals(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370::7334:"), "Neither");
    }
}