# Complement Lookup Pattern (DSA)
Must Know **HashMap / HashSet**

## 1. What is the Complement Lookup Pattern?
The Complement Lookup Pattern is a hashing technique in which we calculate the value required to complete a condition and check whether that value already exists in a HashMap or HashSet.

Instead of checking every possible pair using nested loops, we calculate the required value (complement) and perform an efficient lookup.

Core idea:

If I have the current element, what other element do I need to satisfy the given condition?

Example: Two Sum
Given:

    int[] nums = {2, 7, 11, 15};
    int target = 9;


We need to find two numbers whose sum equals the target.

The condition is:
\[
a + b = target
\]

Rearrange:
\[
b = target - a
\]

Here, b is the complement of a.
Current element	Required complement	Found?

    2	9 - 2 = 7	No
    
    7	9 - 7 = 2	Yes

We found the pair (2, 7).

## 3. Complement Lookup (Two Sum) 

| LeetCode | Problem | Difficulty | Variation to Master |
|---:|---|:---:|---|
| 1 | Two Sum | E | Find complement |
| 454 | 4Sum II | M | Pair-sum frequency across arrays |
| 1679 | Max Number of K-Sum Pairs | M | Count pairs using complement |
| 560 | Subarray Sum Equals K | M | Prefix complement lookup |
| 15 | 3Sum | M | Multiple complement lookup with sorting |
| 18 | 4Sum | M | Multiple pair-sum combinations |

**Mastery target:**
- Understand `target - currentElement`.
- Store previously visited elements.
- Handle duplicates.
- Count multiple valid pairs.
- Understand complement-based lookup.
---

### 1. Two Sum — LeetCode 1
*    Easy 
*    Basic Complement Lookup

#### Problem
**Given an integer array nums and an integer target, return the indices of two numbers whose sum equals the target.**

Each input has exactly one solution, and you cannot use the same element twice.

Example:

    nums = [2, 7, 11, 15]
    target = 9

Output:

    [0, 1]


Because:

    nums[0] + nums[1] = 2 + 7 = 9


#### A. Identify the pattern
We need two numbers whose sum equals the target.

Mathematically:
**\[
a + b = target
\]**

Rearrange the equation:
**\[
b = target - a
\]**

This is the most important step.

For every current number a, we calculate the number b that we need.

That required number is called the complement.
complement = target - currentNumber;


Instead of searching for a pair using nested loops, we check whether the complement has already appeared.
#### B. Brute Force Approach
Use two loops to check every possible pair.
```java
class Solution {
public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}


```
Complexity:
- Time: \(O(n^2)\)
- Space: \(O(1)\)
  The problem is that we repeatedly search for pairs.
  C. Optimized Approach — HashMap
  Core idea: Store previously visited numbers and their indices in a HashMap.

For every element:
1. Calculate its complement.
2. Check whether the complement exists in the HashMap.
3. If it exists, we have found our answer.
4. Otherwise, store the current number and its index.
   Complete Java Solution
  ```java
 class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
} 
```