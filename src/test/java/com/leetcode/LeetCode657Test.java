package com.leetcode; 

import com.leetcode.string.LeetCode657;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode657 Tester. 
* 
* @author <Authors name> 
* @since <pre>12/04/2018</pre> 
* @version 1.0 
*/ 
public class LeetCode657Test { 

    private LeetCode657 leetCode657=new LeetCode657();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: judgeCircle(String moves) 
* 
*/ 
@Test
public void testJudgeCircle() throws Exception { 
//TODO: Test goes here...
     Assert.assertEquals( true , leetCode657.judgeCircle("RUDLRL"));
} 


} 
