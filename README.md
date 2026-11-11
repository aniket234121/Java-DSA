# DSA Master Roadmap --- Structured Learning for a Job Switch

If your goal is to switch jobs, become a stronger problem solver, and
build deep DSA knowledge, follow a structured, pattern-based DSA roadmap
rather than randomly solving LeetCode problems.

Approach DSA like a course with clearly defined levels:

1.  Learn the underlying concept.
2.  Understand the patterns within that topic.
3.  Solve problems from easy to medium to hard.
4.  Recognize when and why a particular pattern is applicable.
5.  Revisit problems without looking at solutions.
6.  Move to the next topic only when you have sufficient command over
    the current one.

Use **Java** for every implementation.

------------------------------------------------------------------------

# 1. DSA Master Roadmap

## Stage 1 --- Foundation & Complexity

-   Big O, time and space complexity
-   Java collections: `ArrayList`, `HashMap`, `HashSet`, `PriorityQueue`
-   Recursion fundamentals
-   Brute force → optimize → analyze

## Stage 2 --- Arrays, Hashing & Two Pointers

-   Frequency maps
-   Prefix sums
-   Sliding windows
-   Sorting
-   Two pointers
-   Kadane's algorithm

## Stage 3 --- Strings & Matrices

-   String manipulation
-   Character frequency
-   Palindromes
-   Anagrams
-   Matrix traversal

## Stage 4 --- Binary Search & Sorting

-   Binary search variations
-   Search on answer
-   Rotated arrays
-   Merge sort
-   Quicksort

## Stage 5 --- Linked Lists, Stacks & Queues

-   Reversal
-   Fast/slow pointers
-   Monotonic stack
-   Next Greater Element
-   Deque

## Stage 6 --- Recursion, Backtracking & Trees

-   Subsets
-   Permutations
-   Combinations
-   Binary trees
-   BST
-   Tree traversal
-   DFS and BFS

## Stage 7 --- Heaps, Greedy & Graphs

-   Priority queues
-   Top K problems
-   Intervals
-   Graph traversal
-   Shortest paths
-   Topological sorting
-   Disjoint Set Union (DSU)

## Stage 8 --- Dynamic Programming & Advanced Patterns

-   1D and 2D DP
-   Knapsack
-   Subsequences
-   LIS
-   Grid DP
-   Bit manipulation
-   Tries
-   Advanced problems

------------------------------------------------------------------------

# 2. Detailed Pattern Checklist

## Stage 1 --- Foundation

  Topic              What to understand
  ------------------ --------------------------------------------
  Complexity         Big O, O(1), O(log n), O(n), O(n²)
  Java               ArrayList, HashMap, HashSet, PriorityQueue
  Recursion basics   Base case, recursive call, call stack
  Problem solving    Brute force → optimize → analyze

## Stage 2 --- Arrays, Hashing & Two Pointers

This stage deserves extra attention because many interview problems are
variations of a few core patterns.

### A. Hashing patterns

1.  HashMap frequency counting
2.  HashSet lookup
3.  Complement lookup (Two Sum)
4.  Grouping by frequency or key
5.  Prefix Sum + HashMap
6.  Counting pairs and subarrays

### B. Two Pointers patterns

1.  Opposite-direction pointers
2.  Same-direction pointers
3.  Slow and fast pointers
4.  Read and write pointers
5.  Sorting + two pointers
6.  Pair sum in sorted arrays
7.  Triplet sum (3Sum)
8.  Four-sum and K-sum
9.  Closest sum problems
10. Duplicate elimination

### C. Sliding Window patterns

1.  Fixed-size window
2.  Variable-size window
3.  Longest valid subarray
4.  Minimum window
5.  At most K distinct elements
6.  Frequency-map sliding window
7.  Shrinking and expanding window

### D. Prefix Sum patterns

1.  Basic prefix sum
2.  Range sum queries
3.  Subarray sum equals K
4.  Prefix sum + HashMap
5.  Prefix sum + modulo
6.  2D prefix sum

### E. Other array patterns

-   Kadane's algorithm
-   Maximum product subarray
-   Merge intervals
-   Cyclic sort
-   Missing/repeating numbers
-   Dutch National Flag
-   Matrix traversal

## Stage 3 --- Strings & Matrices

-   Character frequency and HashMap
-   Anagrams and grouping
-   Palindrome checking
-   Longest substring patterns
-   String matching basics
-   Matrix traversal and transformation

## Stage 4 --- Binary Search & Sorting

-   Standard binary search
-   First and last occurrence
-   Lower bound and upper bound
-   Search in rotated sorted array
-   Binary search on answer
-   Peak element
-   Merge sort and quicksort

## Stage 5 --- Linked Lists, Stacks & Queues

-   Reverse linked list
-   Fast and slow pointers
-   Cycle detection
-   Merge two sorted lists
-   Stack-based expression problems
-   Monotonic increasing/decreasing stack
-   Next Greater Element
-   Sliding window maximum using deque

## Stage 6 --- Recursion, Backtracking & Trees

-   Recursion tree and state-space tree
-   Subsets and subsequences
-   Permutations
-   Combination Sum
-   N-Queens
-   Tree DFS and BFS
-   Height, diameter and balanced trees
-   Lowest Common Ancestor
-   BST operations

## Stage 7 --- Heaps, Greedy & Graphs

-   Top K frequent elements
-   Kth largest/smallest
-   Merge K sorted lists
-   Activity selection and interval scheduling
-   BFS and DFS on graphs
-   Cycle detection
-   Bipartite graphs
-   Topological sorting
-   Dijkstra's algorithm
-   Disjoint Set Union

## Stage 8 --- Dynamic Programming & Advanced

