# Equal Stacks

## 📌 Problem

Given three stacks of cylinders, each cylinder has a certain height.

You can remove cylinders **only from the top** of any stack.

The goal is to make the heights of all three stacks equal by removing the minimum number of cylinders possible.

Return the **maximum possible equal height** of the three stacks.

---

## 💡 Approach

First, calculate the total height of all three stacks.

Then:

1. Keep track of the current height of each stack.
2. Compare the three heights.
3. Remove the top cylinder from the **tallest stack**.
4. Update its height.
5. Repeat until all three stacks have the same height.
6. Return that common height.

### Why remove from the tallest stack?

If one stack is taller than the others, removing from a shorter stack cannot help us reach the maximum possible common height.

Therefore, we always reduce the tallest stack.

---

## 🔍 Example

### Input

```text
h1 = [3, 2, 1, 1, 1]
h2 = [4, 3, 2]
h3 = [1, 1, 4, 1]
```

Initial heights:

```text
Stack 1 = 8
Stack 2 = 9
Stack 3 = 7
```

Stack 2 is tallest, so remove `4`:

```text
8, 5, 7
```

Stack 1 is now tallest, so remove `3`:

```text
5, 5, 7
```

Stack 3 is tallest, so remove `1`:

```text
5, 5, 6
```

Remove another `1` from Stack 3:

```text
5, 5, 5
```

Therefore:

```text
Answer = 5
```

---

## 🧠 Key Concept

The important idea is:

> **Always remove the top cylinder from the tallest stack.**

Since the input arrays represent the stacks from **top to bottom**, we can use indexes instead of actually using a stack data structure.

```cpp
int i = 0;
int j = 0;
int k = 0;
```

* `i` → current top of Stack 1
* `j` → current top of Stack 2
* `k` → current top of Stack 3

Whenever we remove a cylinder, we increase the corresponding index.

---

## 💻 C++ Solution

```cpp
int equalStacks(vector<int> h1, vector<int> h2, vector<int> h3) 
{
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;

    for(int x : h1)
        sum1 += x;

    for(int x : h2)
        sum2 += x;

    for(int x : h3)
        sum3 += x;

    int i = 0;
    int j = 0;
    int k = 0;

    while(sum1 != sum2 || sum2 != sum3)
    {
        if(sum1 >= sum2 && sum1 >= sum3)
        {
            sum1 -= h1[i];
            i++;
        }
        else if(sum2 >= sum1 && sum2 >= sum3)
        {
            sum2 -= h2[j];
            j++;
        }
        else
        {
            sum3 -= h3[k];
            k++;
        }
    }

    return sum1;
}
```

---

## ⏱️ Complexity

Let:

* `n` = size of `h1`
* `m` = size of `h2`
* `p` = size of `h3`

### Time Complexity

```text
O(n + m + p)
```

Each cylinder is processed at most once.

### Space Complexity

```text
O(1)
```

Apart from the input arrays, we only use a few variables.

---

## 🛠️ Technologies Used

* **Language:** C++
* **Platform:** HackerRank
* **Concept:** Stack / Greedy Approach
* **Data Structure:** Arrays / Vectors

---

## 📚 Problem Source

**HackerRank – Equal Stacks**

This problem is useful for understanding stack operations, greedy thinking, and maintaining multiple running sums.
