[Link](https://leetcode.com/problems/subarray-sums-divisible-by-k)

[READ](https://leetcode.com/problems/subarray-sums-divisible-by-k/solutions/413234/whiteboard-explanation/?envType=daily-question&envId=2024-06-09)

**974. Subarray Sums Divisible by K**
     
Medium
     
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0


Constraints:

1 <= nums.length <= 3 * 10<sup>4</sup>

-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>

2 <= k <= 10<sup>4</sup>

