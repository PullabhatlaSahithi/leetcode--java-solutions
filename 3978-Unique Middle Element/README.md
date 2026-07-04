# Is Middle Element Unique

## Problem Statement
Given an integer array `nums`, determine whether the middle element of the array appears **exactly once** in the entire array.

Return:
- `true` if the middle element is unique.
- `false` otherwise.

---

## Approach

1. Find the middle index using:
   ```java
   int mid = nums.length / 2;
   ```
2. Store the middle element.
3. Traverse the array and count how many times the middle element appears.
4. If the count is greater than 1, return `false`.
5. Otherwise, return `true`.

---

## Algorithm

1. Calculate the middle index.
2. Store the middle element.
3. Initialize a counter.
4. Iterate through the array:
   - If an element equals the middle element, increment the counter.
5. Return:
   - `false` if `count > 1`
   - `true` otherwise.

---

## Time Complexity

- **O(n)**  
  A single traversal of the array is performed.

## Space Complexity

- **O(1)**  
  Only a few extra variables are used.

---

## Java Solution

```java
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length / 2;
        int middle = nums[mid];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == middle) {
                count++;
            }
        }

        if (count > 1) {
            return false;
        }

        return true;
    }
}
```

---

## Example

### Input
```text
nums = [1, 2, 3, 4, 5]
```

### Output
```text
true
```

### Explanation
The middle element is `3`, and it appears only once.

---

### Input
```text
nums = [1, 2, 3, 3, 5]
```

### Output
```text
false
```

### Explanation
The middle element is `3`, which appears twice in the array.

---

## Topics

- Arrays
- Linear Search
- Counting
- Java
