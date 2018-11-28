package com.leetcode; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode804Better Tester. 
* 
* @author <Authors name> 
* @since <pre>11/28/2018</pre> 
* @version 1.0 
*/ 
public class LeetCode804BetterTest { 
     private  LeetCode804Better leetCode804Better=new LeetCode804Better();
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
    Assert.assertEquals(2,   leetCode804Better.uniqueMorseRepresentations(words) );

} 


} 
