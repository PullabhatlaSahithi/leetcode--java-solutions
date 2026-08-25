# LeetCode 3718 - Missing Multiple

## Problem

Given an integer array `nums` and an integer `k`, find the smallest positive multiple of `k` that is not present in the array.

The multiples of `k` are:

`k, 2k, 3k, 4k, ...`

The first multiple that is missing from the array is the required answer.

## Approach

* Store all elements of the array in a `HashSet`.
* Start checking from `k`.
* Generate multiples of `k` one by one.
* Check whether each multiple exists in the set.
* Return the first multiple that is not present.

## Example

### Input

`nums = [1, 2, 3, 4, 6, 8]`
`k = 2`

### Multiples of k

`2, 4, 6, 8, 10, ...`

Since `2`, `4`, `6`, and `8` are present, but `10` is missing:

### Output

`10`

## Complexity

* **Time Complexity:** `O(n + m)`
* **Space Complexity:** `O(n)`

Where:

* `n` is the number of elements in `nums`.
* `m` is the number of multiples checked before finding the missing one.

## Key Concept

The main idea is to check only the multiples of `k` sequentially:

**k → 2k → 3k → 4k → ...**

The first missing multiple is the answer.

## Language

Java

## LeetCode

**Problem:** 3718 - Missing Multiple
