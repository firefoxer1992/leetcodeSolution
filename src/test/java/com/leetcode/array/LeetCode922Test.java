package com.leetcode.array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LeetCode922 Tester. 
* 
* @author <Authors name> 
* @since <pre>05/12/2019</pre> 
* @version 1.0 
*/ 
public class LeetCode922Test {
    private  int[] A={ 4,2,5,7 };
    private  int[] result={ 4,5,2,7 };
    private  LeetCode922 leetCode922=new LeetCode922();
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sortArrayByParityII(int[] A) 
* 
*/ 
@Test
public void testSortArrayByParityII() throws Exception { 
//TODO: Test goes here...
    int[] B=leetCode922.sortArrayByParityII(A);
    for (int value:B) {
        System.out.println(value);
    }
   Assert.assertArrayEquals( result , B );
}


} 
