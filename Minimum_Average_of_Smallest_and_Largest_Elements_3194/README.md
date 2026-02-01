## Problem: ***Minimum Average of Smallest and Largest Elements*** (LeetCode ***#3194***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Sorting / Math***

**Problem Statement:**  
You are given an integer array `nums` with an **even length**.

In each operation:
- Take the **smallest** and **largest** remaining elements
- Compute their **average**

After performing this for all possible pairs, return the **minimum average** obtained.

**Example:**
```
Input: nums = [7, 8, 3, 4, 15, 13, 4, 1]

After sorting → [1, 3, 4, 4, 7, 8, 13, 15]

Pairs and averages:
(1, 15) → 8
(3, 13) → 8
(4, 8) → 6
(4, 7) → 5.5

Output: 5.5
```
**Solution:**

1. Sort the array in **ascending order**.  
2. Pair the **iᵗʰ smallest** and **iᵗʰ largest** elements.  
3. Compute the average for each pair:  
   ***(min + max) / 2***  
4. Store all averages and find the **minimum** among them.  
5. Return the minimum average as the final result.
