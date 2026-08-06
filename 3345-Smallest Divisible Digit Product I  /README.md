# LeetCode 3345 – Smallest Divisible Digit Product I

## 📌 Problem Description

Given two integers `n` and `t`, find the smallest integer greater than or equal to `n` such that the product of its digits is divisible by `t`.

For a number to satisfy the condition:

`product of digits % t == 0`

We need to return the first number greater than or equal to `n` that satisfies this condition.

---

## 💡 Intuition

We need to find the smallest number starting from `n` whose digit product is divisible by `t`.

The simplest approach is to check numbers one by one starting from `n`.

For every number:

1. Extract each digit.
2. Calculate the product of all its digits.
3. Check whether the product is divisible by `t`.
4. If it is divisible, that number is our answer.
5. Otherwise, move to the next number.

Since we start checking from `n` and move in increasing order, the first valid number we find will automatically be the smallest possible answer.

---

## 🚀 Approach

* Start checking numbers from `n`.
* For each number, store it in a temporary variable.
* Extract its digits using the modulo `% 10` operation.
* Multiply the extracted digits to calculate the digit product.
* Remove the last digit using integer division by `10`.
* Check whether the final digit product is divisible by `t`.
* If it is divisible, return that number.
* Otherwise, continue checking the next number.

---

## 🧠 Example

Suppose:

`n = 10`

`t = 2`

For `10`:

Digits are `1` and `0`.

Digit product:

`1 × 0 = 0`

Now:

`0 % 2 = 0`

Therefore, `10` satisfies the condition and is the smallest valid number.

---

## ⏱️ Time Complexity

**O(10 × log n)**

At most a small number of consecutive integers need to be checked under the problem constraints, and calculating the digit product of a number takes `O(log n)` time because we process each digit once.

For the given constraints, this approach is very efficient.

---

## 💾 Space Complexity

**O(1)**

Only a few variables are used to calculate the digit product, so no additional data structure is required.

---

## 🔑 Key Concepts

* Digit extraction
* Modulo operator
* Integer division
* Digit product
* Brute-force search
* Simulation

---

## 📚 What I Learned

This problem demonstrates how digits of a number can be processed individually using `% 10` and `/ 10`.

It also shows that when searching for the **smallest valid number**, checking candidates sequentially from the starting value is a simple and effective approach when the constraints are small.
