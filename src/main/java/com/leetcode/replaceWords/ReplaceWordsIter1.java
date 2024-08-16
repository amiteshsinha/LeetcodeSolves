package com.leetcode.replaceWords;

import java.util.Comparator;
import java.util.List;

public class ReplaceWordsIter1 extends AbstractParent {

    /**
     * Time limit exceeded :(
     * @param dictionary
     * @param sentence
     * @return
     */
    @Override
    public String replaceWords(List<String> dictionary, String sentence) {
        dictionary.sort(Comparator.comparing(String::length));
        for (String root : dictionary) {
            sentence = sentence.replaceAll("\\b" + root +"[a-zA-Z]*", root);
        }
        return sentence;
    }
}
