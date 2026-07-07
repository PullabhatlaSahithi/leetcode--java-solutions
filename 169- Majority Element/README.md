# Majority Element - Java (HashMap)

## Problem Statement

Given an integer array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears **more than ⌊n / 2⌋ times** in the array.

You may assume that the majority element always exists in the array.

---

## Approach

This solution uses a **HashMap** to count the frequency of each element in the array.

### Steps

1. Create a `HashMap<Integer, Integer>` to store the frequency of each element.
2. Traverse the array and update the frequency of every element.
3. Traverse the HashMap keys.
4. Return the key whose frequency is greater than `n / 2`.

---

## Algorithm

1. Initialize an empty `HashMap`.
2. For every element in the array:
   - If the element already exists in the map, increment its frequency.
   - Otherwise, insert it with frequency `1`.
3. Iterate through the HashMap.
4. If any element has frequency greater than `nums.length / 2`, return it.

---

## Java Code

```java
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Find majority element
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1;
    }
}
```

---

## Example

### Input

```
nums = [2,2,1,1,1,2,2]
```

### Frequency Map

```
{
    1 = 3,
    2 = 4
}
```

### Output

```
2
```

Since `2` appears **4** times, which is greater than `7 / 2 = 3`, it is the majority element.

---

## Time Complexity

- Building the HashMap: **O(n)**
- Traversing the HashMap: **O(n)** (at most)

**Overall Time Complexity:** `O(n)`

---

## Space Complexity

The HashMap stores the frequency of each unique element.

**Space Complexity:** `O(n)`

---

## Key Concepts Used

- HashMap
- Frequency Counting
- keySet()
- getOrDefault()
- Iteration

---

## Learning Outcome

This problem demonstrates how a **HashMap** can efficiently count the frequency of elements in an array. It also introduces important Java HashMap methods such as `put()`, `get()`, `getOrDefault()`, and `keySet()`, which are widely used in coding interviews and DSA problems.
