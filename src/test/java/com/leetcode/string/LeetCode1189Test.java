package com.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: lenovo
 * @Date: 2020/1/28 17:36
 * @Description:
 */
public class LeetCode1189Test {



    @Test
    public void maxNumberOfBalloons() {
        int count = LeetCode1189.maxNumberOfBalloons("nlaebolko");
        System.out.println(count);
    }

    @Test
    public void isContainBalloon() {
        boolean nlaebolko = LeetCode1189.isContainBalloon("nlaebolko");
        System.out.println(nlaebolko);
    }
}