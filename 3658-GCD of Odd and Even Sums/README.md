# GCD of Odd and Even Sums

## 📌 Problem
Given an integer `n`, find:

- The sum of the first `n` odd numbers.
- The sum of the first `n` even numbers.

Return the **Greatest Common Divisor (GCD)** of these two sums.

### Example

**Input**
```
n = 4
```

**Odd Numbers**
```
1 + 3 + 5 + 7 = 16
```

**Even Numbers**
```
2 + 4 + 6 + 8 = 20
```

**Output**
```
4
```

---

## 💡 Approach

1. Traverse natural numbers.
2. Collect the first `n` odd numbers and calculate their sum.
3. Collect the first `n` even numbers and calculate their sum.
4. Use the **Euclidean Algorithm** to find the GCD of both sums.
5. Return the GCD.

---

## 🛠️ Algorithm

- Initialize counters and sums for odd and even numbers.
- Iterate through positive integers.
- If the number is odd, add it to the odd sum.
- If the number is even, add it to the even sum.
- Stop after collecting `n` odd and `n` even numbers.
- Compute GCD recursively.

---

## ✅ Time Complexity

- **O(n)**

The loop collects exactly `n` odd and `n` even numbers.

---

## ✅ Space Complexity

- **O(1)**

Only a few extra variables are used.

---

## 📚 Concepts Used

- Mathematics
- Number Theory
- Greatest Common Divisor (GCD)
- Euclidean Algorithm
- Loops
- Recursion

---

## 💻 Java Solution

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int count_odd = 0, count_even = 0;
        int sum_odd = 0, sum_even = 0;

        for (int i = 1; i < n || (count_odd < n && count_even < n); i++) {
            if (i % 2 == 0) {
                sum_even += i;
                count_even++;
            }
            if (i % 2 != 0) {
                sum_odd += i;
                count_odd++;
            }
        }

        return gcd(sum_odd, sum_even);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

---

## 🚀 Key Learning

- How to generate the first `n` odd and even numbers.
- Using counters to control iteration.
- Applying the Euclidean Algorithm to compute the GCD efficiently.
- Combining iteration with recursion to solve mathematical problems.
