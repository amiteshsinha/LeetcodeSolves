package com.leetcode.longestPalindromeLength;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * LongestPalindrome
 * 04/06/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int longestPalindrome(String s);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(longestPalindrome("abccccdd"), 7);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(longestPalindrome("a"), 1);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(longestPalindrome("Aaaabccccdd"), 9);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(longestPalindrome(
                "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"), 983);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(longestPalindrome("AazZz"), 3);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(longestPalindrome("bb"), 2);
    }
}