package bakcoder.java.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(new HappyNumber().otherSolution(5));
    }

    public boolean isHappy(int n) {
        if(n == 4) return false; // 명확하지 않은 분기처리
        if(n / 10 == 0) {
            if(n == 1) return true;
            else if(n * n < 10) return false;
        }

        int tempSum = 0;
        while(n > 0) {
            int digit = n % 10;
            tempSum += digit * digit;
            n /= 10;
        }

        return isHappy(tempSum);
    }

    public boolean otherSolution(int n) {
        Set<Integer> inLoop = new HashSet<>();

        int squareSum, remain;
        while(inLoop.add(n)) {
            squareSum = 0;

            while(n > 0) {
                remain = n % 10;
                squareSum += remain*remain;
                n /= 10;
            }

            if(squareSum == 1) return true;
            else n = squareSum;
        }
        return false;
    }
}

//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.

//Example 1:
//Input: n = 19
//Output: true
//Explanation:
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1

//Example 2:
//Input: n = 2
//Output: false

//Constraints
//1 <= n <= 231 - 1

