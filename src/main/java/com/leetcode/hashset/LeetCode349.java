package com.leetcode.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\6\21 0021 22:37
 * @Description:
 */
public class LeetCode349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null) {
			return new int[0];
		}
		Set<Integer> set = new HashSet<>();
		//将nums1的不重复数据，都放到set里面
		for (int k : nums1) {
			set.add(k);
		}
		Set<Integer> resultSet = new HashSet<>();
		//检查nums2中与nums1重复的数据，并将其放到resultSet里面
		for (int k : nums2) {
			if (set.contains(k)) {
				resultSet.add(k);
			}
		}
		return resultSet.stream().mapToInt(Integer::valueOf).toArray();
	}
}
