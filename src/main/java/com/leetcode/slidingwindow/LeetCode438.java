package com.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EnjoyCoding
 * @Date: 2020\4\26 0026 21:13
 * @Description:
 *
 * 首先在哈希表chars中标记子字符串p中出现的各个字符的个数。
 * 用一个滑动窗口盖在母字符串s上，右指针一位一位向右滑动并标记访问到的字符，滑动窗口的大小拓展到子字符串长度p.length，
 * 当前滑动窗口覆盖的子串是一个可能解。
 * 然后，左指针下标为0，右指针下标为子字符串长度p.length。每次循环，左右指针同时向右移动一位，直到母字符串结尾。
 *
 *
 */
public class LeetCode438 {
	public List<Integer> findAnagrams(String s, String p) {
		///We will use sliding window template
		List<Integer> indexList = new ArrayList<>();

		//Check for bad input
		if (s.length() == 0 || p.length() == 0 || s.length() < p.length()){
			return new ArrayList<Integer>();
		}
		//Set up character hash
		//Keep track of how many times each character appears
		//将字符串p中，各个字符出现的次数记录下来。chars[]数组用于计数。
		//比如p="abc"，那么chars为{1,1,1,0,0....0}
		//也可以说，在哈希表chars中标记字符串p中出现的字符状况。
		int[] chars = new int[26];
		for (Character c : p.toCharArray()){
			//Increment to setup hash of all characters currently in the window
			//Later on, these get DECREMENTED when a character is found
			//A positive count later on means that the character is still "needed" in the anagram
			//A negative count means that either the character was found more times than necessary
			//Or that it isn't needed at all
			chars[c-'a']++;
		}
		//Start = start poniter, end = end pointer,
		//len = length of anagram to find
		//diff = length of currently found anagram. If it equals
		//the length of anagram to find, it must have been found
		int start = 0, end = 0, len = p.length(), diff = len;
		char temp;
		//Before we begin this, the "window" has a length of 0, start and
		//end pointers both at 0
		//遍历母字符串s，找到下标对应的字符，并将用于计数的字符数组chars[]中对应的字符数量减一，表示已经出现了一次。
		//比如字符'a'出现了一次，那么就将字符数组chars[]中'a'对应的元素a[0]减一。
		//这样循环操作，就能找出是否匹配异位词。
		//比如字符串s为"abcabc",p为"abc"，那么字符数组chars[]记录了p的各个字符次数，也就是{1,1,1,0,0....0}
		//遍历母字符串s，当遍历完第一个c时，a,b,c都出现了一次，可以组合成子字符串p。符合要求。
		for (end = 0; end < len; end++){
			//Process current char
			temp = s.charAt(end);
			//As discussed earlier, decrement it
			chars[temp-'a']--;
			//If it's still >= 0, the anagram still "needed" it so we count it towards the anagram by
			//decrementing diff
			if (chars[temp-'a'] >= 0){
				diff--;
			}
		}
		//This would mean that s began with an anagram of p
		//diff减少为0，表示母字符串s，是以子字符串p开头的
		if (diff == 0){
			indexList.add(0);
		}
		//At this point, start remains at 0, end has moved so that the window is the length of the anagram
		//from this point on we are going to be moving start AND end on each iteration, to shift the window
		//along the string
		//到此，在母字符串s中，双指针的start指针还停留在下标0，而end指针已经移动到p.length的下标。
		//现在开始进行"滑动窗口"，同时将双指针向右移动一格，直到母字符串结尾。
		while (end < s.length()){
			//Temp represents the current first character of the window. The character that is
			//going to be "left behind" as the window moves.
			temp = s.charAt(start);
			//If it's not negative, this means that the character WAS part of the anagram. That means we
			//are one step "farther away" from completing an anagram. So we must increment diff.
			//如果字符对应的字符数组中的元素不是负数，说明该字符是子字符串的一部分。
			if (chars[temp-'a'] >= 0){
				diff++;
			}
			//Increment the hash value for this character, because it is no longer contained in the window
			chars[temp-'a']++;
			//Increment start to start shifting the window over by 1
			start++;
			//Temp represents the last character of the window, the "new" character from the window shift.
			//This character "replaces" the one we removed before so the window stays the same length (p.length())
			temp = s.charAt(end);
			//Decrement hash value for this character, because it is now a part of the window
			chars[temp-'a']--;
			//Again, if it's not negative it is part of the anagram. So decrement diff
			if (chars[temp-'a'] >= 0){
				diff--;
			}
			//If diff has reached zero, that means for the last p.length() iterations, diff was decremented and
			//NOT decremented, which means every one of those characters was in the anagram, so it must be an anagram
			//Note: If many windows in a row find anagrams, then each iteration will have diff incremented then decremented again
			// 当diff减少到0，表明在过去的p.length()个字符中，出现了符合条件的异位词 ?? 也就是母字符串s包含子字符串p。
			if (diff == 0){
				indexList.add(start);
			}
			//Increment for next iteration
			end++;

		}
		return indexList;
	}
}
