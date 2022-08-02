package algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
	
	public static void main(String[] args) {
		System.out.println(new LongestSubstring().otherSolution("pwwkew"));
		
	}
	
	public int lengOfLongestSubstring(String s)  {
		List<String> list = new ArrayList<>();
		
		char[] charArr = s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		for(char c : charArr) {
			if(sb.indexOf(String.valueOf(c)) < 0) {
				sb.append(c);
			} else{
				list.add(sb.toString());
				System.out.println(sb.indexOf(String.valueOf(c)));
				System.out.println(String.valueOf(c));
				sb.delete(0, sb.indexOf(String.valueOf(c))+1).append(c);
			}
		}
		
		
		
		int result = sb.length();
		for(String str : list) {
			if(result < str.length()) { 
				result = str.length();
				System.out.println(str);
			}
		}
		
		return result;
	}
	
	public int otherSolution(String s) {
		int i=0, j=0, max=0;
		Set<Character> set = new HashSet<>();
		
		while(j < s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				max = Math.max(max, set.size());
			} else {
				set.remove(s.charAt(i++));
			}
		}
		
		return max;
	}
}


// 3. Longest Substring Without Repeating Characters

//Given a string s, find the length of the longest substring without repeating characters.

//Example 1
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

//Example 2
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.

//Example 3
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

//Constraints
//0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.