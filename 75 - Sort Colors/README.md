# LeetCode 75 - Sort Colors (HashMap Approach)

## Problem

Given an array `nums` containing only `0`, `1`, and `2`, sort the array in-place so that objects of the same color are adjacent, with the colors in the order `0`, `1`, and `2`.

## Approach

This solution uses a **HashMap** to count the frequency of each color.

### Algorithm

1. Traverse the array and store the frequency of each element (`0`, `1`, `2`) in a `HashMap`.
2. Extract the keys from the map into a list.
3. Sort the list of keys using `Collections.sort()`.
4. Traverse the sorted keys and overwrite the original array according to the frequency of each key.

## Complexity Analysis

* **Time Complexity:** `O(n)`

  * Counting frequencies: `O(n)`
  * Sorting the keys: `O(1)` (at most 3 unique keys)
  * Reconstructing the array: `O(n)`

  Overall: **`O(n)`**

* **Space Complexity:** `O(1)`

  * The `HashMap` stores at most three entries (`0`, `1`, and `2`), and the list also contains at most three elements.

## Java Solution

```java
class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int index = 0;

        for (int key : list) {
            int freq = map.get(key);

            while (freq-- > 0) {
                nums[index++] = key;
            }
        }
    }
}
```

## Key Concepts

* HashMap
* Frequency Counting
* Array Reconstruction
* Sorting Keys (`Collections.sort()`)

> **Note:** Although this solution runs in `O(n)` time for this problem (since there are only three distinct values), the optimal interview solution is the Dutch National Flag algorithm, which sorts the array in a single pass using constant extra space.
