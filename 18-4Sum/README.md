# 4Sum

## Problem Statement

Given an integer array `nums` and an integer `target`, find all unique quadruplets `[nums[i], nums[j], nums[k], nums[l]]` such that:

**nums[i] + nums[j] + nums[k] + nums[l] = target**

The solution should not contain duplicate quadruplets.

## Approach

The solution uses **Sorting + Two Pointer Technique**.

1. Sort the array first so that the two-pointer technique can be applied.
2. Use a loop to fix the first element.
3. Use another loop to fix the second element.
4. Use two pointers:
   - `k` starts just after `j`.
   - `l` starts at the last index.
5. Calculate the sum of the four elements.
6. If the sum equals the target, store the quadruplet and move both pointers.
7. If the sum is smaller than the target, move `k` forward to increase the sum.
8. If the sum is greater than the target, move `l` backward to decrease the sum.
9. Skip duplicate values to avoid duplicate quadruplets.
10. Use `long` for calculating the sum to prevent integer overflow.

## Example

### Input

```text
nums = [1, 0, -1, 0, -2, 2]
target = 0
