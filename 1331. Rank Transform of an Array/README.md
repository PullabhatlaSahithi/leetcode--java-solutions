# 1331. Rank Transform of an Array

## Approach

1. Create a copy of the original array.
2. Sort the copied array.
3. Traverse the sorted array and assign ranks to each unique element using a `HashMap`.
4. Traverse the original array and replace each element with its corresponding rank from the map.
5. Return the transformed array.

## Algorithm

* Copy the original array.
* Sort the copied array.
* Store each unique element with its rank in a `HashMap`.
* Use the map to replace every element in the original array with its assigned rank.

## Time Complexity

* Sorting: **O(n log n)**
* Assigning ranks: **O(n)**
* Replacing elements with ranks: **O(n)**

**Overall Time Complexity:** **O(n log n)**

## Space Complexity

* Copy of array: **O(n)**
* HashMap: **O(n)**

**Overall Space Complexity:** **O(n)**
