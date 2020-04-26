package com.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\4\17 0017 23:01
 * @Description: Given an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
 * <p>
 * Follow up:
 * <p>
 * Recursive solution is trivial, could you do it iteratively?
 * <p>
 * 根据给出的root，进行先序遍历。
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [1,3,5,6,2,4]
 * <p>
 * }
 */
public class LeetCode589 {
	//list设置为成员变量，如果是方法内变量,无法一直添加元素
	private List<Integer> list = new LinkedList<>();

	public List<Integer> preorder(Node root) {
		if(root==null) {
			return list;
		}
		list.add(root.val);
		for (Node node : root.children) {
			preorder(node);
		}
		return list;
	}
}
