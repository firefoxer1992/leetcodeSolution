package com.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\6\28 0028 20:46
 * @Description:
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * For example, the following two linked lists:
 *
 * begin to intersect at node c1.
 *
 *
 *
 * Example 1:
 *
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * Output: Reference of the node with value = 8
 * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 *
 *
 *
 * Example 2:
 *
 * Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * Output: Reference of the node with value = 2
 * Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [0,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 *
 *
 */
public class LeetCode160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null || headB==null) {
			return null;
		}
		if(headA==headB){
			return headA;
		}
		//遍历链表A，将每一个链表节点放入map中，关键是将ListNode作为map的key!
		Map<ListNode,Integer> map=new HashMap<>();
		while(headA!=null) {
			map.put(headA,1);
			headA=headA.next;
		}
		//遍历链表B，如果map中存在当前节点，就说明这个节点是两个链表的相交点。
		while(headB!=null) {
			if(map.containsKey(headB)) {
				return headB;
			}
			headB=headB.next;
		}
		return null;
	}
}
