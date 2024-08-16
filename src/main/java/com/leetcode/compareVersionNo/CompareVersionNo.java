package com.leetcode.compareVersionNo;

public class CompareVersionNo extends AbstractParent {

    @Override
    public int compareVersion(String version1, String version2) {
        String[] v1Arr = version1.split("\\.");
        String[] v2Arr = version2.split("\\.");
        int finalLength = v1Arr.length < v2Arr.length ? v1Arr.length : v2Arr.length;
        int i = 0, j = 0, v1Val = 0, v2Val = 0;
        for (; i < finalLength; i++,j++) {
            v1Val = Integer.parseInt(v1Arr[i]);
            v2Val = Integer.parseInt(v2Arr[j]);
            if (v1Val != v2Val) {
                return v1Val < v2Val ? -1 : 1;
            }
        }
        while (i < v1Arr.length) {
            v1Val = Integer.parseInt(v1Arr[i]);
            if (v1Val != 0) {
                return 1;
            }
            i++;
        }
        while (j < v2Arr.length) {
            v2Val = Integer.parseInt(v2Arr[j]);
            if (v2Val != 0) {
                return -1;
            }
            j++;
        }
        return 0;
    }
}
