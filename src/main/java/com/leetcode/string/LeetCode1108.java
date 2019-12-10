package com.leetcode.string;

/**
 * 1108. Defanging an IP Address
 *
 *Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 *
 *
 *
 */
public class LeetCode1108 {

    public static void main(String[] args) {
        String test="255.100.50.0";
        System.out.println(defangIPaddr(test));

    }
    public static String defangIPaddr(String address) {
        return address == null? null : address.replaceAll("\\.","[.]");
    }

}
