# 1614. Maximum Nesting Depth of the Parentheses

**LeetCode Problem:** [1614. Maximum Nesting Depth of the Parentheses](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/)

## 📝 Problem

Given a valid parentheses string `s`, return its **maximum nesting depth**.

The nesting depth is the maximum number of parentheses that are open at the same time.

### Example

```text
Input:  s = "(1+(2*3)+((8)/4))+1"
Output: 3
```

The digit `8` is inside **3 nested pairs of parentheses**.

---

## 💡 Approach

We can solve this problem using a simple counter:

* Whenever we encounter `'('`, increase the current depth.
* Whenever we encounter `')'`, decrease the current depth.
* Keep track of the maximum depth reached during the traversal.
* Return the maximum depth.

### Example

For:

```text
(1+(2*3)+((8)/4))+1
```

The depth changes like:

```text
(       → 1
(       → 2
)       → 1
(       → 2
(       → 3
)       → 2
)       → 1
)       → 0
```

Therefore, the maximum nesting depth is **3**.

---

## 💻 Java Solution

```java
class Solution {
    public int maxDepth(String s) {
        int left = 0;
        int maxleft = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                left++;
                maxleft = Math.max(maxleft, left);
            } 
            else if (ch == ')') {
                left--;
            }
        }

        return maxleft;
    }
}
```

## ⏱️ Complexity

* **Time Complexity:** `O(n)`
  We traverse the string only once.

* **Space Complexity:** `O(1)`
  We use only two integer variables.

## 🔑 Key Idea

The variable `left` represents the **current nesting depth**, while `maxleft` stores the **maximum depth reached so far**.

```text
'(' → depth increases
')' → depth decreases
```

So, the answer is simply the maximum value reached by the depth counter.
