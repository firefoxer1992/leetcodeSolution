package com.leetcode;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode929 Tester. 
* 
* @author <Authors name> 
* @since <pre>11/21/2018</pre> 
* @version 1.0 
*/ 
public class LeetCode929Test { 
   private LeetCode929 leetCode929=new LeetCode929();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: numUniqueEmails(String[] emails) 
* 
*/ 
@Test
public void testNumUniqueEmails() throws Exception { 
//TODO: Test goes here...
    String emails[] ={"test.email+alex@leet.code.com","test.e.mail+alex@leetcode.com","testemail+david@lee.tcode.com"};
    Assert.assertEquals(3,leetCode929.numUniqueEmails(emails));
} 


} 
