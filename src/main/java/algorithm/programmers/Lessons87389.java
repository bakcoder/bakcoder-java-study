package algorithm.programmers;

public class Lessons87389 {
    public int solution(int n) {
        int answer = 0;
        for(int i=2 ; i<n ; i++) {
            if(n % i == 1) return i;
        }
        return answer;
    }
}

//https://programmers.co.kr/learn/courses/30/lessons/87389