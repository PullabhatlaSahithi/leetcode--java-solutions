# LeetCode 1441 – Build an Array With Stack Operations

## Problem

Given a target array containing strictly increasing integers and an integer `n`, construct the target array using only the following stack operations:

* **Push** – Add the current number to the array.
* **Pop** – Remove the last inserted number.

Numbers are read sequentially from `1` to `n`. The goal is to return the sequence of operations required to build the target array.

---

## Approach

* Start reading numbers from `1`.
* Compare the current number with the current element in the target array.
* If the current number is **not** equal to the target element:

  * Perform a **Push** operation.
  * Immediately perform a **Pop** operation to discard it.
  * Move to the next number.
* If the current number matches the target element:

  * Perform a **Push** operation.
  * Move to the next target element.
* Continue until all target elements have been processed.

---

## Algorithm

1. Initialize the current number as `1`.
2. Create a list to store the sequence of operations.
3. Traverse the target array.
4. While the current number is smaller than the current target element:

   * Add `"Push"`.
   * Add `"Pop"`.
   * Increment the current number.
5. When the current number matches the target element:

   * Add `"Push"`.
   * Increment the current number.
6. Repeat until the target array is completely processed.
7. Return the list of operations.

---

## Time Complexity

* **O(n)** in the worst case, where `n` is the maximum number read.
* Each number from `1` to `n` is processed at most once.

---

## Space Complexity

* **O(k)**, where `k` is the number of operations stored in the output list.

---

## Key Learning

* Simulating stack operations.
* Using lists to record operation sequences.
* Applying simulation techniques to solve array construction problems.
* Handling sequential traversal efficiently without using an actual stack.
