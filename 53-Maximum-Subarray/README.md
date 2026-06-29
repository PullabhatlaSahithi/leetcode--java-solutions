# 53. Maximum Subarray

## Problem

Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

### Example

**Input:**
```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

**Output:**
```text
6
```

**Explanation:**
The subarray `[4, -1, 2, 1]` has the largest sum, which is `6`.

---

## Intuition

The idea is to maintain the sum of the current contiguous subarray.

- If the running sum is positive, it can contribute to a larger subarray, so we keep extending it.
- If the running sum becomes negative, it will only reduce the sum of any future subarray. Therefore, we discard it and start a new subarray.

This greedy approach is known as **Kadane's Algorithm**.

---

## Approach

1. Initialize two variables:
   - `sum` to store the current subarray sum.
   - `max` to store the maximum subarray sum found so far.

2. Traverse the array:
   - Add the current element to `sum`.
   - Update `max` whenever a larger sum is found.
   - If `sum` becomes negative, reset it to `0`.

3. Return `max`.

---

## Java Solution

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## Key Takeaway

- Keep track of the running sum.
- Update the maximum sum whenever a better subarray is found.
- Reset the running sum only when it becomes negative.
- This algorithm solves the problem in linear time using constant extra space.
