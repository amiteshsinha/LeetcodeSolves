package com.leetcode.excelSheetTitleToColNo;

public class ExcelSheetTitleToColNo extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 87.60%
     *
     * Memory
     * 42.07
     * MB
     * Beats
     * 50.40%
     * @param columnTitle
     * @return
     */
    public int titleToNumberIter1(String columnTitle) {
        char[] colChar = columnTitle.toCharArray();
        int count = 0, j = 1;
        for (int i = colChar.length - 1; i > -1; i--) {
            count += (colChar[i] - 'A' + 1) * j;
            j *= 26;
        }
        return count;
    }

    public int titleToNumber(String columnTitle) {
        int count = 0;
        for (int i =0; i < columnTitle.length(); i++) {
            count =count*26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return count;
    }
}