-   Memoization vs tabulation
-   Fibonacci and climbing stairs
-   House Robber
-   0/1 Knapsack
-   Subset Sum
-   Longest Common Subsequence
-   Longest Increasing Subsequence
-   Grid DP
-   Partition DP
-   Bit manipulation
-   Trie
-   Advanced graph and DP problems

------------------------------------------------------------------------

# 3. Suggested Timeline

This is a reasonable initial 24-week roadmap. Adjust it according to
your progress.

  Stage                               Estimated duration
  --------------------------------- --------------------
  Foundation                                      1 week
  Arrays & Hashing                               3 weeks
  Strings & Matrices                             2 weeks
  Binary Search & Sorting                        2 weeks
  Linked Lists, Stacks & Queues                  2 weeks
  Recursion, Backtracking & Trees                4 weeks
  Heaps, Greedy & Graphs                         4 weeks
  Dynamic Programming & Advanced                 6 weeks

The duration is an estimate, not a deadline. Understanding matters more
than finishing quickly.

------------------------------------------------------------------------

# 4. Daily DSA Learning System

Use this structure for approximately 3--4 hours per day.

  Activity                           Time
  ------------------------------ --------
  Understand the concept           30 min
  Study pattern and dry run        30 min
  Solve problems independently     90 min
  Analyze optimized solutions      30 min
  Revision and notes               20 min
  Re-solve an old problem          20 min

**Important rule:** Don't measure your progress by the number of
LeetCode problems solved. Measure it by how many patterns you can
recognize and implement without help.

------------------------------------------------------------------------

# 5. How to Learn Every Pattern

For every single pattern, follow the same teaching structure:

1.  **Concept:** Why does this pattern exist?
2.  **Intuition:** How should you think about the problem?
3.  **Brute force:** Solve it without optimization.
4.  **Optimization:** Understand why the optimized approach works.
5.  **Java implementation:** Write clean interview-ready code.
6.  **Dry run:** Trace every important pointer, variable and condition.
7.  **Problem ladder:** Easy → Medium → Hard.
8.  **Recognition:** Identify clues that indicate this pattern.
9.  **Mistakes:** Learn common edge cases and traps.
10. **Assessment:** Solve a few unseen problems independently.

For each problem, maintain a record of:

-   Time complexity
-   Space complexity
-   Why this approach works
-   When to use the pattern
-   What you initially got wrong
-   Whether you can solve it again independently

------------------------------------------------------------------------

# 6. Current Position --- Two Pointers

Already solved:

-   Two Sum
-   3Sum
-   3Sum Closest
-   4Sum
-   Max Number of K-Sum Pairs

That's a good start. Don't move to Sliding Window immediately. First,
understand all variations of Two Pointers.

## Two Pointers --- Practice Track

### Part 1: Opposite-direction pointers

-   [ ] Valid Palindrome --- LeetCode 125
-   [ ] Two Sum II --- LeetCode 167
-   [ ] Container With Most Water --- LeetCode 11
-   [ ] Trapping Rain Water --- LeetCode 42 (advanced)

### Part 2: Same-direction pointers

-   [ ] Remove Duplicates from Sorted Array --- LeetCode 26
-   [ ] Remove Element --- LeetCode 27
-   [ ] Move Zeroes --- LeetCode 283
-   [ ] Remove Duplicates II --- LeetCode 80

### Part 3: Sorting + Two Pointers

-   [x] 3Sum --- LeetCode 15
-   [x] 3Sum Closest --- LeetCode 16
-   [x] 4Sum --- LeetCode 18
-   [ ] Boats to Save People --- LeetCode 881
-   [ ] 3Sum With Multiplicity --- LeetCode 923

### Part 4: Partitioning pointers

-   [ ] Sort Colors --- LeetCode 75
-   [ ] Partition Array According to Given Pivot --- LeetCode 2161
-   [ ] Shortest Unsorted Continuous Subarray --- LeetCode 581

The checked problems are ones already reported as solved. Revisit them
during revision.

------------------------------------------------------------------------

# 7. Progress Tracking System

Use these statuses for every pattern:

-   **Not started**
-   **Learning**
-   **Practicing**
-   **Mastered**

A pattern becomes **Mastered** when you can:

-   Explain the intuition without help.
-   Identify when to use it in an unseen problem.
-   Implement it in Java independently.
-   Explain time and space complexity.
-   Solve at least two variations without looking at solutions.

------------------------------------------------------------------------

# 8. What to Do Today

Don't start another topic yet.

1.  Understand opposite-direction vs same-direction pointers.
2.  Solve Valid Palindrome.
3.  Solve Remove Duplicates from Sorted Array.
4.  Solve Move Zeroes.
5.  Revisit Max Number of K-Sum Pairs and implement both HashMap and
    sorting + two-pointer approaches.

At the end, explain the pointer movement in your own words.

------------------------------------------------------------------------

# 9. Learning Preferences to Confirm

Use these preferences to tailor the pathway:

## How to learn

-   Understand intuition first, then code.
-   Start with code and understand the logic.
-   Recommended: Intuition → brute force → optimization → code.

## Preferred pace

-   Deep learning --- fewer problems, strong understanding.
-   Balanced --- concepts + consistent problem solving.
-   Intensive --- more problems and interview preparation.

## What to track

-   DSA patterns and problem-solving only.
-   DSA + interview readiness.
-   DSA + Java + interview readiness.

------------------------------------------------------------------------

# 10. Long-Term Goal

Build problem-solving ability deeply. Don't aim to become someone who
has solved 500 problems but cannot recognize a pattern in an interview.

The goal is to understand the concepts, recognize patterns in unfamiliar
problems, write clean Java solutions, analyze complexity, and explain
your reasoning confidently.

**Follow the roadmap step by step. Master one pattern before moving to
the next.**
