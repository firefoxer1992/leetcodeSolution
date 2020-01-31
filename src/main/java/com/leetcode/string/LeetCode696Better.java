package com.leetcode.string;

/**
 * @Author: lenovo
 * @Date: 2020/1/31 20:49
 * @Description:
 */
public class LeetCode696Better {
    public int countBinarySubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int preRun = 0;
        int curRun =1;
        int count = 0;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(i - 1)) {
                curRun++;
            } else {
                //用preRun记住前一个出现数字的数量。比如"00111"，那么0的数量为preRun,也就是2.
                preRun = curRun;
                curRun = 1;
            }
            //curRun代表的是后一个出现数字的数量。
            //比如遍历到"001"，那么0出现的次数是2，1出现的次数是1，这样就有一种可能"01"，所以count数量加一。
            if (preRun >= curRun) {
                count++;
            }
        }
        return count;
    }

}
