package algorithm.problemSolvingStrategies.bruteForce;

// recursion을 이용하여 n까지 자연수들의 합 구하기
public class RecursiveSum {
    public static void main(String[] args) {
        RecursiveSum rs = new RecursiveSum();
        System.out.println(rs.recursiveSum(3));
    }

    public int recursiveSum(int num) {
        if(num == 1) return 1;
        else {
            return num + recursiveSum(--num);
        }
    }

}

