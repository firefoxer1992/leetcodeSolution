package com.leetcode;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * 思考：嵌套遍历字符串的时间复杂度是O(n^2)
 *  处理两个数的关系，最好还是用HashMap。通过键值对处理。时间复杂度为O(n)
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int results[] =null;
         if( size==0 || target<0 ){
             return results;
         }
        for(int i=0;i<size ;i++) {
            for(int j=i+1;j<size;j++)
                if(nums[i]+nums[j]==target) {
                    return new int[] {i,j};
                }
        }
        return results;
    }

}
