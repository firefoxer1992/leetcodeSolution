package com.leetcode.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\6\21 0021 23:33
 * @Description:
 */
public class LeetCode349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> temp = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int pre = Integer.MIN_VALUE;
		for(int i = 0, j = 0; i < nums1.length && j < nums2.length; ){
			if (nums1[i] < nums2[j]) {
				//如果nums1[i] < nums2[j]，那么下一个可能相等的元素应该是nums1[i + 1]，所以i++。
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				//这里数组已经是排序数组，所以重复元素一定接连出现。那么出现两数组相等元素时，
				// 只要将其与前一个元素相比，不相等则说明这里的相交元素第一次出现，加入交集中。
				if (pre != nums1[i]) {
					pre = nums1[i];
					temp.add(nums1[i]);
				}
				i++;
				j++;
			}
		}
		int[] res = new int[temp.size()];
		for(int i = 0; i < res.length; i++)
			res[i] = temp.get(i);
		return res;
	}
}
