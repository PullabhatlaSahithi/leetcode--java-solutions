# 217. Contains Duplicate

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Approach

* Create a `HashSet` to store the elements encountered while traversing the array.
* Iterate through each element in the array.
* If the current element already exists in the `HashSet`, a duplicate has been found, so return `true`.
* Otherwise, add the element to the `HashSet` and continue.
* If the traversal completes without finding any duplicate, return `false`.

## Algorithm

1. Initialize an empty `HashSet`.
2. Traverse the array.
3. Check whether the current element is already present in the `HashSet`.
4. If present, return `true`.
5. Otherwise, add the element to the `HashSet`.
6. After the loop, return `false`.

## Time Complexity

* **O(n)**

## Space Complexity

* **O(n)**

## Concepts Used

* HashSet
* Array Traversal
* Searching
* Java Collections Framework

## Java Solution

Implemented using a `HashSet` to achieve efficient duplicate detection in linear time.
