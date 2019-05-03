package com.leetcode.linkedlist;

public class ListNodeUtils {

    public static void  showValues(ListNode listNode){
         while (listNode!=null) {
             System.out.println(listNode.val);
             listNode=listNode.next;
         }

    }
}
