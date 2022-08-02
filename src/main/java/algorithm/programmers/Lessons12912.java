package algorithm.programmers;

public class Lessons12912 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        System.out.println(new Lessons12912().otherSolution(a,b));
    }
    public long solution(int a, int b) {
        long answer = 0;
        for(int i=Math.min(a, b) ; i<=Math.max(a, b) ; i++)
            answer += i;
        return answer;
    }

    public long otherSolution(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return max*(max+1)/2 - min*(min-1)/2;
    }
}
