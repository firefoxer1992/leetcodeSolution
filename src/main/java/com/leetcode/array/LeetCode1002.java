package com.leetcode.array;

import java.util.*;

/**
 * Given an array A of strings made only from lowercase letters,
 *
 * return a list of all characters that show up in all strings within the list (including duplicates).
 * For example, if a character occurs 3 times in all strings but not 4 times, you need to include that
 * character three times in the final answer.
 *
 * You may return the answer in any order.
 *
 * Example 1:
 *
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 *
 * Example 2:
 *
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 */
public class LeetCode1002 {

    public static List<String> commonChars(String[] A) {
        if (A.length==0) {
            return Collections.emptyList();
        }
        if (A.length == 1) {
            return Arrays.asList(A);
        }
        List<String> letterList = new ArrayList<>();
        String first=A[0];
        //遍历第一个字符串中的所有字符
        for (char c : first.toCharArray()) {
            boolean isCommonLetter=true;
            String letter=String.valueOf(c);
            for (int i = 1; i < A.length; i++) {
                String word = A[i];
                //如果其他的字符串也含有这个字符，就将其替换为空，这样就不会影响后续重复的字符。
                if (word.contains(letter)) {
                    A[i]=word.replaceFirst(letter, "");
                } else {
                    //如果其他的任一字符串不包含该字符，说明不是同有的字符。
                    isCommonLetter=false;
                    break;
                }
            }
            if (isCommonLetter) {
                letterList.add(letter);
            }
        }
        return letterList;
    }


}
