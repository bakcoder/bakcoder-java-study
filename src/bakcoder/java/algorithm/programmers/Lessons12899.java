package bakcoder.java.algorithm.programmers;

import java.util.Arrays;
import java.util.Stack;

public class Lessons12899 {
    public static void main(String[] args) {
        System.out.println(new Lessons12899().otherSolution2(4));
    }
    public String solution(int n) { // 효율성 실패
        String[] arr124format = new String[n+1];
        char[] subArr = {'1', '2', '4'};
        Arrays.fill(arr124format, "");

        for(int pointer = 1 ; pointer <= n ; pointer++) {
            arr124format[pointer] = arr124format[(pointer-1) / 3] + subArr[(pointer-1) % 3];
        }

        return arr124format[n];
    }

    public String otherSolution(int n) {
        Stack<String> stack = new Stack<>();
        while(n != 0) {
            if(n % 3 == 0) {
                stack.push("4");
                n /= 3;
                n--;
            } else {
                stack.push(String.valueOf(n % 3));
                n /= 3;
            }
        }

        StringBuffer result = new StringBuffer();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public String otherSolution2(int n) {
        String answer = "";

        String[] arr = {"4", "1", "2"};

        while(n > 0) {
            answer = arr[n%3] + answer;
            n = (n-1)/3;
        }
        return answer;
    }
}

//10진법 124 3진법
//  1    1    1
//  2    2    2
//  3    4   10
//  4   11   11
//  5   12   12
//  6   14   20
//  9   24   100
//https://programmers.co.kr/learn/courses/30/lessons/12899
