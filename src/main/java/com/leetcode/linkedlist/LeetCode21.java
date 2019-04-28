package com.leetcode.linkedlist;

/**
 *
 Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 Example:
 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 *
 */
public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null ) {
            return l2;
        }
        if(l2==null) {
            return l1;
        }
        //头节点node
        ListNode node=new ListNode(0);
        ListNode resultNode=node;
        //将数据小的节点插入到新的节点中。
        while(l1!=null && l2!=null){
            if(l1.val<l2.val ) {
                resultNode.next=l1;
                l1=l1.next;
            }else {
                resultNode.next=l2;
                l2=l2.next;
            }
            resultNode=resultNode.next;
        }
        if(l1==null) {
            resultNode.next=l2;
        }
        if(l2==null) {
            resultNode.next=l1;
        }
        return node.next;
    }
}