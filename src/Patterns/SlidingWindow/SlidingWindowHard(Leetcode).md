# 1. Subarrays with K Different Integers

Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.



**Example 1:**

Input: nums = [1,2,1,2,3], k = 2

Output: 7

Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

**Example 2:**

Input: nums = [1,2,1,3,4], k = 3

Output: 3

Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].

Solution:-

"Count subarrays with exactly k distinct integers"

You use this trick:

    exactlyK = atMost(k) - atMost(k - 1);

Because:

**atMost ( k )** includes all subarrays with ≤ k distinct elements

**atMost (k - 1)** includes all subarrays with ≤ (k - 1) distinct elements

So the difference gives you subarrays with exactly k distinct elements

```
class Solution {
    public int atMost(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, count = 0, distinctCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (map.getOrDefault(nums[right], 0) == 0) {
                distinctCount++;
            }
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (distinctCount > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                    distinctCount--;
                }
                left++;
            }

            // all subarrays ending at `right` and starting from `left` to `right` are valid
            count += right - left + 1;
        }

        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}
```

# 2. Minimum window substring

Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.



Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"

Output: "BANC"

Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

Example 2:

Input: s = "a", t = "a"

Output: "a"

Explanation: The entire string s is the minimum window.

Example 3:

Input: s = "a", t = "aa"

Output: ""

Explanation: Both 'a's from t must be included in the window.

Since the largest window of s only has one 'a', return empty string.



```

public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        Map<Character, Integer> window = new HashMap<>();
        int have = 0, needCount = need.size();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue())
                have++;

            while (have == needCount) {
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // shrink from the left
                char ch = s.charAt(left);
                window.put(ch, window.get(ch) - 1);
                if (need.containsKey(ch) && window.get(ch).intValue() < need.get(ch).intValue())
                    have--;
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}


```