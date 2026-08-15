# Longest Subsequence With Non-Zero Bitwise XOR

## Problem Description

Given an integer array `nums`, find the maximum length of a subsequence whose bitwise XOR is non-zero.

## Approach

The solution is based on the properties of the XOR operation:

- If the XOR of all elements is non-zero, the entire array is a valid subsequence, so the answer is `n`.
- If the XOR of the entire array is zero and there is at least one non-zero element, removing one non-zero element makes the remaining XOR non-zero. Therefore, the answer is `n - 1`.
- If all elements are zero, every possible subsequence has XOR equal to zero, so the answer is `0`.

## Algorithm

1. Calculate the XOR of all elements in the array.
2. If the total XOR is non-zero, return the array length.
3. If the total XOR is zero, check whether at least one non-zero element exists.
4. If a non-zero element exists, return `n - 1`.
5. Otherwise, return `0`.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

## Concepts Used

- Arrays
- Bitwise XOR
- XOR Properties
- Subsequence
- Linear Traversal
- Constant Space

## Language

**Java**
