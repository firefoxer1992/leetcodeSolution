package com.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: lenovo
 * @Date: 2020/1/29 18:05
 * @Description:
 */
public class LeetCode917Test {

    @Test
    public void reverseOnlyLetters() {
        String letters=LeetCode917.reverseOnlyLetters("a-bC-dEf-ghIj");
        Assert.assertEquals("j-Ih-gfE-dCba",letters);
    }

    @Test
    public void isLetter() {
    }
}