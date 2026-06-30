# Lab 2 — Array Algorithms (Find Max & Pair Sum)

## Overview
This lab implements two classic array algorithms as interactive Java console
applications. Both programs collect all input from the user via `Scanner` —
no arrays or values are hardcoded.

## Files

### FindMax.java
Finds the maximum value in a user-entered array and the index at which it occurs.

- **Algorithm:** Linear Search
- **Time Complexity:** O(n) — the array is scanned once.

**Sample run:**
```
Enter the number of elements in the array: 5
Enter 5 integer values:
Element [0]: 12
Element [1]: 45
Element [2]: 3
Element [3]: 78
Element [4]: 22

RESULTS 
Array entered : [12, 45, 3, 78, 22]
Maximum Value : 78
Found at Index: 3

```

### PairSum.java
Searches a user-entered array for a unique pair of values that sum to a
user-entered target.

- **Algorithm:** Brute Force (Nested Loop) Search
- **Time Complexity:** O(n²) — every pair (i, j) with j > i is checked in
  the worst case.

**Sample run:**
```
Enter the number of elements in the array: 4
Enter 4 integer values:
Element [0]: 2
Element [1]: 7
Element [2]: 11
Element [3]: 15
Enter the Target Sum: 9

RESULTS
Array entered: [2, 7, 11, 15]
Target Sum   : 9
Pair Found!
Indices : [0] and [1]
Values  : 2 and 7
Equation: 2 + 7 = 9
```

## How to Compile and Run

```bash
javac FindMax.java
java FindMax

javac PairSum.java
java PairSum
```

## Time Complexity Notes
- **FindMax** is O(n) because it requires only a single pass through the array.
- **PairSum** is O(n²) because the brute force approach checks every possible
  pair of elements using nested loops. A faster O(n) solution exists using a
  HashSet/HashMap, but this lab specifically requires the brute force approach
  to illustrate the contrast in time complexity.

## Author
Name: Simons Samuel Weabo Junior
Student ID: 22335990
