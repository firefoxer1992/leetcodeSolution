package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\7\8 0008 22:47
 * @Description:
 */
public class LeetCode169 {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num,0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > nums.length / 2) {
				return entry.getValue();
			}
		}
		return 0;
	}
}
