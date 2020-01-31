package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lenovo
 * @Date: 2020/1/30 20:03
 * @Description: Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 * <p>
 * Substrings that occur multiple times are counted the number of times they occur.
 * <p>
 * Example 1:
 * <p>
 * Input: "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
 * <p>
 * Notice that some of these substrings repeat and are counted the number of times they occur.
 * <p>
 * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 * <p>
 * Example 2:
 * <p>
 * Input: "10101"
 * Output: 4
 * Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 */
public class LeetCode696 {
    public static int countBinarySubstrings(String s) {
        if (s == null || s.length() == 1) {
            return 0;
        }
        int count = 0;
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subStr = s.substring(i, j);
                if (checkBinary(subStr)) {
                    count++;
                    charList.add(subStr);
                }
            }
        }
        charList.forEach(System.out::println);
        return count;
    }

    /**
     * 检查是否由"01"、"0011"等组成。
     *
     * @param binary
     * @return
     */
    public static boolean checkBinary(String binary) {
        if (binary == null) {
            return false;
        }
        //必须是偶数位
        if (binary.length() % 2 != 0) {
            return false;
        }
        char[] chars = binary.toCharArray();
        int length = binary.length();
        //首尾字符不能相同
        if (chars[0] == chars[length - 1]) {
            return false;
        }
        //前一半的字符必须都相同
        for (int i = 0; i < length / 2; i++) {
            if (chars[0] != chars[i]) {
                return false;
            }
        }
        //后一半的字符必须都相同
        for (int i = length - 1; i >= length / 2; i--) {
            if (chars[length - 1] != chars[i]) {
                return false;
            }
        }
        return true;
    }

}
