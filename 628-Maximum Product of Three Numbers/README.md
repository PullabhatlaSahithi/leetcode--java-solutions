# Maximum Product of Three Numbers

## Problem

Given an integer array `nums`, return the **maximum product** that can be obtained by multiplying any **three numbers** from the array.

The array may contain **positive numbers, negative numbers, and zeros**, so the solution must consider all possible cases.

## Approach

Instead of sorting the array, this solution finds:

* The **three largest numbers** (`max1`, `max2`, `max3`)
* The **two smallest numbers** (`min1`, `min2`)

in a single traversal of the array.

The maximum product can be obtained in one of two ways:

1. Product of the three largest numbers.
2. Product of the largest number and the two smallest (most negative) numbers.

Finally, return the larger of these two products.

## Algorithm

1. Initialize variables to store the three largest and two smallest numbers.
2. Traverse the array once.
3. Update the largest and smallest values accordingly.
4. Compute:

   * `max1 × max2 × max3`
   * `max1 × min1 × min2`
5. Return the maximum of the two products.

## Complexity Analysis

* **Time Complexity:** `O(n)`

  * Only one pass through the array is required.

* **Space Complexity:** `O(1)`

  * Uses a constant amount of extra space.

## Key Insight

A maximum product is **not always** obtained from the three largest numbers. Two negative numbers multiply to form a positive number, so the product of the largest positive number and the two smallest negative numbers can sometimes produce a larger result.

### Example

**Input**

```text
[-10, -10, 5, 2]
```

**Possible Products**

* `5 × 2 × (-10) = -100`
* `5 × (-10) × (-10) = 500`

**Output**

```text
500
```

## Tags

* Array
* Greedy
* One Pass
* Math
