package com.leetcode.string;

/**
 * @Author: lenovo
 * @Date: 2020/1/28 21:13
 * @Description:
 */
public class LeetCode1189Better {
    public int maxNumberOfBalloons(String text) {
        //count all letters
        int[] chars = new int[26];
        //统计每个字符的次数
         for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        //计算b出现的次数
        int min = chars[1];
        //for a
        min = Math.min(min, chars[0]);
        // for l /2
        min = Math.min(min, chars[11] / 2);
        //similarly for o/2
        min = Math.min(min, chars[14] / 2);
        //根据出现次数最少的字母，决定能产生多少个"balloon"单词。
        min = Math.min(min, chars[13]);
        return min;
    }

}
