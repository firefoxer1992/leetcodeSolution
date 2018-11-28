package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Every email consists of a local name and a domain name, separated by the @ sign.
 *
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 *
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 *
 * If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
 *
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
 *
 * It is possible to use both of these rules at the same time.
 *
 * Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
 *
 *
 *
 * Example 1:
 *
 * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * Output: 2
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 */
public class LeetCode929 {
    public int numUniqueEmails(String[] emails) {
        int count=0;
        if (emails==null) {
            return count;
        }
        List list=new ArrayList();
        //遍历所有邮件
        for(int i=0;i<emails.length;i++){
            if(emails[i]==null) {
                continue;
            }
            String localName=emails[i].split("@")[0] ;
            String domain =emails[i].split("@")[1];
            //名称中的.号直接跳过 ，+号后面字母可忽略，而域名则不一样。
            if(localName.contains("+")) {
                localName=localName.split("\\+")[0];
            }
            String  name= localName.replace(".","");
            if( ! list.contains(name+domain) ){
                list.add(name+domain);
                count++;
            }
        }
        return count;
    }
}
