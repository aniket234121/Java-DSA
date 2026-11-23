
# 4. Grouping by Frequency or Key 

## 1. What is Grouping?
   Grouping means collecting elements that share a common property into the same group.

Instead of processing every element separately, we identify a property and use it to decide which group the element belongs to.

### There are two main types:
1. Grouping by Frequency
2. Grouping by Key
### 2. Grouping by Frequency
   In this approach, elements are grouped based on how many times they occur.

How it works:
1. First, calculate the frequency of each unique element using a HashMap.
2. Create another HashMap to store groups.
3. Use the frequency as the key.
4. Add elements having the same frequency to the same list.

HashMap structure:

    HashMap<Integer, Integer> frequencyMap;
    HashMap<Integer, List<Integer>> groupedMap;


- First HashMap: Stores element → frequency.
- Second HashMap: Stores frequency → list of elements.
  When to use:
- Group elements having the same frequency.
- Find the most or least frequent elements.
- Organize elements based on occurrence counts.
### 3. Grouping by Key
   In this approach, elements are grouped based on a common property rather than their frequency.

How it works:
1. Take an element.
2. Identify or calculate a property that determines its group.
3. Use that property as the HashMap key.
4. Store the element in the list associated with that key.
5. Repeat for all elements.

HashMap structure:

    HashMap<Key, List<Value>> map;

- Key: Identifies the group.
- Value: Stores all elements belonging to that group.
  When to use:
- Group anagrams.
- Group strings based on length.
- Group elements based on categories.
- Group elements based on calculated properties.
### 4. Important Java Method
   The most useful method for this pattern is **computeIfAbsent()**.

    map.computeIfAbsent(key, k -> new ArrayList<>())
    .add(value);


Its purpose:
1. Check whether the key exists.
2. If it exists, retrieve its existing list.
3. If it doesn't exist, create a new list and associate it with the key.
4. Add the element to that list.
   This avoids manually checking containsKey() before inserting a new list.

| LeetCode | Problem | Difficulty | Variation to Master |
|---:|---|:---:|---|
| 49 | Group Anagrams | M | Group using sorted-string key |
| 451 | Sort Characters By Frequency | M | Group/order by frequency |
| 347 | Top K Frequent Elements | M | Frequency buckets |
| 692 | Top K Frequent Words | M | Grouping + custom ordering |
| 1657 | Determine if Two Strings Are Close | M | Compare frequency distributions |
| 1282 | Group the People Given the Group Size They Belong To | M | Group using a numeric key |

**Mastery target:**
- Construct unique grouping keys.
- Use `HashMap<Key, List<Value>>`.
- Group elements by frequency.
- Group elements by calculated properties.
- Understand sorting-based and frequency-based keys.

---

### Example 1: LeetCode 451 — Sort Characters By Frequency

Medium

## Grouping by Frequency

451. Sort Characters By Frequency

**Problem Understanding**

Given a string s, sort its characters in decreasing order based on their frequency.

If two characters have the same frequency, their relative order does not matter.

    Input:
    s = "tree"
    
    
    Output:
    "eert"


Explanation:

    Character Frequency
        t	    1
        r	    1
        e	    2

The character e appears twice, so it must come before characters appearing once.
## 2. Identify the Pattern
   From our notes:

**Grouping by Frequency**

We need to:
1. Calculate the frequency of every unique character.
2. Use frequency as the grouping key.
3. Store characters having the same frequency in the same group.
4. Process groups from highest frequency to lowest.
   
Here, we need two HashMaps:

    HashMap<Character, Integer> frequencyMap;
    
    HashMap<Integer, List<Character>> groupedMap;


Their responsibilities:
* HashMap	Key	Value
* frequencyMap	Character	Frequency
* groupedMap	Frequency	List of characters

3. Step-by-Step Dry Run

**Step 1: Calculate character frequencies**

Result:

    {
    t = 1,
    r = 1,
    e = 2
    }


**Step 2: Group characters by frequency**

