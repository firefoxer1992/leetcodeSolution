package com.leetcode.linkedlist;

public class LeetCode83Better {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null || head.next==null){
                return head;
            }
            ListNode node=head;
            while(node!=null && node.next!=null ){
                if( node.val==node.next.val ) {
                    //删除重复的节点，不进行迭代，因为重复的值可能出现多次
                    node.next=node.next.next;
                }else {
                    //迭代
                    node=node.next;
                }

            }
            return head;
        }
    }

