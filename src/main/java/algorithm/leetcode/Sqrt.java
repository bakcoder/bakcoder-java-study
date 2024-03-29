package algorithm.leetcode;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(new Sqrt().mySqrt(4));
    }
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;

        int sqrt = 1;
        for(int i=1 ; i<x ; i++) {
            if(i <= x / i) sqrt = i;
            else break;
        }
        return sqrt;
    }

    public int mySqrt2(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;

        int n = 1;

        while(Double.valueOf(x)/Double.valueOf(n) > n + 2) {
            n++;
        }

        return n;
    }

}

//Given a non-negative integer x, compute and return the square root of x.
//
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//
//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

//Example 1:
//Input: x = 4
//Output: 2

//Example 2:
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

//Constraints
//0 <= x <= 2^31 - 1