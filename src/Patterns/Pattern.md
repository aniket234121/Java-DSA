# Patterns 

## Arrays

### A. Hashing patterns

####  Hashing Patterns – Important Subtopics & Problems

| Order | Pattern                                                              | Important Subtopics / Problems |
|---:|----------------------------------------------------------------------|---|
| 1 | [**HashMap Frequency Counting**](./Hashing/HashMapFrequencyCount.md) | Element frequency, most/least frequent, first repeating, first non-repeating | 
| 2 | [**HashSet Lookup**](./Hashing/HashSetLookup.md)                     | Duplicate detection, missing elements, unique elements, intersection, union | 
| 3 | [**Complement Lookup**](./Hashing/ComplementLookup.md)               | Two Sum, pair with target sum, pair with difference, complement search | 
| 4 | [**Grouping by Frequency or Key**](./Hashing/GroupingByFrequency.md) | Group Anagrams, group elements by frequency, frequency-based grouping | 
| 5 | [**Index Mapping (HashMap)**](./Hashing/IndexMapping.md)             | First/last occurrence, element-to-index mapping, longest consecutive sequence | 
| 6 | **Prefix Sum + HashMap**                                             | Subarray sum equals K, zero-sum subarray, longest subarray with sum K | 
| 7 | **Counting Pairs and Subarrays**                                     | Count pairs with given sum, count pairs with difference K, count subarrays with sum K | 
| 8 | **Sliding Window + HashMap**                                         | Distinct elements in window, at most K distinct, frequency tracking in windows | 
| 9 | **Array Comparison Using Hashing**                                   | Anagram check, array equality, permutation check, intersection | 


## 7. Counting Pairs and Subarrays — ⭐⭐⭐⭐⭐ MUST MASTER

| LeetCode | Problem | Difficulty | Variation to Master |
|---:|---|:---:|---|
| 1512 | Number of Good Pairs | E | Count pairs with equal values |
| 2006 | Count Number of Pairs With Absolute Difference K | E | Count pairs with given difference |
| 1010 | Pairs of Songs With Total Durations Divisible by 60 | M | Remainder-based pair counting |
| 2342 | Max Sum of a Pair With Equal Sum of Digits | M | Group by calculated key |
| 560 | Subarray Sum Equals K | M | Count subarrays with target sum |
| 974 | Subarray Sums Divisible by K | M | Count subarrays using remainders |
| 2537 | Count the Number of Good Subarrays | M | Count qualifying subarrays using frequency map and sliding window |

**Mastery target:**
- Count pairs without generating every pair.
- Count pairs using previously seen frequencies.
- Count subarrays using prefix frequencies.
- Handle duplicate values correctly.
- Use combinations when necessary.

---

## 8. Sliding Window + HashMap — ⭐⭐⭐⭐⭐ MUST MASTER

| LeetCode | Problem | Difficulty | Variation to Master |
|---:|---|:---:|---|
| 3 | Longest Substring Without Repeating Characters | M | Longest window with unique elements |
| 438 | Find All Anagrams in a String | M | Fixed window + frequency comparison |
| 567 | Permutation in String | M | Fixed window + frequency matching |
| 424 | Longest Repeating Character Replacement | M | Frequency inside variable window |
| 904 | Fruit Into Baskets | M | At most K distinct elements |
| 2461 | Maximum Sum of Distinct Subarrays With Length K | M | Fixed window + HashSet |
| 992 | Subarrays with K Different Integers | H | Exactly K distinct elements |
| 76 | Minimum Window Substring | H | Minimum valid window + frequency tracking |

**Mastery target:**
1. Fixed-size window + frequency map.
2. Variable-size window + frequency map.
3. At most K distinct elements.
4. Exactly K distinct elements.
5. Minimum window satisfying frequency requirements.

---

## 9. Array Comparison Using Hashing — ⭐⭐⭐⭐ IMPORTANT

| LeetCode | Problem | Difficulty | Variation to Master |
|---:|---|:---:|---|
| 242 | Valid Anagram | E | Compare frequencies |
| 383 | Ransom Note | E | Frequency availability |
| 349 | Intersection of Two Arrays | E | Common unique elements |
| 350 | Intersection of Two Arrays II | E | Common elements with duplicates |
| 1657 | Determine if Two Strings Are Close | M | Compare character sets and frequency distributions |
| 1460 | Make Two Arrays Equal by Reversing Subarrays | E | Compare element frequencies |
| 1647 | Minimum Deletions to Make Character Frequencies Unique | M | Frequency comparison and adjustment |

**Mastery target:**
- Compare arrays using frequencies.
- Check array equivalence.
- Check permutation equivalence.
- Compare character distributions.
- Handle duplicate frequencies.

---

## 10. Additional Advanced Problems — OPTIONAL

| LeetCode | Problem | Difficulty | Concept |
|---:|---|:---:|---|
| 41 | First Missing Positive | H | In-place hashing |
| 287 | Find the Duplicate Number | M | Duplicate detection (Floyd's algorithm is another approach) |
| 380 | Insert Delete GetRandom O(1) | M | HashMap + ArrayList |
| 523 | Continuous Subarray Sum | M | Prefix remainder |
| 149 | Max Points on a Line | H | HashMap + slope grouping |
| 454 | 4Sum II | M | Pair-sum frequency |
| 1124 | Longest Well-Performing Interval | M | Prefix sum + HashMap |

---

*Note: Some problems intentionally appear in multiple patterns because they teach more than one technique. This is a pattern-practice count, not 66 unique problems.*

---
 Pairs/Subarrays, and Sliding Window + HashMap. These are especially valuable for solving medium-level array problems in interviews.