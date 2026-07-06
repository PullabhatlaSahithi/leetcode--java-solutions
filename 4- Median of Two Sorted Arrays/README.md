# 4. Median of Two Sorted Arrays

## Problem Statement

Given two sorted arrays `nums1` and `nums2` of sizes `m` and `n` respectively, return the median of the two sorted arrays.

The overall run time complexity should be **O(log(m + n))**.

**LeetCode Link:** https://leetcode.com/problems/median-of-two-sorted-arrays/

---

## Intuition

Since both arrays are already sorted, one straightforward approach is to merge them into a single sorted array.

After merging:
- If the total number of elements is **odd**, the median is the middle element.
- If the total number of elements is **even**, the median is the average of the two middle elements.

Although this solution does not achieve the optimal logarithmic complexity required by the problem, it is simple, easy to understand, and correctly computes the median.

---

## Approach

1. Create a new array of size `m + n`.
2. Use two pointers:
   - One for `nums1`
   - One for `nums2`
3. Compare elements from both arrays and insert the smaller element into the merged array.
4. After one array is completely traversed, copy the remaining elements of the other array.
5. Find the median:
   - If the merged array length is odd, return the middle element.
   - If it is even, return the average of the two middle elements.

---

## Algorithm

1. Initialize pointers `i`, `j`, and `k`.
2. Merge both sorted arrays using the two-pointer technique.
3. Copy any remaining elements.
4. Check the total length:
   - **Odd:** return `arr[length / 2]`
   - **Even:** return `(arr[length/2] + arr[length/2 - 1]) / 2.0`
5. Return the median.

---

## Dry Run

### Input

nums1 = [1,3]

nums2 = [2]

### Merging Process

Merged Array = [1,2,3]

Length = 3 (Odd)

Median = 2

### Output

```
2.00000
```

---

### Another Example

Input

nums1 = [1,2]

nums2 = [3,4]

Merged Array

```
[1,2,3,4]
```

Length = 4 (Even)

Median

```
(2 + 3) / 2 = 2.5
```

Output

```
2.50000
```

---

## Complexity Analysis

### Time Complexity

- Merging both arrays takes **O(m + n)**.
- Finding the median takes **O(1)**.

**Overall Time Complexity: O(m + n)**

### Space Complexity

An additional merged array of size `m + n` is used.

**Space Complexity: O(m + n)**

---

## Java Solution

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                arr[k++] = nums2[j++];
            } else {
                arr[k++] = nums1[i++];
            }
        }

        while (i < m) {
            arr[k++] = nums1[i++];
        }

        while (j < n) {
            arr[k++] = nums2[j++];
        }

        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        }

        return arr[arr.length / 2];
    }
}
```

---

## Key Concepts Used

- Arrays
- Two Pointer Technique
- Merge Process
- Median Calculation

---

## Note

This solution uses the **merge approach**, which has a time complexity of **O(m + n)**.

The original LeetCode problem expects an optimized **O(log(min(m, n)))** solution using **Binary Search**, but this implementation is an easy-to-understand approach that correctly computes the median.

---

### Tags

`Array` `Two Pointers` `Merge` `Sorting`
