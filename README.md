## Problem: ***Minimum Moves to Equal Array Elements*** (LeetCode ***#453***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Math / Greedy***

**Problem Statement:**  
Given an integer array `nums`, in one move you can **increment `n - 1` elements by 1**.

Return the **minimum number of moves** required to make all elements equal.

**Example:**
```
Input: nums = [1, 2, 3]
Output: 3
Explanation:
[1,2,3] → [2,3,3]
[2,3,3] → [3,4,3]
[3,4,3] → [4,4,4]

Input: nums = [1, 1, 1]
Output: 0
```
**Solution:**

1. Instead of incrementing `n - 1` elements, observe that this is equivalent to **decrementing one element**.  
2. The optimal target value is the **minimum element** in the array.  
3. The total number of moves equals the sum of differences between each element and the minimum element.  
4. In your approach, this is achieved by finding the **maximum value** and summing `(max - num)` for each element.  
5. Return the total moves.
