package com.leetcode.excelSheetColNoToTitle;

public class ExcelSheetColTitle extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.29
     * MB
     * Beats
     * 94.71%
     * @param columnNumber
     * @return
     */
    @Override
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int temp; char c;
        while (columnNumber > 26) {
            temp = columnNumber%26;
            if (temp == 0) {
                c = 'Z';
                columnNumber /= 26;
                columnNumber--;
            } else {
                c = (char) ('A' + temp - 1);
                columnNumber /= 26;
            }
            sb.append(c);
        }
        c = (char) ('A' + columnNumber - 1);
        sb.append(c);
        return sb.reverse().toString();
    }
}
