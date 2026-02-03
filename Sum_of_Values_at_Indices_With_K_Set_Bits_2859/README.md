## Problem: ***Sum of Values at Indices With K Set Bits*** (LeetCode ***#2859***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Bit Manipulation / Arrays***

**Problem Statement:**  
You are given a list of integers `nums` and an integer `k`.

For each index `i` in `nums`, consider the **binary representation** of `i`.  
If the number of **set bits (1s)** in the binary form of `i` is equal to `k`, add `nums[i]` to the sum.

Return the **total sum** of all such values.

**Example:**
```
Input: nums = [5, 10, 1, 5, 2], k = 1

Indices with exactly 1 set bit:
Index 1 → binary 001
Index 2 → binary 010
Index 4 → binary 100

Values → 10 + 1 + 2 = 13

Output: 13

Input: nums = [4, 3, 2, 1], k = 2
Output: 1
```
**Solution:**

1. Initialize a variable ***sum = 0***.  
2. Traverse through each index `i` in the list.  
3. Count the number of set bits in the binary representation of `i` by repeatedly dividing by 2.  
4. If the count of set bits equals ***k***, add `nums[i]` to ***sum***.  
5. After checking all indices, return the final sum.
