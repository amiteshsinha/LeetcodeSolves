https://leetcode.com/problems/trapping-rain-water/?envType=daily-question&envId=2024-04-12

42. Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.



Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9


Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105

      //height=  //2,1,0,1,3
      //index =  //0,1,2,3,4

      //when wall found =  Min (3,2)*(4 - 0 -1) - (1+1)
        // 2*3 - 2 = 6 -2 = 4

        // 2,1,2
        //7,8,9

        //Min(2,2)* (9-7-1) - (1) = 1