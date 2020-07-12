package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\7\8 0008 23:35
 * @Description:
 */
public class LeetCode283 {
	public void moveZeroes(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			//把所有非零元素往前移
			//count用于记录零的个数。
			if(nums[i]!=0) {
				nums[count++]=nums[i];
			}
		}
		for(int i=count;i<nums.length;i++) {
			nums[i]=0;
		}
	}
}
