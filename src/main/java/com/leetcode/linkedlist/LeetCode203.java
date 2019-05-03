package com.leetcode.linkedlist;

/**
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */
public class LeetCode203 {
        public ListNode removeElements(ListNode head, int val) {
            ListNode fakeHead = new ListNode(-1);
            fakeHead.next = head;
            //curr是当前节点，prev是上一个节点。
            ListNode curr = head, prev = fakeHead;
            while (curr != null) {
                if (curr.val == val) {
                    prev.next = curr.next;
                } else {
                    prev = prev.next;
                }
                curr = curr.next;
            }
            return fakeHead.next;
        }
}
