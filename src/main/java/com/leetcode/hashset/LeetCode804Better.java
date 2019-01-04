package com.leetcode.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * 通过各个字符和字符'a'之间的编码差，获取对应的值。
 *
 * 利用HashSet的不重复性存储计算符合条件的个数。
 */
public class LeetCode804Better {

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> morseCodeSet=new HashSet<>();
        if(words==null)  {
            return  0;
        }
        String[] morseCodes=new String[]{
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."
        };
        for(String word : words) {
           StringBuilder stringBuilder=new StringBuilder();
           for(char charactor : word.toCharArray() ) {
               stringBuilder.append( morseCodes[ charactor-'a' ] );
           }
            morseCodeSet.add(stringBuilder.toString() );
        }
        return  morseCodeSet.size();
    }
}