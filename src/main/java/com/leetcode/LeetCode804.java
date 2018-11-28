package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 *
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * There are 2 different transformations, "--...-." and "--...--.".
 */
public class LeetCode804 {
    private Set<String>  hashSet=new HashSet<>();
    private  Map<String,String> codeMap = getUniqueMap();

    public int uniqueMorseRepresentations(String[] words) {
         if(words==null)  {
             return  0;
         }
         //遍历字符串数组，计算出各个字符串组合起来的morseCode。
         for(String word: words) {
             StringBuilder morseCode=new StringBuilder();
              for(int i=0;i<word.length();i++) {
                  String code=codeMap.get( String.valueOf( word.charAt(i) )      );
                  morseCode.append( code );
              }
              hashSet.add( morseCode.toString() );
         }
        return  hashSet.size();
    }

    /**
     * 设置字母和morseCode的关系
     * @return
     */
     public Map<String ,String> getUniqueMap(){
        Map<String ,String> map=new HashMap<>();
        map.put("a",".-");
        map.put("b","-...");
         map.put("c","-.-.");
         map.put("d","-.." );
         map.put("e",".");
         map.put("f","..-.");
         map.put("g","--.");
         map.put("h","....");
         map.put("i","..");
         map.put("j",".---");
         map.put("k","-.-");
         map.put("l",".-..");
         map.put("m","--");
         map.put("n","-.");
         map.put("o","---");
         map.put("p",".--.");
         map.put("q","--.-");
         map.put("r",".-.");
         map.put("s","...");
         map.put("t","-");
         map.put("u","..-");
         map.put("v","...-");
         map.put("w",".--");
         map.put("x","-..-");
         map.put("y","-.--");
         map.put("z","--..");

        return  map;
     }

}
