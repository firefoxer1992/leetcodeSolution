package com.leetcode.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * 反转链表。
 * 可以通过迭代、递归解决。
 * 还可以将链表数据放入栈里面，利用“后进先处”的特点反转。
 */
public class LeetCode206 {

    public  ListNode reverseList(ListNode node) {
        //第一种解法：通过迭代解决
        // ListNode pre = null;
        // ListNode next = null;
        // while(node!=null){
        //    遍历到了链表的每一个节点node，就将node节点里面存储的ListNode next设置为前一个节点，达到反转的目的。
        //     next = node.next;
        //     node.next = pre;
        //     pre = node;
        //     node = next;
        // }
        // return pre;

        //第二种解法：使用递归。
        if(node==null || node.next==null){
            return node;
        }
        ListNode h = reverseList(node.next);
        node.next.next = node;
        node.next = null;
        return h;
    }
}
