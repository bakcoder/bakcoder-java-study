package algorithm.programmers;

public class Lessons67256 {

    public static void main(String[] args) {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(new Lessons67256().solution(numbers, hand));
    }
    public String solution(int[] numbers, String hand) {
        StringBuffer answer = new StringBuffer();
        int pointerL = 9;
        int pointerR = 11;

        for(int i=0 ; i<numbers.length ; i++) {
            if(numbers[i] == 0) numbers[i] = 11;
            int pointerCur = numbers[i]-1;
            switch (numbers[i] % 3) {
                case 0:
                    answer.append("R");
                    pointerR = pointerCur;
                    break;
                case 1:
                    answer.append("L");
                    pointerL = pointerCur;
                    break;
                case 2: {
                    if((Math.abs(pointerCur/3 - pointerL/3) + Math.abs(pointerCur%3 - pointerL%3)) <
                            (Math.abs(pointerCur/3 - pointerR/3) + Math.abs(pointerCur%3 - pointerR%3))) {
                        answer.append("L");
                        pointerL = pointerCur;
                    } else if((Math.abs(pointerCur/3 - pointerL/3) + Math.abs(pointerCur%3 - pointerL%3)) >
                            (Math.abs(pointerCur/3 - pointerR/3) + Math.abs(pointerCur%3 - pointerR%3))) {
                        answer.append("R");
                        pointerR = pointerCur;
                    } else {
                        if(hand.equals("left")) {
                            answer.append("L");
                            pointerL = pointerCur;
                        } else if(hand.equals("right")) {
                            answer.append("R");
                            pointerR = pointerCur;
                        }
                    }
                }
            }
        }
        return answer.toString();
    }
}

//7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2
//123
//456
//789
