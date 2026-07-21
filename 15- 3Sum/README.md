# 15. 3Sum

## Problem Statement

Given an integer array `nums`, return all the unique triplets `[nums[i], nums[j], nums[k]]` such that:

* `i != j`
* `i != k`
* `j != k`
* `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

---

## Approach

This solution uses the **Sorting + Two Pointers** technique.

### Algorithm

1. Sort the input array.
2. Iterate through each element and treat it as the first element of the triplet.
3. Skip duplicate elements to avoid repeated triplets.
4. Use two pointers:

   * `left` starts from `i + 1`
   * `right` starts from the end of the array
5. Calculate the sum of the three elements.

   * If the sum is less than `0`, move the left pointer to the right.
   * If the sum is greater than `0`, move the right pointer to the left.
   * If the sum is `0`, store the triplet and skip duplicate values before continuing the search.
6. Continue until all unique triplets are found.

---

## Time Complexity

* Sorting: **O(n log n)**
* Two-pointer traversal: **O(n²)**

**Overall Time Complexity:** **O(n²)**

---

## Space Complexity

* **O(1)** auxiliary space (excluding the output list).

---

## Key Concepts

* Sorting
* Two Pointers
* Array Traversal
* Duplicate Handling

---

## Java Solution

The complete Java implementation is available in the accompanying source file.
