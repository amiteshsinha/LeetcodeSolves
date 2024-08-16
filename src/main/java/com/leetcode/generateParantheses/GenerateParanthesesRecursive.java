package com.leetcode.generateParantheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesesRecursive extends AbstractGenerateParanthesesTests {


    @Override
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurseAndGenerateParantheses(res, 0, 0, "", n);
        return res;
    }

    public void recurseAndGenerateParantheses(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (left < n) {
            recurseAndGenerateParantheses(res, left + 1, right, s + "(", n);
        }
        if (right < left) {
            recurseAndGenerateParantheses(res, left, right + 1, s + ")", n);
        }
    }
}
