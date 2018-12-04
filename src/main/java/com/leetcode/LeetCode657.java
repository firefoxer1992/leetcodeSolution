package com.leetcode;

public class LeetCode657 {
    public boolean judgeCircle(String moves) {
        if (moves == null) {
            return true;
        }
        int horizontalSum = 0;
        int verticalSum = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                horizontalSum++;
            } else if (c == 'D') {
                horizontalSum--;
            } else if (c == 'L') {
                verticalSum++;
            } else if (c == 'R') {
                verticalSum--;
            }
        }
        return horizontalSum == 0 && verticalSum == 0;
    }
}