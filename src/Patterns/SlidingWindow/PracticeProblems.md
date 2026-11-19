#  Sliding Window Problems with Detailed Explanations

This document covers both **Fixed-Size** and **Variable-Size** sliding window problems. Each problem includes the statement, input/output format, and fully explained test cases.

---

## 1. Maximum Sum of Subarray of Size K (Fixed Size)

**Problem:**  
Given an integer array `nums` and an integer `k`, return the **maximum sum** of any contiguous subarray of size `k`.

**Input:**
- `nums`: List of integers
- `k`: Integer (1 ≤ k ≤ nums.length)

**Output:**
- Integer representing the maximum sum

**Test Case 1:**
Input: nums = [2, 1, 5, 1, 3, 2], k = 3
Output: 9


**Explanation:**  
Subarrays of size 3:
- [2, 1, 5] → sum = 8
- [1, 5, 1] → sum = 7
- [5, 1, 3] → sum = 9 ✅
- [1, 3, 2] → sum = 6  
  Maximum sum = 9

**Test Case 2:**
Input: nums = [1, 9, -1, -2, 7, 3], k = 2
Output: 10

**Explanation:**  
Subarrays of size 2:
- [1, 9] → sum = 10 ✅
- [9, -1] → sum = 8
- [-1, -2] → sum = -3
- [-2, 7] → sum = 5
- [7, 3] → sum = 10 ✅  
  Maximum sum = 10

---

## 2. Maximum in Each Sliding Window (Fixed Size)

**Problem:**  
Given an array `nums` and an integer `k`, return an array of the **maximum values** in each sliding window of size `k`.

**Input:**
- `nums`: List of integers
- `k`: Integer

**Output:**
- List of integers representing max of each window

**Test Case 1:**
Input: nums = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
Output: [3, 3, 5, 5, 6, 7]


**Explanation:**  
Sliding windows:
- [1, 3, -1] → max = 3
- [3, -1, -3] → max = 3
- [-1, -3, 5] → max = 5 ✅
- [-3, 5, 3] → max = 5 ✅
- [5, 3, 6] → max = 6 ✅
- [3, 6, 7] → max = 7 ✅

**Test Case 2:**
Input: nums = [4, 2, 12, 3, 8], k = 2
Output: [4, 12, 12, 8]


**Explanation:**  
Sliding windows:
- [4, 2] → max = 4
- [2, 12] → max = 12 ✅
- [12, 3] → max = 12 ✅
- [3, 8] → max = 8 ✅

---

## 3. Longest Substring Without Repeating Characters (Variable Size)

**Problem:**  
Given a string `s`, return the length of the **longest substring** without repeating characters.

**Input:**
- `s`: String

**Output:**
- Integer representing maximum length of substring with all unique characters

**Test Case 1:**
Input: s = "abcabcbb"
Output: 3

**Explanation:**  
Valid substrings without repeating characters:
- "abc" (length 3)
- Other substrings like "bca", "cab" also have length 3  
  Maximum = 3

**Test Case 2:**
Input: s = "bbbbb"
Output: 1


**Explanation:**  
All characters are 'b', so only valid substrings are individual characters: "b"  
Maximum = 1

---

## 4. Minimum Size Subarray Sum (Variable Size)

**Problem:**  
Given an array of positive integers `nums` and a target integer `target`, return the **minimum length** of a contiguous subarray whose sum is **greater than or equal to** `target`. If no such subarray exists, return 0.

**Input:**
- `nums`: List of positive integers
- `target`: Integer

**Output:**
- Integer representing the minimum length

**Test Case 1:**
Input: target = 7, nums = [2, 3, 1, 2, 4, 3]
Output: 2


**Explanation:**  
Subarrays with sum ≥ 7:
- [4, 3] → sum = 7, length = 2 ✅  
  Other subarrays are longer or smaller in sum  
  Minimum length = 2

**Test Case 2:**
Input: target = 15, nums = [1, 2, 3, 4, 5]
Output: 5


**Explanation:**  
Only subarray with sum ≥ 15 is entire array: [1, 2, 3, 4, 5]  
Sum = 15, length = 5  
Minimum length = 5
