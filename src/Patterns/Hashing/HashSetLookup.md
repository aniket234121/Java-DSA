# HashSet Lookup
HashSet Lookup is a hashing pattern in which we use a HashSet to efficiently check whether an element exists in a collection.

Instead of repeatedly searching an array or list using linear traversal, we store elements in a HashSet and use its contains() method to perform fast lookups.

The primary purpose is:
- Check whether an element exists.
- Detect duplicate elements.
- Find missing elements.
- Identify unique elements.
- Find common elements between collections.
- Perform membership-based comparisons.


**Mastery target:**
- Membership checking.
- Duplicate detection.
- Unique element identification.
- Intersection and union.
- Avoid unnecessary nested loops.

---

| LeetCode | Problem | Difficulty | Variation to Master |
|---:|---|:---:|---|
| 217 | Contains Duplicate | E | Basic duplicate detection |
| 349 | Intersection of Two Arrays | E | Common unique elements |
| 350 | Intersection of Two Arrays II | E | Intersection considering frequency |
| 202 | Happy Number | E | Detect repeated states |
| 219 | Contains Duplicate II | E | Duplicate within index distance K |
| 128 | Longest Consecutive Sequence | M | Consecutive sequence using O(1) average lookup |
| 36 | Valid Sudoku | M | Multiple independent sets |
| 442 | Find All Duplicates in an Array | M | Find all repeated elements |

## example
Consider the following problem:

Given an array, determine whether it contains any duplicate elements.
    
    int[] nums = {1, 2, 3, 4, 2};

Store each encountered element in a HashSet.

Before inserting an element, check whether it already exists.

```java
public boolean containsDuplicate(int[] nums) {

    HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {

        if (set.contains(num)) {
            return true;
        }

        set.add(num);
    }

    return false;
}
```