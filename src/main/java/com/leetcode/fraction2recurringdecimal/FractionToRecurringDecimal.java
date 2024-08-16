package com.leetcode.fraction2recurringdecimal;

import org.junit.jupiter.api.Test;

//asked in goldman sachs
public class FractionToRecurringDecimal {

    public static void main(String[] args) {
        FractionToRecurringDecimal fractionToRecurringDecimal = new FractionToRecurringDecimal();
        System.out.println(fractionToRecurringDecimal.roundDirtyFractions(2l, 1l));
    }

    public String roundDirtyFractions(Long numerator, Long denominator) {
        if (numerator == null || denominator == null) {
            return "NaN";
        }
        String fractionValue = "" + numerator/(double)denominator;
        int[][] charArray = new int[2][10];
        boolean decimalReached = false;
        int i = 0;
        char currentChar;
        while (i < fractionValue.length()) {
            currentChar = fractionValue.charAt(i);
            if (currentChar == '.') {
                decimalReached = true;
                i++;
                continue;
            }
            if (decimalReached) {
                int charIndex = currentChar - '0';
                charArray[0][charIndex] += 1;
                // mark the first character index
                if (charArray[0][charIndex] == 1) {
                    charArray[1][charIndex] = i;
                    i++;
                    continue;
                }
                if (charArray[0][charIndex] > 1 && currentChar != '0') {
                    //found recurring number
                    String returnVal = fractionValue.substring(0, charArray[1][charIndex]) + "(" +
                            fractionValue.substring(charArray[1][charIndex], i) + ")";
                    System.out.println("returning value " + returnVal);
                    return returnVal;
                }
            }
            i++;
        }
        return fractionValue;
    }

    @Test
    public void should_return_number_as_is_if_it_has_no_decimals() {
        assert (roundDirtyFractions(2l, 1l).equals("2.0"));
    }

    @Test
    public void should_return_number_as_is_if_it_has_no_recurring_decimals() {
        assert (roundDirtyFractions(1l, 2l).equals("0.5"));
    }

    @Test
    public void should_round_dirty_fraction_to_nearest_number() {
        assert (roundDirtyFractions(1l, 3l).equals("0.(3)"));
    }

    @Test
    public void should_round_dirty_fraction_to_nearest_number2() {
        assert (roundDirtyFractions(1l, 75l).equals("0.01(3)"));
    }

    @Test
    public void should_round_dirty_fraction_to_nearest_number3() {
        assert (roundDirtyFractions(10l, 275l).equals("0.0(36)"));
    }

    @Test
    public void should_round_dirty_fraction_to_nearest_number4() {
        assert (roundDirtyFractions(3l, 11l).equals("0.(27)"));
    }

    @Test
    public void should_round_dirty_fraction_to_nearest_number5() {
        assert (roundDirtyFractions(22l, 7l).equals("3.(142857)"));
    }
}
