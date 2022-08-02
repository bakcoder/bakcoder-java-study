package algorithm.programmers;

import java.util.Arrays;

public class Lessons12910 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(new Lessons12910().solution(arr, divisor)));
    }
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(Arrays.stream(arr).filter(e -> e % divisor == 0).toArray()).sorted().toArray();
        return answer.length == 0 ? new int[] {-1} : answer;
    }
}
