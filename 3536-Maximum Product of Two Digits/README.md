# LeetCode 3536 - Maximum Product of Two Digits

## 📌 Problem Statement
Given a positive integer `n`, return the maximum product that can be obtained by multiplying any two digits of `n`.

### Example

**Input:**
```
n = 35284
```

**Output:**
```
40
```

**Explanation:**
The two largest digits are `8` and `5`.
Their product is `8 × 5 = 40`.

---

## 💡 Approach

The idea is to find the **largest** and **second largest** digit while traversing the digits of the given number.

1. Extract each digit using the modulo (`%`) operator.
2. Keep track of:
   - `max1` → Largest digit found so far.
   - `max2` → Second largest digit found so far.
3. If the current digit is greater than `max1`, update both variables.
4. Otherwise, if it is greater than `max2`, update `max2`.
5. Return the product of `max1` and `max2`.

This approach requires only a single traversal of the digits.

---

## ✅ Algorithm

1. Initialize `max1 = 0` and `max2 = 0`.
2. While `n > 0`:
   - Extract the last digit.
   - Update `max1` and `max2` if necessary.
   - Remove the last digit.
3. Return `max1 * max2`.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(log₁₀ n)`
  - We process each digit exactly once.

- **Space Complexity:** `O(1)`
  - Only two variables are used.

---

## 💻 Java Solution

```java
class Solution {
    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }

            n /= 10;
        }

        return max1 * max2;
    }
}
```

---

## 🎯 Key Takeaways

- Traverse the number only once.
- Keep track of the two largest digits.
- Avoid storing digits in an array or sorting.
- Achieves optimal **O(log n)** time and **O(1)** space complexity.

---

### ⭐ If you found this solution helpful, consider giving the repository a star!
