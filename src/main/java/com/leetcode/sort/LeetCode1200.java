package com.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
 * Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 * a, b are from arr
 * a < b
 * b - a equals to the minimum absolute difference of any two elements in arr
 * <p>
 * Example 1:
 * Input: arr = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 * <p>
 * Example 2:
 * <p>
 * Input: arr = [1,3,6,10,15]
 * Output: [[1,3]]
 */
public class LeetCode1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        if (arr.length == 1) {
            List<List<Integer>> lists = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            list.add(arr[0]);
            lists.add(list);
            return lists;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            //先排序，然后再找出绝对值最小的相邻的两个数。
            min = diff < min ? diff : min;
        }
        List<List<Integer>> diffList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff == min) {
                List<Integer> numList = new ArrayList<>();
                numList.add(arr[i]);
                numList.add(arr[i + 1]);
                diffList.add(numList);
            }
        }
        return diffList;
    }

}
