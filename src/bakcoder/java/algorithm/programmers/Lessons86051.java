package bakcoder.java.algorithm.programmers;

import java.util.Arrays;

public class Lessons86051 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(new Lessons86051().otherSolution(numbers));
    }

    public int solution(int[] numbers) {
        int answer = 45;

        for(int i=0 ; i<numbers.length ; i++) {
            answer -= numbers[i];
        }
        return answer;
    }

    public int otherSolution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}

//https://programmers.co.kr/learn/courses/30/lessons/86051
