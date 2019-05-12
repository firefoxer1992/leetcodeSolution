package com.leetcode.linkedlist; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode83 Tester. 
* 
* @author <Authors name> 
* @since <pre>03/31/2019</pre> 
* @version 1.0 
*/ 
public class LeetCode83Test {

    private  ListNode node3=new ListNode(3,null);
    private  ListNode node2=new ListNode(2,node3);
    private  ListNode node1=new ListNode(1,node2);
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: deleteDuplicates(ListNode head) 
* 
*/ 
@Test
public void testDeleteDuplicates() throws Exception { 
//TODO: Test goes here...
    ListNode node=LeetCode83.deleteDuplicates(node1);
    while (node!=null) {
        System.out.println(node.val);
        node=node.next;
    }

} 


} 
