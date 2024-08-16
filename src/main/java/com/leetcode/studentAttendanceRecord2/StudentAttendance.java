package com.leetcode.studentAttendanceRecord2;

public class StudentAttendance extends AbstractParent {

    public int checkRecord(int n) {
        int modulo = (int) (Math.pow(10, 9) + 7);
        long[] PorL = new long[n + 1]; // ending with P or L, no A
        long[] P = new long[n + 1]; // ending with P, no A
        PorL[0] = P[0] = 1; PorL[1] = 2; P[1] = 1;

        for (int i = 2; i <= n; i++) {
            P[i] = PorL[i - 1];
            PorL[i] = (P[i] + P[i - 1] + P[i - 2]) % modulo;
        }

        long res = PorL[n];
        for (int i = 0; i < n; i++) { // inserting A into (n-1)-length strings
            long s = (PorL[i] * PorL[n - i - 1]) % modulo;
            res = (res + s) % modulo;
        }

        return (int) res;

    }
}
