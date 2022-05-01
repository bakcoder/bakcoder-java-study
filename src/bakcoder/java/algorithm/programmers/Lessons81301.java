package bakcoder.java.algorithm.programmers;

import java.util.HashMap;
import java.util.Iterator;

public class Lessons81301 {
    public static void main(String[] args) {
        System.out.println(new Lessons81301().solution("one4seveneight"));
    }

    public int solution(String s) {
        int answer = 0;
        HashMap<String ,Integer> numStringMap = initMap();
        Iterator iter = numStringMap.keySet().iterator();

        while(iter.hasNext()) {
            String numString = String.valueOf(iter.next());
            s = s.replaceAll(numString, String.valueOf(numStringMap.get(numString)));
        }

        answer = Integer.parseInt(s);
        return answer;
    }

    public int otherSolution(String s) {
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0 ; i<alphabets.length ; i++) {
            s = s.replaceAll(alphabets[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }


    public HashMap<String, Integer> initMap() {
        HashMap<String, Integer> resultMap = new HashMap<>();

        resultMap.put("zero", 0);
        resultMap.put("one", 1);
        resultMap.put("two", 2);
        resultMap.put("three", 3);
        resultMap.put("four", 4);
        resultMap.put("five", 5);
        resultMap.put("six", 6);
        resultMap.put("seven", 7);
        resultMap.put("eight", 8);
        resultMap.put("nine", 9);

        return resultMap;
    }
}

// https://programmers.co.kr/learn/courses/30/lessons/81301?language=java

//0	zero
//1	one
//2	two
//3	three
//4	four
//5	five
//6	six
//7	seven
//8	eight
//9	nine