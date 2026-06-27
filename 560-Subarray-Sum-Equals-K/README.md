🔹 Problem

Given an integer array nums and an integer k, return the total number of continuous subarrays whose sum equals k.

🔹 Algorithm
Maintain a running prefix sum while traversing the array.
Store every prefix sum and its frequency using a HashMap.
At each index, calculate prefixSum - k.
If this value exists in the map, add its frequency to the answer.
Insert the current prefix sum into the map for future lookups.

This avoids checking every possible subarray and reduces the time complexity from O(n²) to O(n).

🔹 Complexity
Complexity	Value
Time	      O(n)
Space     	O(n)
