package com.leetcode.validparantheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses2 extends ValidParantheses {

    private Map<Character, Character> aParanthesesMap = new HashMap<>();

    public ValidParantheses2() {
        aParanthesesMap.put(')', '(');
        aParanthesesMap.put('}', '{');
        aParanthesesMap.put(']', '[');

    }

    @Override
    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (aParanthesesMap.containsKey(c)) {
                if (characterStack.isEmpty()) {
                    return false;
                }
                char topChar = characterStack.pop();
                if (aParanthesesMap.get(c) != topChar) {
                    return false;
                }
            } else {
                characterStack.push(c);
            }
        }
        return characterStack.isEmpty();
    }
}
