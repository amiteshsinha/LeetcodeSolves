package com.leetcode.fractionAdditionAndSubtraction;

import static java.lang.Integer.parseInt;

public class FractionAddition extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 41.66
     * MB
     * Beats
     * 78.90%
     * @param expression
     * @return
     */
    @Override
    public String fractionAddition(String expression) {
        int num1, den1, num2 = 0, den2 = 1,start = 0, dividerIndex = 0, end = 4, length = expression.length();
        String result = null;
        while (start != length) {
            for (end = start + 1; end < length; end++) {
                if (expression.charAt(end) == '+' || expression.charAt(end) == '-') {
                    break;
                }
            }
            String subExpression = expression.substring(start, end);
            dividerIndex = subExpression.indexOf("/");
            num1 = parseInt(subExpression.substring(0,dividerIndex));
            den1 = parseInt(subExpression.substring(dividerIndex + 1));
            result = caclulate(num1, den1, num2, den2);
            if (end == length) {
                break;
            }
            dividerIndex = result.indexOf("/");
            num2 = parseInt(result.substring(0, dividerIndex));
            den2 = parseInt(result.substring(dividerIndex + 1));
            start = end;
        }
        return result;
    }

    private String caclulate(int num1, int den1, int num2, int den2) {
        int num = num1*den2 + num2*den1;
        int den = den1*den2;
        int hcf = Math.abs(hcf(num, den));
        num = num/hcf;
        den = den/hcf;
        if (num % den == 0) {
            num = num / den;
            den = 1;
        }
        return new StringBuilder().append(num).append("/").append(den).toString();
    }

    // num1 is always greater than num2
    private int hcf(int num1 ,int num2) {
        int temp;
        while (num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
