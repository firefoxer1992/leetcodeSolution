package com.leetcode.array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode977 Tester. 
* 
* @author <Authors name> 
* @since <pre>05/12/2019</pre> 
* @version 1.0 
*/ 
public class LeetCode977Test { 
      private  int[] A={-4,-1,0,3,10};
      private  int[] result={ 0,1,3,4,10 };
      private  int[]  square={ 0,1,9,16,100 };
      private  LeetCode977 leetCode977=new LeetCode977();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sortedSquares(int[] A) 
* 
*/ 
@Test
public void testSortedSquares() throws Exception { 
//TODO: Test goes here...
    Assert.assertArrayEquals( square , leetCode977.sortedSquares(A) );


} 


} 
