package com.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: lenovo
 * @Date: 2020/1/30 20:29
 * @Description:
 */
public class LeetCode696Test {
    private String str="10101";

    @Test
    public void countBinarySubstrings() {
        int i = LeetCode696.countBinarySubstrings(str);
        System.out.println(i);
    }

    @Test
    public void checkBinary() {
        boolean b = LeetCode696.checkBinary("1110");
        System.out.println(b);
    }
}