package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Administrator
 * @Date: 2019\12\29 0029 22:02
 * @Description:
 */
public class LeetCode1207Better {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            //数组值作为key，对应的map中的value值进行加一操作。如果不存在，就设为1.
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //如果set集合的数量和map集合的数量是一样的，说明没有重复的值。
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }

}
