package algorithm.programmers;

public class Lessons12925 {
    public static void main(String[] args) {
        String s = "100";
        System.out.println(new Lessons12925().solution2(s));
    }
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public int solution2(String s) {
        int sign = s.contains("-") ? -1 : 1;
        int startIdx = sign < 0 ? 1 : s.contains("+") ? 1 : 0;
        int answer = 0;
        for(int i= startIdx ; i<s.length() ; i++) {
            answer *= 10;
            answer += s.charAt(i) - '0';
        }
        return answer * sign;
    }
}
