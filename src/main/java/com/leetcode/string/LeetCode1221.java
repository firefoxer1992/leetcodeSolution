package com.leetcode.string;

/**
 * @Auther: Administrator
 * @Date: 2019\12\10 0010 23:04
 * @Description:
 *
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 *
 * Given a balanced string s split it in the maximum amount of balanced strings.
 *
 * Return the maximum amount of splitted balanced strings.
 *
 * Example 1:
 *
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 *
 * Example 2:
 *
 * Input: s = "RLLLLRRRLR"
 * Output: 3
 * Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
 */
public class LeetCode1221 {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }

    public static int balancedStringSplit(String s) {
        int count=0;
        if (s == null) {
            return count;
        }
        int sum=0;
        for (char c : s.toCharArray()) {
            if (c=='R') {
                sum++;
            } else if (c == 'L') {
                sum--;
            }else {
                continue;
            }
            if (sum == 0) {
                count++;
            }
        }
        return count;
    }
}
