# 150. Evaluate Reverse Polish Notation

## Problem Statement

Given an array of strings `tokens` representing an arithmetic expression in **Reverse Polish Notation (RPN)**, evaluate the expression and return the resulting integer.

The valid operators are:

* Addition (`+`)
* Subtraction (`-`)
* Multiplication (`*`)
* Division (`/`)

Division between two integers should truncate toward zero.

---

## Approach

This solution uses a **Stack** to evaluate the expression efficiently.

* Traverse each token in the input array.
* If the token is a number, push it onto the stack.
* If the token is an operator:

  * Pop the top two numbers from the stack.
  * Perform the corresponding arithmetic operation.
  * Push the result back onto the stack.
* After processing all tokens, the stack contains a single value, which is the final result.

---

## Algorithm

1. Create an empty stack.
2. Iterate through each token in the array.
3. If the token is an operand (number), push it onto the stack.
4. If the token is an operator:

   * Pop the second operand.
   * Pop the first operand.
   * Perform the operation while maintaining the correct operand order.
   * Push the computed result back onto the stack.
5. After all tokens are processed, return the remaining element in the stack.

---

## Time Complexity

* **O(n)**

Each token is processed exactly once.

---

## Space Complexity

* **O(n)**

In the worst case, the stack stores all operands before any operations are performed.

---

## Concepts Used

* Stack
* String Processing
* Arithmetic Operations
* Reverse Polish Notation (Postfix Expression)
* Integer Parsing

---

## Key Takeaway

Reverse Polish Notation eliminates the need for parentheses by placing operators after their operands. A stack naturally supports this evaluation process by allowing 
the two most recent operands to be retrieved whenever an operator is encountered. This results in an efficientsingle-pass solution with linear time complexity.
