Problem Description

Given a binary string s and an integer k, find the shortest substring that contains exactly k occurrences of 1.

If there are multiple substrings with the same shortest length, return the lexicographically smallest one.

If no such substring exists, return an empty string "".

Example
Input:
s = "100011001"
k = 2

Output:
"11"

The substring "11" contains exactly two 1s and is the shortest possible beautiful substring.

Approach

This solution uses a Brute Force approach.

Start from every possible starting index i.
Extend the substring character by character using index j.
Count the number of 1s encountered.
If the count becomes greater than k, stop extending that substring.
Whenever the count becomes exactly k, compare the current substring with the previously stored answer.
Update the answer if:
The current substring is shorter, or
Both have the same length but the current substring is lexicographically smaller.
Algorithm
Initialize ans = ""

For every starting index i:
    Set oneCnt = 0
    Create an empty current substring

    For every ending index j from i:
        Add s[j] to current substring

        If s[j] == '1':
            Increase oneCnt

        If oneCnt > k:
            Stop this iteration

        If oneCnt == k:
            Compare current substring with ans
            Update ans if current substring is better

Return ans
Complexity Analysis
Time Complexity

O(n²)

We consider all possible starting and ending positions of substrings.

Space Complexity

O(n)

The StringBuilder and substring storage can require up to O(n) space.

Key Concept

The solution checks all possible substrings and maintains the best candidate based on two conditions:

Minimum length
Lexicographically smallest when lengths are equal

This guarantees that the returned substring is the required shortest beautiful substring.

Java

The solution is implemented in Java using:

StringBuilder
Nested loops
String comparison using compareTo()
