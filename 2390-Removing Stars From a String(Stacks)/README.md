# LeetCode 2390 – Removing Stars From a String

## 📌 Problem Description

Given a string `s` containing lowercase English letters and the `'*'` character, remove every `'*'` along with the closest non-star character to its left. Continue this process until all stars have been removed, and return the resulting string.

---

## 💡 Intuition

Each `'*'` removes the character immediately before it. This behavior follows the **Last-In, First-Out (LIFO)** principle, making a **stack** the ideal data structure for this problem.

* When a letter is encountered, store it.
* When a `'*'` is encountered, remove the most recently stored character.
* After processing the entire string, the remaining characters in the stack form the final answer.

---

## 🚀 Approach

1. Create an empty stack to store characters.
2. Traverse the input string from left to right.
3. If the current character is not `'*'`, push it onto the stack.
4. If the current character is `'*'`, remove the top character from the stack.
5. After processing all characters, iterate through the stack and append each character to a `StringBuilder`.
6. Convert the `StringBuilder` into a string and return it.

---

## 🧠 Example

**Input**

```text
s = "leet**cod*e"
```

### Processing

* Push `l`
* Push `e`
* Push `e`
* Push `t`
* `*` → Remove `t`
* `*` → Remove `e`
* Push `c`
* Push `o`
* Push `d`
* `*` → Remove `d`
* Push `e`

**Output**

```text
lecoe
```

---

## ⏱️ Time Complexity

**O(n)**

* Each character is processed exactly once.
* Every character is pushed and popped at most one time.

---

## 💾 Space Complexity

**O(n)**

* In the worst case, the stack stores all characters when there are no `'*'` characters.

---

## 🔑 Key Concepts

* Stack (LIFO)
* Character processing
* String traversal
* StringBuilder
* Simulation

---

## 📚 What I Learned

* Stack is the most suitable data structure when the latest inserted element needs to be removed first.
* Problems involving undo operations, bracket matching, and removing previous elements often follow the LIFO pattern.
* `StringBuilder` provides an efficient way to construct the final string after processing all characters.

---

## ✅ Summary

This solution efficiently simulates the removal process using a stack. Every non-star character is stored, and each `'*'` removes the most recently added character. Since every character is processed only once, the algorithm achieves **O(n)** time complexity while maintaining a simple and easy-to-understand implementation.
