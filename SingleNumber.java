/*Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

/*
 * Logic:
 * 1. Brute force - Complexity - O(n^2)
 * 2. Use XoR operation - Complexity - O(n) 
 */

public class Solution {
    public int singleNumber(int[] nums) {
        for(int i=1; i<nums.length; i++)
            nums[0] = nums[0] ^ nums[i];
            
        return nums[0];
    }
}