package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 *
 * Example 2:
 *
 * Input: arr = [1,2]
 * Output: false
 *
 * Example 3:
 *
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 *
 *
 */
public class LeetCode1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : arr) {
            //计算数组元素作为key，在map中对应的value加1的结果
            Integer count=map.compute(number,(k,v)->{
                if (v==null){
                    return 0;
                }
                return v+1;
            });
            map.put(number,count);
        }
        Set<Integer> set = new HashSet<>();
        //遍历map，通过set检查value是否重复
        for (Map.Entry  entry : map.entrySet()) {
            Integer value = (Integer) entry.getValue();
            if (set.contains(value)) {
                return false;
            } else {
                set.add(value);
            }
        }
        return true;
    }
}
