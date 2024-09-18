[**119. Pascal's Triangle II**](https://leetcode.com/problems/pascals-triangle-ii)

    Easy

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

0 -> 1
1 -> 1 1
2 -> 1 2 1
3 -> 1 3 3 1
4 -> 1 4 6 4 1
5 -> 1 5 10 10 5 1
6 -> 1 6 15 20 15 6 1
7 -> 1 7 21 35 35 21 7 1
8 -> 1 8 28 56 70 56 28 8 1
9 -> 1 9 36 84 126 126 84 36 9 1

The value is based on Combinations
                  0C0
                1C0  1C1
               2C0 2C1 2C2
              3C0 3C1 3C2 3C3
             4C0 4C1 4C2 4C3 4C4


Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]


Constraints:

0 <= rowIndex <= 33


Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?