```java
HashMap<Integer, List<Character>> groupedMap = new HashMap<>();

for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

    char ch = entry.getKey();
    int frequency = entry.getValue();

    groupedMap.computeIfAbsent(
        frequency,
        k -> new ArrayList<>()
    ).add(ch);
}

```

Result:

    {
    1 = [t, r],
    2 = [e]
    }


Notice that frequency is now the key.

Characters with the same frequency are stored together.

**Step 3: Process groups in descending frequency order**

We can traverse from the maximum possible frequency down to 1.

The maximum frequency cannot exceed the string length.
```java
StringBuilder result = new StringBuilder();

for (int i = s.length(); i >= 1; i--) {

    if (groupedMap.containsKey(i)) {

        for (char ch : groupedMap.get(i)) {

            for (int j = 0; j < i; j++) {
                result.append(ch);
            }
        }
    }
}

```

Processing:
Frequency	Characters	Output
2	[e]	ee
1	[t, r]	eert

Final output:
"eert"


**Complete Java Solution**
```java

   class Solution {
   public String frequencySort(String s) {

        // Step 1: Calculate character frequency
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            frequencyMap.put(
                ch,
                frequencyMap.getOrDefault(ch, 0) + 1
            );
        }

        // Step 2: Group characters by frequency
        HashMap<Integer, List<Character>> groupedMap = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

            char ch = entry.getKey();
            int freq = entry.getValue();

            groupedMap.computeIfAbsent(
                freq,
                k -> new ArrayList<>()
            ).add(ch);
        }

        // Step 3: Build result in descending frequency order
        StringBuilder result = new StringBuilder();

        for (int freq = s.length(); freq >= 1; freq--) {

            if (groupedMap.containsKey(freq)) {

                for (char ch : groupedMap.get(freq)) {

                    for (int j = 0; j < freq; j++) {
                        result.append(ch);
                    }
                }
            }
        }

        return result.toString();
   }
   }

```

Complexity Analysis

Let n be the length of the string and m be the number of unique characters.

    Operation	Complexity
    Frequency counting	O(n)
    Grouping	O(m)
    Traversing frequency buckets	O(n + m)
    Building result	O(n)
    Total time	O(n)
    Auxiliary space	O(n)

Key Learning

The important concept is that we use the frequency itself as the grouping key.
frequencyMap: Character → Frequency

**groupedMap: Frequency → List<Character>**


This is useful when a problem requires organizing or ordering elements according to their occurrence count.

Example 2: LeetCode 1282 — Group the People Given the Group Size They Belong To
Medium
Grouping by Key

### 1282. Group the People Given the Group Size They Belong To1. Problem Understanding
      
We are given an integer array groupSizes.

Each index represents a person, and the value at that index represents the required size of the group to which that person belongs.

We need to divide all people into groups such that every person belongs to exactly one group and every group has the required size.

    Input:
    groupSizes = [3, 3, 3, 3, 3, 1, 3]
    
    
    Output:
    [[0, 1, 2], [3, 4, 6], [5]]


Explanation:
- People 0, 1, 2, 3, 4, 6 require groups of size 3.
- Person 5 requires a group of size 1.
2. Identify the Pattern
   From our notes:

### Grouping by Key

We need to:
1. Take each person.
2. Identify their required group size.
3. Use that group size as the HashMap key.
4. Store the person in the corresponding list.
5. Whenever the list reaches the required group size, create a group.
   We need only one HashMap:
   HashMap<Integer, List<Integer>> map;


Its responsibility:
Key	Value
Required group size	List of people

Unlike the previous example, we do not need a separate frequency map.

The key is already available in the input array.

```java
 class Solution {
   public List<List<Integer>> groupThePeople(int[] groupSizes) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Group people using required group size
        for (int i = 0; i < groupSizes.length; i++) {

            int size = groupSizes[i];

            List<Integer> list = map.computeIfAbsent(
                size,
                k -> new ArrayList<>()
            );

            list.add(i);

            // Step 2: Create group when required size is reached
            if (list.size() == size) {

                result.add(new ArrayList<>(list));

                // Clear the temporary list for the next group
                list.clear();
            }
        }

        return result;
   }
   }```