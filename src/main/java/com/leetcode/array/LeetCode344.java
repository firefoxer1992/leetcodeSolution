package com.leetcode.array;

/**
 *
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 *
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 */
public class LeetCode344 {
    /**
     * 由于题目规定"不要给另外的数组分配额外的空间"，因此这道题不允许直接使用reverse()相关的api。
     * @param s
     */
    public static void reverseString(char[] s) {
        if(s==null) {
            return;
        }
        int length=s.length;
        for(int i=0;i<length/2;i++){
            //每个首尾下标相加得到的值都是相同的。
            int indexSum=length-1-i;
            char temp=s[i];
            s[i]=s[indexSum];
            s[indexSum]=temp;
        }
    }
}

