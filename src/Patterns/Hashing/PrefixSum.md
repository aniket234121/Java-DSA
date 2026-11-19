# Prefix Sum
A Prefix Sum is a technique in which we maintain the cumulative sum of array elements up to the current index.

Instead of calculating the sum of a subarray repeatedly, we store previously calculated sums and reuse them.

Prefix Sum Formula
There are two important formulas.

Formula 1: Building Prefix Sum

    [prefix[i] = prefix[i-1]+nums[i]]

For the first element:
    [prefix[0]=nums[0]]

Formula 2: Calculating Subarray Sum

For a subarray from index L to index R:

    [boxed{sum(L,R)=prefix[R]-prefix[L-1]}]
## Prefix Sum + HashMap 

| LeetCode | Problem | Difficulty | Variation to Master |
|---:|---|:---:|---|
| 303 | Range Sum Query – Immutable | E | Basic prefix sum |
| 724 | Find Pivot Index | E | Left sum = right sum |
| 523 | Continuous Subarray Sum | M | Divisibility using prefix remainder |
| 525 | Contiguous Array | M | Equal number of 0s and 1s |
| 560 | Subarray Sum Equals K | M | Count subarrays with target sum |
| 974 | Subarray Sums Divisible by K | M | Prefix remainder frequency |
| 930 | Binary Subarrays With Sum | M | Count binary subarrays with target sum |
| 1248 | Count Number of Nice Subarrays | M | Transform odd-number count into prefix counting |
| 1546 | Maximum Number of Non-Overlapping Subarrays With Sum Equals Target | M | Prefix sum + greedy |

**Mastery target:**

Understand these three approaches:

1. Prefix Sum + HashMap storing frequency.
2. Prefix Sum + HashMap storing earliest index.
3. Prefix Sum + remainder frequency.

---
