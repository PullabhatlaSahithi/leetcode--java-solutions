# 20. Valid Parentheses

## Problem Statement

Given a string `s` containing only the characters `(`, `)`, `{`, `}`, `[` and `]`, determine whether the input string is valid.

A string is considered valid if:

* Every opening bracket has a corresponding closing bracket of the same type.
* Brackets are closed in the correct order.
* Every closing bracket has a matching opening bracket.

---

## Approach

This solution uses a **Stack** to keep track of opening brackets.

* Traverse each character in the string.
* If the character is an opening bracket, push it onto the stack.
* If it is a closing bracket:

  * Check if the stack is empty. If it is, the string is invalid.
  * Otherwise, compare the top of the stack with the corresponding opening bracket.
  * If they match, remove the opening bracket from the stack.
  * If they do not match, return `false`.
* After processing all characters, the string is valid only if the stack is empty.

---

## Algorithm

1. Create an empty stack.
2. Iterate through every character in the string.
3. Push opening brackets onto the stack.
4. For each closing bracket:

   * If the stack is empty, return `false`.
   * Check whether the top of the stack matches the corresponding opening bracket.
   * If it matches, pop the stack.
   * Otherwise, return `false`.
5. After the loop, return `true` if the stack is empty; otherwise return `false`.

---

## Time Complexity

* **O(n)**

Each character is processed once.

---

## Space Complexity

* **O(n)**

In the worst case, all opening brackets are stored in the stack.

---

## Concepts Used

* Stack
* String Traversal
* Conditional Statements
* Character Comparison

---

## Key Takeaway

A stack follows the **Last-In-First-Out (LIFO)** principle, making it the ideal data structure for validating nested and sequential brackets.
By matching every closing bracket with the most recent unmatched opening bracket, the solution efficiently determines whether the given string is valid.
