package com.leetcode.linkedlist;

public class LeetCode876 {
        public ListNode middleNode(ListNode head) {
            if(head==null) {
                return null;
            }
            ListNode node=head;
            ListNode node2=head;
            int length=1;
            while(node.next!=null) {
                node=node.next;
                length++;
            }

            for(int i=1;node2.next!=null;i++) {
                if(i==length/2+1) {
                    return node2;
                }
                node2=node2.next;

            }
            return node2;
        }
}
