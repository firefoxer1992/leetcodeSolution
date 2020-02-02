package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lenovo
 * @Date: 2020/2/2 21:13
 * @Description:
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class LeetCode136 {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            //统计数组中各数字的数量。
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() == 1) {
                return (int) entry.getKey();
            }
        }
        return 0;
    }
}
