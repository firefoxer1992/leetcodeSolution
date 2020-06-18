package com.leetcode.hashtable;

import java.util.*;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\6\17 0017 22:33
 * @Description:
 */
public class LeetCode350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			return intersect(nums2, nums1);
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		//用HashMap的key记录nums1中的元素，value记录出现的次数。
		for (int num : nums1) {
			//key已经存在，value就加1，否则value就默认为1
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int k = 0;
		//遍历nums2，如果元素num存在于map中，说明两个数组中有相同的值。
		for (int num : nums2) {
			int count = map.getOrDefault(num, 0);
			if (count > 0) {
				//用nums1来记录两个数组中相同的数字交集,k表示交集所达到的下标
				nums1[k++] = num;
				//HashMap中的value值减一，表示已经找到一个相同的了
				map.put(num, count - 1);
			}
		}
		return Arrays.copyOfRange(nums1, 0, k);
	}
}
