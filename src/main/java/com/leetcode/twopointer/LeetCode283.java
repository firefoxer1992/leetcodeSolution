package com.leetcode.twopointer;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\7\10 0010 23:41
 * @Description:
 */
public class LeetCode283 {
	public void moveZeroes(int[] nums) {
		if (nums == null) {
			return;
		}
		//双指针，j用来记录零所在的位置
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			//如果不等于零，就将元素移到数组元素为零的位置
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j++] = temp;
			}
		}
	}
}
