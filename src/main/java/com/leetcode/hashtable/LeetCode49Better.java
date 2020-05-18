package com.leetcode.hashtable;

import java.util.*;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\5\15 0015 23:58
 * @Description:
 */
public class LeetCode49Better {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		Map<String, List<String>> map = new HashMap<>();
		for (String anagrams : strs) {
			char[] chars = new char[26];
			//用一个哈希数组，将字母异位词的每一个字母出现的次数记下来
			for (char c : anagrams.toCharArray()) {
				chars[c - 'a']++;
			}
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
