package algorithm.programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Lessons68644 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(Arrays.toString(new Lessons68644().otherSolution(numbers)));
    }

    public int[] solution(int[] numbers) {

        int pointer = 0;
        Set<Integer> answerSet = recur(pointer, numbers, new TreeSet<>());
        Integer[] answer = new Integer[answerSet.size()];

        //HashSet 대신 TreeSet을 쓸 경우 자동 오름차순 sort됨
        return Arrays.stream(answerSet.toArray(answer)).mapToInt(i -> i).toArray();
    }
    public Set<Integer> recur(int pointer, int[] numbers, Set<Integer> numSet) {
        if(pointer == numbers.length - 1) return numSet;
        for(int i=pointer + 1 ; i<numbers.length ; i++) {
            numSet.add(numbers[pointer] + numbers[i]);
        }
        return recur(pointer + 1, numbers, numSet);
    }

    public int[] otherSolution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}

//https://programmers.co.kr/learn/courses/30/lessons/68644