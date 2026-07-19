# LeetCode 1081 - Smallest Subsequence of Distinct Characters

## Problem Statement

Given a string `s`, return the **lexicographically smallest subsequence** of `s` that contains **all the distinct characters exactly once**.

### Example

**Input**

```text
s = "bcabc"
```

**Output**

```text
abc
```

---

## Approach

This solution uses a **Greedy Algorithm** combined with a **Stack**.

### Key Idea

* Count the frequency of each character.
* Traverse the string one character at a time.
* Skip characters that are already present in the stack.
* While the current character is smaller than the top of the stack **and** the top character appears again later, remove the top character from the stack.
* Push the current character into the stack and mark it as visited.
* Finally, convert the stack into a string.

---

## Algorithm

1. Count the frequency of every character.
2. Initialize:

   * A `Stack<Character>` to build the answer.
   * A `boolean[] visited` array to avoid duplicate characters.
3. Traverse the string:

   * Decrease the frequency of the current character.
   * If the character is already in the stack, skip it.
   * Otherwise, remove larger characters from the stack if they appear later in the string.
   * Push the current character into the stack and mark it as visited.
4. Convert the stack into a string and return the result.

---

## Time Complexity

* **O(n)**

Each character is pushed into the stack at most once and popped at most once.

---

## Space Complexity

* **O(1)**

The stack, frequency array, and visited array store at most 26 lowercase English letters.

---

## Java Solution

```java
import java.util.Stack;

class Solution {
    public String smallestSubsequence(String s) {
        boolean[] visited = new boolean[26];
        int[] freq = new int[26];
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;

            if (visited[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty() &&
                   c < stack.peek() &&
                   freq[stack.peek() - 'a'] > 0) {

                visited[stack.peek() - 'a'] = false;
                stack.pop();
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
```

---

## Concepts Used

* Greedy Algorithm
* Stack
* Frequency Array
* Boolean Visited Array
* Lexicographical Ordering

---

## Learning Outcome

This problem demonstrates how a **greedy strategy** and a **stack** can be combined to build the smallest possible lexicographical subsequence while ensuring that every distinct character appears exactly once.
