package com.leetcode.sort;

import java.util.*;

/**
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 *
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
 *
 * Example 1:
 *
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 *
 * @Description:
 *
 */
public class LeetCode1122 {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        if (arr1.length == 0 || arr2.length==0) {
            return arr1;
        }
        List<Integer> firstList = new LinkedList<>();
        List<Integer> secondList = new LinkedList<>();
        //找出arr1中存在于arr2的数据
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    firstList.add(arr1[j]);
                }
            }
        }
        //找出arr1中不存在于arr2的数据
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[j] == arr2[i]  ) {
                    break;
                }
                if (i == arr2.length - 1) {
                    secondList.add(arr1[j]);
                }
            }
        }
        Collections.sort(secondList);
        firstList.addAll(secondList);
        return firstList.stream().mapToInt(Integer::valueOf).toArray();

    }
}
