package com.leetcode.array;

/**
 Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 You may return any answer array that satisfies this condition.

 Example 1:
 Input: [4,2,5,7]
 Output: [4,5,2,7]
 Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

 */
public class LeetCode922 {
    public int[] sortArrayByParityII(int[] A) {
        if(A.length==0) {
            return A;
        }
        int[] result=new int[A.length];
        //t表示偶数下标，k表示奇数下标
        for (int i = 0,t=0,k=1; i <A.length ; i++) {
            if(A[i]%2==0) {
                result[t]=A[i];
                t+=2;
            }else {
                result[k]=A[i];
                k+=2;
            }
        }
        return result;
    }
}
