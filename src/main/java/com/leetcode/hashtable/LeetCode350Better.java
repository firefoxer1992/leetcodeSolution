package com.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\6\18 0018 23:09
 * @Description:
 */
public class LeetCode350Better {

	public int[] intersect2(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		for (int num : nums1) {
			map1.put(num, map1.getOrDefault(num, 0) + 1);
		}
		for (int num : nums2) {
			map2.put(num, map2.getOrDefault(num, 0) + 1);
		}
		List<Integer> temp = new ArrayList<>();
		for(int key : map1.keySet()){
			//如果map2中包含了相同的key，说明两个数组有相同的数字。
			if(map2.containsKey(key)){
				for(int i = 0; i < Math.min(map1.get(key), map2.get(key)); i++)
					temp.add(key);
			}
		}
		int[] result = new int[temp.size()];
		for(int i = 0; i < result.length; i++)
			result[i] = temp.get(i);
		return result;
	}
}
