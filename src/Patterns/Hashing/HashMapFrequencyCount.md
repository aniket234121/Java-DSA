# 1. Frequency Counting 


Frequency Counting is a hashing technique used to count how many times each element occurs in an array, string, or collection.

### We use a HashMap or array to store:
- Key: Element whose frequency we want to track.
- Value: Number of times that element occurs.
  Instead of repeatedly traversing an array to count occurrences, we maintain the frequency of each element in a single traversal.
  Example
  Input:
  int[] arr = {1, 2, 2, 3, 1, 2, 4, 3};


Frequency Map:

    Element (Key)	Frequency (Value)
    1           	2
    2           	3
    3           	2
    4           	1

| LeetCode | Problem | Difficulty | Variation to Master |
|---:|---|:---:|---|
| 242 | Valid Anagram | E | Compare character frequencies |
| 383 | Ransom Note | E | Check whether available frequencies are sufficient |
| 387 | First Unique Character in a String | E | First non-repeating element |
| 169 | Majority Element | E | Find element with frequency greater than n/2 |
| 1207 | Unique Number of Occurrences | E | Check whether frequencies are unique |
| 347 | Top K Frequent Elements | M | Find K most frequent elements |
| 451 | Sort Characters By Frequency | M | Frequency-based ordering |
| 692 | Top K Frequent Words | M | Frequency + tie-breaking |

**Mastery target:**
- Build frequency maps.
- Retrieve and update frequencies.
- Identify unique frequencies.
- Find most/least frequent elements.
- Solve frequency-based queries.

---

### Example Problem

#### 383. Ransom Note
```

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
```

### Solution using HashMap approach
```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // If magazine has fewer characters than ransomNote,
        // it is impossible to construct ransomNote.
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check whether every character in ransomNote in mag
        for (char ch : ransomNote.toCharArray()) {

            // If the character does not exist in magazine
            // or its available frequency is exhausted,
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            // Use one occurrence of the character.
            // Decrease its available frequency by 1.
            map.put(ch, map.get(ch) - 1);
        }

        // All characters were available in sufficient quantities.
        return true;
    }
}
```
### Solution using Frequency Array approach

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // 1. If magazine has fewer characters,
        // it cannot construct ransomNote.
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        // 2. Store available frequencies of lowercase letters (a-z).
        int[] count = new int[26];

        // 3. Count the available characters in magazine.
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        // 4. Consume characters required by ransomNote.
        for (char ch : ransomNote.toCharArray()) {

            // Decrease the available frequency of the character.
            count[ch - 'a']--;

            // Negative frequency means magazine does not
            // contain enough occurrences of this character.
            if (count[ch - 'a'] < 0) {
                return false;
            }
        }

        // 5. All required characters were available.
        return true;
    }
}
```
## When Should You Prefer a Frequency Array Over HashMap?

Use a frequency array when:

* The input character range is fixed and limited.

* Characters are lowercase English letters (a-z).

* Characters are uppercase English letters (A-Z).

* The problem involves digits (0-9).

* You can map the input values directly to array indexes.

Use a HashMap when:

* The input contains arbitrary integers.

* The character range is large or unrestricted.

* The keys are strings or other objects.

* You need dynamic key-value frequency tracking.

### Key Takeaway

Do not automatically use HashMap for every frequency-counting problem.

First check whether the input has a limited, known range. If it does, a frequency array is generally simpler and more memory-efficient than a HashMap.

This is an important optimization within the HashMap Frequency Counting pattern: recognizing when direct indexing can replace hashing.