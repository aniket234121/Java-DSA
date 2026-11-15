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
