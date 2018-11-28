package com.leetcode; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode804 Tester. 
* 
* @author <Authors name> 
* @since <pre>11/27/2018</pre> 
* @version 1.0 
*/ 
public class LeetCode804Test { 
    private   LeetCode804 leetCode804=new LeetCode804();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: uniqueMorseRepresentations(String[] words) 
* 
*/ 
@Test
public void testUniqueMorseRepresentations() throws Exception { 
//TODO: Test goes here...
    String[] words=new String[]{  "gin", "zen", "gig", "msg" };
    Assert.assertEquals(2  ,  leetCode804.uniqueMorseRepresentations(words));
} 

/** 
* 
* Method: getUniqueMap() 
* 
*/ 
@Test
public void testGetUniqueMap() throws Exception { 
//TODO: Test goes here... 
} 


} 
