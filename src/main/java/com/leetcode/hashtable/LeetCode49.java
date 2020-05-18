package com.leetcode.hashtable;

import java.util.*;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\5\15 0015 22:46
 * @Description:
 */
public class LeetCode49 {

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		//Map的key为字母异位词升序排列的字符串，value为多个字母异位词组成的List
		Map<String, List<String>> map = new HashMap<>();
		for (String anagrams : strs) {
			char[] chars = anagrams.toCharArray();
			Arrays.sort(chars);
			String sortedAnagrams = String.valueOf(chars);
			//如果map的key不包含该字母异位词，那么就要创建新的List来存放字母异位词
			if (!map.containsKey(sortedAnagrams)) {
				map.put(sortedAnagrams,new ArrayList<>() );
			}
			//如果map的key已经了包含该字母异位词，那么就直接用已有的List来存放字母异位词
			map.get(sortedAnagrams).add(anagrams);
		}
		return new ArrayList<>(map.values());
	}
}
