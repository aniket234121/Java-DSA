
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
   The most useful method for this pattern is computeIfAbsent().
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