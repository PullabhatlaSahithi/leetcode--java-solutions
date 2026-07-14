# Left Rotate Array by K Places

## Problem Statement
Given an integer array `nums` and a non-negative integer `k`, rotate the array to the **left** by `k` positions.

### Example 1
**Input:**
```text
nums = [1, 2, 3, 4, 5, 6]
k = 2
```

**Output:**
```text
[3, 4, 5, 6, 1, 2]
```

### Example 2
**Input:**
```text
nums = [3, 4, 1, 5, 3, -5]
k = 8
```

**Output:**
```text
[1, 5, 3, -5, 3, 4]
```

---

## Approach

1. Compute `k % n` to handle cases where `k` is greater than the array length.
2. Store the first `k` elements in a temporary array.
3. Shift the remaining elements `k` positions to the left.
4. Copy the stored elements to the end of the array.

---

## Algorithm

1. Let `n = nums.length`.
2. Update `k = k % n`.
3. Store the first `k` elements in a temporary array.
4. Shift elements from index `k` to `n-1` towards the left.
5. Copy the temporary array elements to the last `k` positions.
6. Return the modified array.

---

## Java Solution

```java
class Solution {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }
}
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(k)`

---

## Key Concepts

- Array Manipulation
- Rotation
- Temporary Array
- Modulo Operation (`k % n`)

---

⭐ If you found this solution helpful, consider giving this repository a star!
