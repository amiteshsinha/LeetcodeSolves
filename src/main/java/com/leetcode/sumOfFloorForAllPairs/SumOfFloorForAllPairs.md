[** **](https://leetcode.com/discuss/interview-question/380506/Rakuten-or-Online-Stage-or-Sum-Of-Floored-Pairs)

You are given an array A of length n. All elements are greater than zero.
Now, you need to calculate the Sum of Floor(A[i] / A[j]) for all pairs, i.e. for 0 <= i, j < n
Return the answer modulo 1000003

Sample:

Input: [3,3,4,4,5]
Output: 17

Input: [1,2,3,4,5]
Output: 27
Explanation (Second Sample Case)

Table denoting the floor division [i.e. floor(A_i / A_j)]

1	2	3	4	5
1	1	0	0	0	0
2	2	1	0	0	0
3	3	1	1	0	0
4	4	2	1	1	0
5	5	2	1	1	1
Sum = 27

A simple brute force method would have a quadratic time complexity. What I am looking for is linear (O(n)) or atleast O(n log n)

