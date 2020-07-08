package com.leetcode.stack;

import java.util.Stack;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\7\7 0007 23:10
 * @Description:
 */
public class LeetCode344 {
	public void reverseString(char[] s) {
		if(s==null) {
			return;
		}
		//先入栈
		Stack<Character> stack=new Stack<>();
		for(char c:s){
			stack.push(c);
		}
		StringBuilder sb=new StringBuilder();
		//再出栈。
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		s=sb.toString().toCharArray();
		System.out.println(s);
	}

}
