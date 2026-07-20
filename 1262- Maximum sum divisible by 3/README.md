# LeetCode 1262 - Greatest Sum Divisible by Three

## Problem Statement

Given an integer array `nums`, return the maximum possible sum of elements such that the sum is divisible by `3`.

**LeetCode Link:** https://leetcode.com/problems/greatest-sum-divisible-by-three/

---

## Approach

- Compute the total sum of all elements.
- If the sum is divisible by `3`, return it.
- Otherwise, track the two smallest numbers with remainders `1` and `2`.
- Remove the minimum possible value(s) required to make the remaining sum divisible by `3`.
- Return the maximum valid sum.

---

## Algorithm

1. Calculate the total sum.
2. Keep track of the two smallest numbers with remainder `1`.
3. Keep track of the two smallest numbers with remainder `2`.
4. If the sum is divisible by `3`, return it.
5. Otherwise:
   - If `sum % 3 == 1`, remove either:
     - the smallest remainder `1` element, or
     - the two smallest remainder `2` elements.
   - If `sum % 3 == 2`, remove either:
     - the smallest remainder `2` element, or
     - the two smallest remainder `1` elements.
6. Return the maximum possible sum.

---

## Time Complexity

- **O(n)**

---

## Space Complexity

- **O(1)**

---

## Key Insight

Instead of checking every subset, only the smallest elements affecting the remainder need to be considered. By greedily removing the minimum possible value(s), we maximize the remaining sum while ensuring it is divisible by `3`.

---

**Difficulty:** Medium  
**Language:** Java  
**Tags:** Greedy, Array, Math
