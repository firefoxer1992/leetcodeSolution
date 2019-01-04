package com.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 利用HashSet的无序不重复性，筛选掉按规则视为相同的网址
 */
public class LeetCode929Better {
    public int numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replaceAll(".", "");
            seen.add(local + rest);
        }
        return seen.size();
    }
}
