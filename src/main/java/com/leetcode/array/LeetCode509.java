package com.leetcode.array;

/**
 * @Auther: Administrator
 * @Date: 2019\12\11 0011 21:44
 * @Description:
 */
public class LeetCode509 {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int N) {
        if (N <= 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        }
        int result=0;
        for (int i = 0; i < N; i++) {
            result+=fib(i);
        }
        return result;
    }
}
