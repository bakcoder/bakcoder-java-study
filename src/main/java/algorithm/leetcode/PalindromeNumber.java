package algorithm.leetcode;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().otherSolution(131));
	}
	
	public boolean isPalindrome(int x) {
		if(x < 0) return false;
		else {
			String strX = String.valueOf(x);
			for(int i=0 ; i<strX.length()/2 ; i++) {
				if(strX.charAt(i) != strX.charAt(strX.length()-1 - i)) {
					return false;
				}
			}
			
		}
		return true;
	}
	
	public boolean otherSolution(int x) {
		if(x < 0 || (x%10 ==0 && x !=0)) return false;
		
		int reverseNum = 0;
		while(x > reverseNum) {
			reverseNum = 10 * reverseNum + (x % 10);
			x /= 10;
		}
		
		return x == reverseNum || x == reverseNum /10;
	}

}

// 9. Palindrome Number

//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.
//For example, 121 is a palindrome while 123 is not.

//Example 1
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.

//Example 2
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

//Example 3
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

//Constraints
//-231 <= x <= 231 - 1