package com.leetcode.array;

import java.util.Arrays;

/**
 Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 Example 1:
 Input: [-4,-1,0,3,10]
 Output: [0,1,9,16,100]

 */
public class LeetCode977 {
        public int[] sortedSquares(int[] A) {
             if( A.length==0) {
                 return A;
             }
            for (int i = 0; i < A.length ; i++) {
                    A[i]=A[i]*A[i];
            }
            Arrays.sort(A);
            return  A;
        }
}
