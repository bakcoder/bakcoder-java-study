package algorithm.leetcode;

public class Pow {
    public static void main(String[] args) {
        double x = 2;
        int n = -2147483648;

        System.out.println(new Pow().otherPow(x, n));
    }

    public double myPow(double x, int n) {
        if(x == 0 || x == 1) return x;

        int sign = n < 0 ? -1 : 1;
        x = sign < 0 ? 1/x : x;

        if(x == -1) {
            return n % 2 == 0 ? 1 : -1;
        }

        if(n == Integer.MIN_VALUE) {
            return 0;
        } else n *= sign; // abs


        double result = 1;
        for(int i=0 ; i<n ; i++) {
            result *= x;
        }

        return result;
    }

    public double otherPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0 || x == 1 || n == 1) {
            return x;
        }
        if (n < 0) {
            /**
             * -(n + 1) is done to avoid int overflow.
             */
            return (1 / x) * otherPow(1 / x, -(n + 1));
        }
        return n % 2 == 0 ? otherPow(x * x, n / 2) : x * otherPow(x * x, n / 2);
    }
}

//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

//Example 1:
//Input: x = 2.00000, n = 10
//Output: 1024.00000

//Example 2:
//Input: x = 2.10000, n = 3
//Output: 9.26100

//Example 3:
//Input: x = 2.00000, n = -2
//Output: 0.25000
//Explanation: 2-2 = 1/22 = 1/4 = 0.25

//constraint
//-100.0 < x < 100.0
//-2^31 <= n <= 2^31-1
//-10^4 <= xn <= 10^4

//2.00000
//-2147483648