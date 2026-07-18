# Find Greatest Common Divisor of Array

## 📝 Problem
Given an integer array `nums`, return the **greatest common divisor (GCD)** of the **smallest** and **largest** numbers in the array.

### Example
**Input:**
```text
nums = [2,5,6,9,10]
```

**Output:**
```text
2
```

**Explanation:**
- Smallest element = 2
- Largest element = 10
- GCD(2, 10) = 2

---

## 💡 Approach

1. Traverse the array once to find the **minimum** and **maximum** elements.
2. Use the **Euclidean Algorithm** to calculate the GCD of these two numbers.
3. Return the computed GCD.

The Euclidean Algorithm works by repeatedly replacing:
gcd(a, b) = gcd(b, a % b)
until `b` becomes `0`. The remaining value of `a` is the GCD.

---

## 🚀 Algorithm

1. Initialize `min` as `Integer.MAX_VALUE` and `max` as `Integer.MIN_VALUE`.
2. Iterate through the array:
   - Update `min` if a smaller element is found.
   - Update `max` if a larger element is found.
3. Call the recursive `gcd(max, min)` function.
4. Return the result.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n + log(min(max, min)))`
  - `O(n)` to find the minimum and maximum elements.
  - `O(log(min(max, min)))` for the Euclidean GCD algorithm.

- **Space Complexity:** `O(log(min(max, min)))`
  - Due to the recursive calls of the Euclidean algorithm.

---

## ✅ Java Solution

```java
class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return gcd(max, min);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

---

## 📚 Key Concepts

- Array Traversal
- Minimum and Maximum Element
- Euclidean Algorithm
- Recursion

---

### ⭐ If you found this solution helpful, consider giving the repository a star!
