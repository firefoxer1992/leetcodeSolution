package com.leetcode.array; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode867 Tester. 
* 
* @author <Authors name> 
* @since <pre>02/14/2020</pre> 
* @version 1.0 
*/ 
public class LeetCode867Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: transpose(int[][] A) 
* 
*/ 
@Test
public void testTranspose() throws Exception { 
//TODO: Test goes here...
    int[][] A={{1,2,3}, {4,5,6}, {7,8,9}};
    int[][] B=LeetCode867.transpose(A);
    for (int i = 0; i < B.length; i++) {
        for (int j = 0; j < B[i].length; j++) {
            System.out.println(B[i][j]);
        }
    }
} 


} 
