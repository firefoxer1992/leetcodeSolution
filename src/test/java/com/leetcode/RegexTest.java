package com.leetcode;

/**
 * @Author: lenovo
 * @Date: 2020/1/28 18:15
 * @Description:
 */
public class RegexTest {
    public static void main(String[] args) {
        String text="boalloon";
        boolean isContainO = text.matches(".*o+.*o+.*");
        System.out.println(isContainO);

    }
}
