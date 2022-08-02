package algorithm.programmers;

public class Lessons12916 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(new Lessons12916().otherSolution(s));
    }

    boolean solution(String s) {
        int compareCnt = 0;
        char[] charArr = s.toLowerCase().toCharArray();

        for(char c :charArr) {
            switch (c) {
                case 'y':
                    compareCnt++;
                    break;
                case 'p':
                    compareCnt--;
                    break;
            }
        }
        return compareCnt == 0;
    }

    boolean otherSolution(String s) {
        s = s.toLowerCase();

        return s.chars().filter(e -> 'p' == e).count() == s.chars().filter(e -> 'y' == e).count();
    }
}
