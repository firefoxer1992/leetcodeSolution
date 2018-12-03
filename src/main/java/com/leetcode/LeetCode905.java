package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even(偶数) elements of A, followed by all the odd(奇数) elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 * Note:
 *     1 <= A.length <= 5000
 *     0 <= A[i] <= 5000
 */
public class LeetCode905 {
    public int[] sortArrayByParity(int[] A) {
        if(A==null || A.length==1){
            return A;
        }
        List<Integer> evenList=new ArrayList<>();
        List<Integer> oddList=new ArrayList<>();
        for(int number : A){
            if(number%2==0) {
                evenList.add(number);
            }else {
                oddList.add(number);
            }
        }
        //将奇数List的元素全添加到偶数List里面。再遍历整个List
        evenList.addAll(oddList);
        int[] results=new int[evenList.size()];
        for(int i=0;i<results.length;i++){
            results [i]=evenList.get(i);
        }

        return   results  ;
    }
}
