package com.leetcode.linkedlist;

public class LeetCode206i {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *
     * 思路：
     * While you are traversing the list, change the current node's next pointer to point to its previous element.
     * Since a node does not have reference to its previous node, you must store its previous element beforehand.
     * You also need another pointer to store the next node before changing the reference. Do not forget to return the new head reference at the end!
     *
     */
    public  ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            //先记住下一个节点
            ListNode nextTemp = curr.next;
            //将当前节点的指针，指向"上一个节点"，形成反转
            curr.next = prev;
            //存储当前节点，以便作为迭代后的"上一个节点"。
            prev = curr;
            //向下一个节点迭代
            curr = nextTemp;
        }
        return prev;
    }
}
