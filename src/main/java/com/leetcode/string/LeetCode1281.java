package com.leetcode.string;

/**
 *Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * Example 1:
 *
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15

 */
public class LeetCode1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        String numbers=String.valueOf(n);
        int multiResult=1;
        int sum=0;
        //为什么会是48？这个48是char数字字符和具体数字的差值，比如'1'的数字值是49，'2'的数字值是50。
        int dif='1'-1;
        for (char c : numbers.toCharArray()) {
            int number = c - dif;
            multiResult*=number;
            sum+=number;
        }
        return multiResult-sum;
    }
}
