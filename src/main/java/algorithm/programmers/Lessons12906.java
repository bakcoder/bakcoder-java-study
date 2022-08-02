package algorithm.programmers;

import java.util.Arrays;
public class Lessons12906 {
    public static void main(String[] args) {
        int[] arr = new int[] {4,4,4,3,3};
        System.out.println(Arrays.toString(new Lessons12906().solution(arr)));
    }
    public int[] solution(int []arr) {
        if(arr.length <= 1) return arr;
        int pointer = 0;
        for(int i=1 ; i<arr.length ; i++) {
            if(arr[i] == arr[pointer]) {
                arr[i] = -1;
            } else {
                pointer = i;
            }
        }

        return Arrays.stream(arr).filter(e -> e>=0).toArray();
    }
}


