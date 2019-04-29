package com.leetcode.linkedlist;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode qNode=head;
        ListNode sNode=head.next;
        while(qNode!=sNode){
            if( qNode==null || sNode==null ) {
                return false;
            }
            qNode=qNode.next.next;
            sNode=sNode.next;
        }
        return  true;
    }
}