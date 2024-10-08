[**692. Top K Frequent Words**](https://leetcode.com/problems/top-k-frequent-words/description/)
    
    Medium

Given a non-empty list of words, return the k most frequent elements.

Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.

Example 1:
Input: ["i", "love", "levi", "i", "love", "coding"], k = 3
Output: ["i", "love", "coding"]
Explanation: "i" and "love" are the two most frequent words, "coding" and "levi" have same frequency.
    Note that "coding" comes before "levi" because of lower alphabetical order,
     and "i" comes before "love" due to a lower alphabetical order.
     Hence the o/p is i love and coding in that order since k = 3.
Example 2:
Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 2
Output: ["the", "is"]
Explanation: "the", "is" are the two most frequent words,
    with the number of occurrence being 4, 3, 2 and 1 respectively.
Note:
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Input words contain only lowercase letters.
Follow up:
Try to solve it in O(n log k) time and O(n) extra space.