package bakcoder.java.algorithm.programmers;

import java.util.Arrays;

public class Lessons76501 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(new Lessons76501().otherSolution(absolutes, signs));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int[] result = new int[absolutes.length];

        for(int i=0 ; i<absolutes.length ; i++) {
            result[i] = absolutes[i] * (signs[i] ? 1 : -1);
        }

        return Arrays.stream(result).sum();
    }

    public int otherSolution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0 ; i<absolutes.length ; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }

        return answer;
    }
}
