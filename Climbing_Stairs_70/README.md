## Problem: ***Climbing Stairs*** (LeetCode ***#70***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Dynamic Programming / Fibonacci***

**Problem Statement:**  
You are climbing a staircase that has `n` steps.  
Each time, you can either climb **1 step** or **2 steps**.

In how many **distinct ways** can you climb to the top?

**Example:**
```
Input: n = 2
Output: 2

Explanation:
1 + 1
2

Input: n = 5
Output: 8
```
**Solution:**

1. If `n ≤ 2`, the number of ways is simply ***n***.  
2. This problem follows the **Fibonacci pattern**:  
   - ways(n) = ways(n − 1) + ways(n − 2)  
3. Use two variables to store previous results and update iteratively.  
4. Loop from ***3*** to ***n*** and compute the current number of ways.  
5. Return the final value representing total ways to climb the stairs.
