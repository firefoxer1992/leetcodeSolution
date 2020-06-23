package com.leetcode.binarysearch;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\6\22 0022 21:10
 * @Description:
 */
public class LeetCode69 {
	public int mySqrt(int x) {
		int left = 0;
		int right = x;
		int result = 0;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (mid * mid < x) {
				left = mid + 1;
				result = mid;
			} else if (mid * mid > x) {
				right = mid-1 ;
			} else {
				return mid;
			}
		}
		return result;
	}
}
