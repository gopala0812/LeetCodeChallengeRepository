## Problem: ***Count Symmetric Integers*** (LeetCode ***#2843***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***String / Math***

**Problem Statement:**  
You are given two integers `low` and `high`.  
An integer `x` is called **symmetric** if:

- It has an **even number of digits**, and  
- The **sum of the first half of its digits** is equal to the **sum of the second half**.

Return the **count of symmetric integers** in the inclusive range `[low, high]`.

**Example:**
```
Input: low = 1, high = 100
Output: 9

Input: low = 1200, high = 1230
Output: 4
```
**Solution:**

1. Iterate through all numbers from ***low*** to ***high***.  
2. Convert each number to a string to easily access its digits.  
3. If the number of digits is **odd**, skip it (cannot be symmetric).  
4. Split the digits into two equal halves.  
5. Compute the sum of digits in each half.  
6. If both sums are equal, increment the counter.  
7. Return the final count of symmetric integers.
