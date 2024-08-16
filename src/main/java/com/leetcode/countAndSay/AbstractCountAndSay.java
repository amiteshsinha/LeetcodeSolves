package com.leetcode.countAndSay;

import org.junit.jupiter.api.Test;

public abstract class AbstractCountAndSay {

    public abstract String countAndSay(int n);

    public abstract String say(String n);

    @Test
    public void should_return_correct_string1() {
        assert (countAndSay(1).equals("1"));
    }

    @Test
    public void should_return_correct_string2() {
        assert (countAndSay(2).equals("11"));
    }

    @Test
    public void should_return_correct_string3() {
        assert (countAndSay(3).equals("21"));
    }

    @Test
    public void should_return_correct_string4() {
        assert (countAndSay(4).equals("1211"));
    }

    @Test
    public void shoud_return_correct_string_on_say() {
        assert (say("3322251").equals("23321511"));
    }

    @Test
    public void shoud_return_correct_string_on_say2() {
        assert (say("11").equals("21"));
    }

    @Test
    public void shoud_return_correct_string_on_say3() {
        assert (say("21").equals("1211"));
    }

    @Test
    public void shoud_return_correct_string_on_say4() {
        assert (say("1").equals("11"));
    }
}
