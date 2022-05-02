package bakcoder.java.algorithm.programmers;

import java.util.Arrays;

public class Lessons12977 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        System.out.println(new Lessons12977().solution(nums));
    }
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0 ; i<nums.length ; i++) {
            for(int j=i+1 ; j<nums.length ; j++) {
                for(int k=j+1 ; k<nums.length ; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int modCnt = 0;
                    for(int a=2 ; a <= sum ; a++) {
                        if(sum % a ==0) {
                            if(a != sum) break;
                            else modCnt++;
                        }
                    }
                    if(modCnt == 1) {
                        modCnt = 0;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

}

//https://programmers.co.kr/learn/courses/30/lessons/12977

//[1,2,3,4]
//1, 2
//1, 3
//1, 4
//2, 3