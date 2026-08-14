# LeetCode 3090 – Maximum Length Substring With Two Occurrences

## Problem

Given a string `s`, find the maximum length of a substring in which every character appears **at most twice**.

## Approach

This problem can be solved efficiently using the **Sliding Window** technique along with a **HashMap**.

* Maintain a window using two pointers: `left` and `right`.
* Store the frequency of each character in the current window using a HashMap.
* Expand the window by moving the right pointer.
* If any character appears more than twice, move the left pointer forward until the window becomes valid again.
* Keep track of the maximum valid window length.

## Algorithm

1. Initialize a HashMap to store character frequencies.
2. Start the left pointer at the beginning of the string.
3. Traverse the string using the right pointer.
4. Add the current character to the HashMap and increase its frequency.
5. If its frequency becomes greater than `2`, shrink the window from the left.
6. Update the maximum substring length after every valid window.
7. Return the maximum length.

## Example

**Input:**
`bcbb`

**Output:**
`4`

**Explanation:**
The entire string `"bcbb"` is valid because:

* `b` appears twice
* `c` appears once

Therefore, the maximum length is `4`.

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(k)`

Where `n` is the length of the string and `k` is the number of distinct characters.

## Key Concept

**Sliding Window + HashMap**

This problem is a good example of using a sliding window to maintain a substring under a frequency constraint.
