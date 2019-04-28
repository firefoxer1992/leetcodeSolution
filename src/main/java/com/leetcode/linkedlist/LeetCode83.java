package com.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * 这里提供的链表原来是有序的啊。没有审好题。
 * 以下程序未通过单元测试
 */
public class LeetCode83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode node=head.next;
        ListNode pre=head;
        List<Integer> nodeList=new ArrayList<Integer>();
        nodeList.add(head.val);
        while( node!=null ){
            if(node==null) {
                node=pre;
            }
            //包含重复值就删掉
           if( nodeList.contains( node.val )) {
                pre.next=node.next;
               if (node.next!=null) {
                   node=node.next.next;
               }else {
                   node=node.next;
               }
           }else {
               nodeList.add( node.val );
               pre=pre.next;
               node=node.next;
           }
        }
        return head;
    }

}
