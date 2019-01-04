package com.leetcode.linkedlist;


/**
 * 将链表转化为数组，直接通过下标返回中间的值。
 */
public class LeetCode876Better {
    public ListNode middleNode(ListNode head) {
        ListNode[] nodes = new ListNode[100];
        int t = 0;
        while (head.next != null) {
            nodes[t++] = head;
            head = head.next;
        }
        return nodes[t / 2];
    }
}
