# 264. Ugly Number II

## Problem Statement
An ugly number is a positive integer whose prime factors are limited to **2, 3, and 5**.

Given an integer `n`, return the **nth ugly number**.

---

## Approach

This solution uses **Dynamic Programming** with **Three Pointers**.

### Idea

- Store all ugly numbers in an array.
- The first ugly number is always **1**.
- Maintain three pointers:
  - `i2` → points to the next multiple of 2
  - `i3` → points to the next multiple of 3
  - `i5` → points to the next multiple of 5
- At every step:
  - Compute:
    - `next2 = arr[i2] * 2`
    - `next3 = arr[i3] * 3`
    - `next5 = arr[i5] * 5`
  - Select the minimum among them.
  - Store it as the next ugly number.
  - Increment every pointer whose multiple was chosen.

This avoids duplicate ugly numbers such as **6**, **10**, **15**, etc.

---

## Algorithm

1. Create an array `arr` of size `n`.
2. Initialize:
   - `arr[0] = 1`
   - `i2 = i3 = i5 = 0`
3. Repeat until the array is filled:
   - Calculate the next multiples of 2, 3, and 5.
   - Store the smallest value.
   - Increment all matching pointers.
4. Return the last element of the array.

---

## Dry Run (n = 10)

| Step | Next Ugly Number | Array |
|------|------------------|-------|
|1|1|1|
|2|2|1,2|
|3|3|1,2,3|
|4|4|1,2,3,4|
|5|5|1,2,3,4,5|
|6|6|1,2,3,4,5,6|
|7|8|1,2,3,4,5,6,8|
|8|9|1,2,3,4,5,6,8,9|
|9|10|1,2,3,4,5,6,8,9,10|
|10|12|1,2,3,4,5,6,8,9,10,12|

Answer = **12**

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## Key Concepts

- Dynamic Programming
- Three Pointer Technique
- Array
- Minimum Selection
- Duplicate Avoidance

---

## Java Solution

```java
class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;
        int next2 = 1, next3 = 1, next5 = 1;

        for (int i = 1; i < n; i++) {
            next2 = arr[i2] * 2;
            next3 = arr[i3] * 3;
            next5 = arr[i5] * 5;

            int mini = Math.min(next2, Math.min(next3, next5));
            arr[i] = mini;

            if (mini == next2) i2++;
            if (mini == next3) i3++;
            if (mini == next5) i5++;
        }

        return arr[n - 1];
    }
}
```

---

## Why Three `if` Statements Instead of `else if`?

Some numbers can be generated in multiple ways.

Example:
- `6 = 2 × 3 = 3 × 2`
- `10 = 2 × 5 = 5 × 2`
- `15 = 3 × 5 = 5 × 3`

If `else if` is used, only one pointer moves, causing duplicate values.

Using separate `if` statements ensures all matching pointers advance together.

---

### Tags

`Dynamic Programming` `Array` `Two Pointers`
