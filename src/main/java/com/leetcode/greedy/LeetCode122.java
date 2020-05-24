package com.leetcode.greedy;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\5\23 0023 23:17
 * @Description:
 *
 *
 * Say you have an array prices for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 *
 * Example 2:
 *
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 *              Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 *              engaging multiple transactions at the same time. You must sell before buying again.
 *
 * Example 3:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 */
public class LeetCode122 {
	public int maxProfit(int[] prices) {
		int length=prices.length;
		if(length==0) {
			return 0;
		}
		int maxProfit=0;
		for(int i=0;i<length-1;i++) {
			int diff=prices[i+1]-prices[i];
			//对于 “今天的股价 - 昨天的股价”，得到的结果有 3 种可能：（1）正数（2）0 （3）负数。
			//这道题的贪心算法的决策是：只加正数。这样的话，得到的收益就是最高的。
			if(diff>0) {
				maxProfit+=diff;
			}
		}
		return maxProfit;
	}
}
