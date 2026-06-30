# 1262. Greatest Sum Divisible by Three

## Problem

Given an integer array `nums`, return the maximum possible sum of elements such that the sum is divisible by `3`.

## Approach

* Compute the total sum of the array.
* If the sum is already divisible by `3`, return it.
* Otherwise, store:

  * The two smallest numbers with remainder `1`.
  * The two smallest numbers with remainder `2`.
* Depending on the remainder of the total sum:

  * Remove the smallest number with the same remainder, **or**
  * Remove the two smallest numbers with the complementary remainder.
* Return the maximum valid sum.

## Algorithm

1. Calculate the total sum.
2. Track the two smallest elements for remainder groups `1` and `2`.
3. Check the remainder of the total sum.
4. Remove the minimum possible value(s) to make the sum divisible by `3`.
5. Return the maximum valid sum.

## Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

## Concepts Used

* Greedy
* Array Traversal
* Math
* Constant Space Optimization

---

**Language:** Java

