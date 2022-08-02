package algorithm.programmers;

import java.util.Arrays;

public class Lessons12935 {
    public static void main(String[] args) {
        int[] arr = {10};
        Arrays.toString(new Lessons12935().solution(arr));
    }
    public int[] solution(int[] arr) {
        if(arr.length == 1 ) return new int[] {-1};
        int minTmp = arr[0];

        for(int i=1 ; i<arr.length ; i++)
            if(minTmp >arr[i]) minTmp = arr[i];

        int min = minTmp;
        return Arrays.stream(arr).filter(e -> e != min).toArray();
    }

    public int[] otherSolution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
