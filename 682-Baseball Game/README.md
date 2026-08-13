# LeetCode 682 - Baseball Game

## 📌 Problem

The problem simulates a baseball game where each operation represents a score-related action.

There are four possible operations:

- An **integer** → Add the score to the record.
- **`C`** → Remove the previous score.
- **`D`** → Add double the previous score.
- **`+`** → Add the sum of the previous two scores.

The goal is to calculate the total score after processing all the operations.

---

## 💡 Intuition

A **Stack** is a suitable data structure for this problem because most operations depend on the most recently recorded scores.

Using a stack allows us to easily:

- Add a new score.
- Remove the latest score.
- Access the latest score.
- Access the previous two scores when required.

Therefore, we process each operation one by one while maintaining the valid scores in the stack.

---

## 🔍 Approach

1. Create a stack to store the valid scores.
2. Traverse through all the operations.
3. For each operation:
   - If it is a number, convert it to an integer and push it into the stack.
   - If it is `C`, remove the most recent score.
   - If it is `D`, double the most recent score and push the result.
   - If it is `+`, add the previous two scores and push the result.
4. After processing all operations, calculate the sum of all scores remaining in the stack.
5. Return the total score.

---

## 🧪 Example

### Input

```text
["5", "2", "C", "D", "+"]
