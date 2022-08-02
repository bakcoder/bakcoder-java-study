package algorithm.programmers;

public class Lessons77884 {
    public static void main(String[] args) {
        System.out.println(new Lessons77884().otherSolution(13, 17));
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left ; i <= right ; i++) {
            int modCnt = 0;
            for(int j=1 ; j <= i ; j ++) {
                if(i % j == 0) modCnt++;
            }
            if(modCnt % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }

    public int otherSolution(int left, int right) {
        int answer = 0;
        for(int i=left ; i<=right ; i++) {
            if(i % Math.sqrt(i) == 0) answer -= i;
            else answer += i;
        }
        return answer;
    }

}

//https://programmers.co.kr/learn/courses/30/lessons/77884
