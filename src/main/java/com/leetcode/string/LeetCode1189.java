package com.leetcode.string;

/**
 * @Author: lenovo
 * @Date: 2020/1/28 16:46
 * @Description: Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * <p>
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: text = "nlaebolko"
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: text = "loonbalxballpoon"
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: text = "leetcode"
 * Output: 0
 */
public class LeetCode1189 {

    public static int maxNumberOfBalloons(String text) {
        if (text == null) {
            return 0;
        }
        int balloonCount = 0;
        while (isContainBalloon(text)) {
            balloonCount++;
            text=text.replaceFirst("b","").replaceFirst("a","")
                    .replaceFirst("l","").replaceFirst("l","")
                    .replaceFirst("o","").replaceFirst("o","")
                    .replaceFirst("n","");
        }
        return balloonCount;
    }

    public static boolean isContainBalloon(String text) {
        boolean isContainB = text.contains("b");
        boolean isContainA = text.contains("a");
        // .*表示非\n的任意字符。而l+表示至少一个l字符。
        boolean isContainL = text.matches(".*l+.*l+.*");
        boolean isContainO = text.matches(".*o+.*o+.*");
        boolean isContainN = text.contains("n");
        boolean isContainBalloon = isContainB && isContainA && isContainL && isContainO && isContainN;
        return isContainBalloon;
    }



}
