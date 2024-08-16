package com.leetcode.reverseBits;

public class ReverseBits extends AbstractParent {

    @Override
    public int reverseBits(int n) {
       // return Integer.valueOf(new StringBuilder(n).reverse().toString());
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
    }
}
