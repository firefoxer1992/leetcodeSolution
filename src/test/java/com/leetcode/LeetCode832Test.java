package com.leetcode; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode832 Tester. 
* 
* @author <Authors name> 
* @since <pre>12/05/2018</pre> 
* @version 1.0 
*/ 
public class LeetCode832Test { 
     private  LeetCode832 leetCode832=new LeetCode832();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: flipAndInvertImage(int[][] A) 
* 
*/ 
@Test
public void testFlipAndInvertImage() throws Exception { 
//TODO: Test goes here...
    int B[][]=  {  {1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}  };
    int A[][]={ {1,1,0},{1,0,1},{0,0,0}  };
    int result[][]={ {1,0,0},{0,1,0},{1,1,1} };

    leetCode832.flipAndInvertImage(B);
  }
} 
