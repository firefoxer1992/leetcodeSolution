package com.leetcode.twopointer;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\7\8 0008 21:06
 * @Description:
 *
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 *
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 */
public class LeetCode344 {
	public void reverseString(char[] s) {
		if(s==null) {
			return ;
		}
		//双指针，一个从数组头部开始往后遍历，一个从数组尾部往前遍历，并且不断交换两个指针的元素，最后两个指针会相遇。
		for(int i=0,j=s.length-1;i<=j;i++,j--) {
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
	}
}
