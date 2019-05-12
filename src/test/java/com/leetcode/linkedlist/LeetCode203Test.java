package com.leetcode.linkedlist; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode203 Tester. 
* 
* @author <Authors name> 
* @since <pre>05/02/2019</pre> 
* @version 1.0 
*/ 
public class LeetCode203Test {
    private  ListNode node2=new ListNode(1,null);
    private  ListNode node=new ListNode(1,node2);
    LeetCode203 leetCode203=new LeetCode203();

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: removeElements(ListNode head, int val) 
* 
*/ 
@Test
public void testRemoveElements() throws Exception { 
//TODO: Test goes here...
    ListNode listNode= leetCode203.removeElements( node,1  ) ;
    ListNodeUtils.showValues(listNode);
} 


} 
