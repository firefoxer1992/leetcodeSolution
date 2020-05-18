package com.leetcode.hashtable;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\5\16 0016 12:32
 * @Description:
 */
public class LeetCode1365 {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		if(nums.length==0) {
			return nums;
		}
		//使用HashTable，将每个数字出现的次数记下来
		int[] counts=new int[101];
		for(int num:nums){
			counts[num]++;
		}
		int[] result=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			result[i]=0;
			//将HashTable中下标小于当前nums元素的值，全部加起来
			for(int j=0;j<nums[i];j++) {
				result[i]+=counts[j];
			}
		}
		return result;
	}
}
