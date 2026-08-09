# LeetCode 3174 – Clear Digits

## 📌 Problem Description

You are given a string `s` consisting of lowercase English letters and digits.

Whenever a digit appears, it removes the **closest non-digit character to its left**.

The process continues until all digits are removed.

The goal is to return the resulting string after performing all the required removals.

---

## 💡 Intuition

This problem follows the **Last-In, First-Out (LIFO)** principle.

When we encounter a letter, we store it in a stack.

When we encounter a digit, it means that the **most recently stored letter** needs to be removed.

A stack is perfect for this because the most recently added character is always available at the top.

### Example

Consider:

```text
s = "cb34"
```

Processing:

```text
c → Push
b → Push
3 → Pop b
4 → Pop c
```

The stack becomes empty.

Therefore:

```text
Output = ""
```

---

## 🚀 Approach

1. Create an empty stack to store characters.
2. Traverse the string from left to right.
3. If the current character is a **letter**, push it into the stack.
4. If the current character is a **digit**, pop the top element from the stack.
5. After processing the complete string, the characters remaining in the stack form the answer.
6. Use a `StringBuilder` to construct the final string.

---

## 🧠 Why Do We Use a Stack?

Suppose we have:

```text
abc2
```

When `2` appears, it should remove `c`, which is the closest letter to its left.

The stack contains:

```text
[a, b, c]
```

The top element is `c`, so:

```text
2 → Pop c
```

Now the stack contains:

```text
[a, b]
```

This is exactly the required behavior.

---

## ⏱️ Time Complexity

**O(n)**

Each character is processed once.

A character can be pushed into the stack or removed from it at most once.

---

## 💾 Space Complexity

**O(n)**

In the worst case, the string contains only letters, so all characters may be stored in the stack.

---

## 🔑 Key Concepts

* Stack
* LIFO (Last-In, First-Out)
* String traversal
* Character checking
* Simulation
* `StringBuilder`

---

## 📚 What I Learned

This problem is a good example of how a stack can be used to simulate **removing the most recently added element**.

Whenever a problem says that an operation affects the **closest previous element**, we should consider whether a stack can be used.

---

## ✅ Summary

The solution scans the string once.

* **Letter → Push**
* **Digit → Pop**

After processing all characters, the remaining stack elements represent the final answer.

The solution is simple and efficient with **O(n) time** and **O(n) space** complexity.
