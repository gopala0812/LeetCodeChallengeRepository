## Problem: ***Find Smallest Letter Greater Than Target*** (LeetCode ***#744***)

**Difficulty:** ***Easy***  
**Language:** ***Java***  
**Topic:** ***Arrays / Binary Search***

**Problem Statement:**  
You are given a **sorted array** of characters `letters` and a character `target`.

Return the **smallest character** in the array that is **strictly greater** than `target`.  
If no such character exists, return the **first character** in the array (the array is considered **circular**).

**Example:**
```
Input: letters = ['c','f','j'], target = 'a'
Output: 'c'

Input: letters = ['c','f','j'], target = 'c'
Output: 'f'

Input: letters = ['c','f','j'], target = 'j'
Output: 'c'
```
**Solution:**

1. Traverse the `letters` array from left to right.  
2. Return the **first character** that is strictly greater than `target`.  
3. If no such character is found, return ***letters[0]*** due to the circular condition.  
4. This linear scan works efficiently given the small input constraints.
