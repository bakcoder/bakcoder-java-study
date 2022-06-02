package bakcoder.java.algorithm.programmers;

public class Lessons12918 {
    public static void main(String[] args) {
        String s = "a234";
        System.out.println(new Lessons12918().solution(s));
    }
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6) {
            answer = s.matches("[0-9]*");
        }
        return answer;
    }

    public boolean otherSolution(String s) {
        return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
    }
}
