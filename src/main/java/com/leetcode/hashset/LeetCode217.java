package com.leetcode.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\5\18 0018 23:51
 * @Description:
 *
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: true
 *
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: false
 *
 * Example 3:
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 *
 */
class LeetCode217{
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> distinct = new HashSet<Integer>();
		for(int num : nums) {
			if(distinct.contains(num)) {
				return true;
			}
			distinct.add(num);
		}
		return false;
	}
}
