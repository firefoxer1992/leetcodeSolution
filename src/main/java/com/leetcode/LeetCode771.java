package com.leetcode;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * Note:
 *
 *     S and J will consist of letters and have length at most 50.
 *     The characters in J are distinct.
 *
 *
 */
public class LeetCode771 {
        public int numJewelsInStones(String J, String S) {
            int count=0;
            //检查特殊情况，提高程序的健壮性
            if(J==null || S==null) {
                return count;
            }
            for(int i=0;i<S.length();i++) {
                for(int j=0;j<J.length();j++) {
                    //char是基本类型，比较char直接用==就可以了。
                    if(S.charAt(i)== J.charAt(j) ) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

