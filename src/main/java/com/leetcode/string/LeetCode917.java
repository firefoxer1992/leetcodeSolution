package com.leetcode.string;

/**
 * @Author: lenovo
 * @Date: 2020/1/29 17:25
 * @Description: Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "ab-cd"
 * Output: "dc-ba"
 * <p>
 * Example 2:
 * <p>
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * <p>
 * Example 3:
 * <p>
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 */
public class LeetCode917 {
    public static String reverseOnlyLetters(String S) {
        if (S == null) {
            return null;
        }
        char temp;
        char[] chars = S.toCharArray();
        //类似双指针操作。左边的i不断向右边迭代，而右边的j向左边不断地迭代。当满足i<=j时，不断循环。交换符合条件的字母。
        for (int i = 0, j = S.length() - 1; i<=j; ) {
            char leftChar = chars[i];
            char rightChar = chars[j];
            boolean isLetterLeft = isLetter(leftChar);
            boolean isLetterRight = isLetter(rightChar);
            if (isLetterLeft && isLetterRight) {
                //如果两个都是字母，就进行交换。
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (!isLetterLeft && isLetterRight) {
                i++;
            } else if (isLetterLeft && !isLetterRight) {
                j--;
            } else if (!isLetterLeft && !isLetterRight) {
                //不是字母，就进行继续迭代。
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }

    /**
     * 判断是否字母
     * @param c
     * @return
     */
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
