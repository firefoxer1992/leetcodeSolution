package com.leetcode.linkedlist;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\6\28 0028 21:34
 * @Description:
 */
public class LeetCode160Better {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode pA = headA;
		ListNode pB = headB;
		//如果相遇了就结束循环。
		while (pA != pB) {
			pA = pA.next;
			pB = pB.next;
			//如果两个链表都走完了所有的路，由于路程的和相同(pA+pB=pB+pA)，速度相同，最终会同时到达终点。
			if (pA == null && pB == null) {
				return null;
			}
			//A链表走完就指向B链表
			if (pA == null) {
				pA = headB;
			}
			//B链表走完就指向A链表
			if (pB == null) {
				pB = headA;
			}
		}
		return pA;
	}
}
