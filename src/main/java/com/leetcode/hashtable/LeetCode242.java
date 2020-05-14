package com.leetcode.hashtable;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\5\14 0014 22:45
 * @Description:
 */
public class LeetCode242 {
	public boolean isAnagram(String s, String t) {
		if (s == null && t == null) {
			return true;
		}else if (s == null ) {
			return false;
		}
		int[] counts = new int[26];
		//先用哈希数组，将26个字符出现的次数都记下来。
		//然后再遍历字符串t，将每种字符出现的次数逐次减一
		for (int i = 0; i < s.length(); i++) {
			counts[s.charAt(i) - 'a']++;
			counts[t.charAt(i) - 'a']--;
		}
		//如果两个字符串是异位字母，那么遍历过后数组counts的每一个元素都是0.
		for (int num : counts) {
			if (num != 0) {
				return false;
			}
		}
		return true;
	}
}
