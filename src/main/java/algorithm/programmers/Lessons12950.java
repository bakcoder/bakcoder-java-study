package algorithm.programmers;

public class Lessons12950 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        new Lessons12950().solution(arr1, arr2);
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length]; // anwer = arr1;로 해도 상관은 없음
        for(int i=0 ; i<arr1.length ; i++) {
            for(int j=0 ; j<arr1[i].length ; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

//https://programmers.co.kr/learn/courses/30/lessons/12950
