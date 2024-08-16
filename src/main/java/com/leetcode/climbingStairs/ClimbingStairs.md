[Link](https://leetcode.com/problems/climbing-stairs/)

70. Climbing Stairs

Easy
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
   Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

1 <= n <= 45

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I tried to figure out whether there is a pattern associated with this by calculating the output manually till n = 6. I figured out from this exercise that it is a fibonacci series
// n = 1 , no of ways = 1
// n = 2, no of ways = 2
// n = 3, no of ways = 3
// n = 4, no of ways = 5
// n = 5, no of ways = 8
// n = 6, no of ways = 13

# Approach
<!-- Describe your approach to solving the problem. -->
Once it was clear that it is a fibonacci all I had to do was to code out the fibonacci with given variables

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n) since we only need to iterate till the given n once

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
0(1) since we are using 2 variables to store prev minus 2 and prev minus 1 variables