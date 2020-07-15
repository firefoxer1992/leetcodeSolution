package com.leetcode.backtrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\7\15 0015 23:08
 * @Description:
 */
public class LeetCode46 {
	private List<List<Integer>> result = new LinkedList<>();

	/* 主函数，输入一组不重复的数字，返回它们的全排列 */
	public List<List<Integer>> permute(int[] nums) {
		// 记录「路径」
		LinkedList<Integer> track = new LinkedList<>();
		backtrack(nums, track);
		return result;
	}

	// 路径：记录在 track 中
	// 选择列表：nums 中不存在于 track 的那些元素
	// 结束条件：nums 中的元素全都在 track 中出现
	public void backtrack(int[] nums, LinkedList<Integer> trackList) {
		// 触发结束条件
		if (trackList.size() == nums.length) {
			result.add(new LinkedList<>(trackList));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			// 排除不合法的选择
			if (trackList.contains(nums[i]))
				continue;
			// 做选择
			trackList.add(nums[i]);
			// 进入下一层决策树
			backtrack(nums, trackList);
			// 取消选择
			trackList.removeLast();
		}
	}

}
