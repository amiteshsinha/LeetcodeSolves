package com.leetcode.xor.decodedXorArray;

public class DecodedXorArray extends AbstractParent {

    public int[] decode(int[] encoded, int first) {
        int[] decodedArr = new int[encoded.length + 1];
        decodedArr[0] = first;
        for (int i = 1; i < decodedArr.length; i++) {
            decodedArr[i] = encoded[i - 1]^decodedArr[i - 1];
        }
        return decodedArr;
    }
}
