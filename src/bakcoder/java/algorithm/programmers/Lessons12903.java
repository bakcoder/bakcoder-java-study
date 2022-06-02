package bakcoder.java.algorithm.programmers;

public class Lessons12903 {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(new Lessons12903().solution(s));
    }
    public String solution(String s) {
        int len = s.length();
        return len % 2 == 0 ? s.substring(len/2-1, len/2+1) : s.substring(len/2,len/2+1);
    }

    public String otherSolution(String word) {
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
}