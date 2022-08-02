package algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        System.out.println(new PascalTriangle2().otherSolution(1));
    }
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> allList = new ArrayList<>();
        for(int i=0 ; i<=rowIndex ; i++) {
            List<Integer> subList = new ArrayList<>();
            for(int j=0 ; j<=i ; j++) {
                if(j == 0 || j == i) subList.add(1);
                else {
                    subList.add(allList.get(i-1).get(j-1) + allList.get(i-1).get(j));
                }
            }
            allList.add(subList);
        }
        return allList.get(rowIndex);
    }

    public List<Integer> otherSolution(int rowIndex) {
        List<Integer> ret = new ArrayList<>();
        ret.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                int tmp = ret.get(j - 1) + ret.get(j);
                ret.set(j, tmp);
            }
            ret.add(1);
        }
        return ret;
    }
}

//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

//Example 1:
//Input: rowIndex = 3
//Output: [1,3,3,1]

//Example 2:
//Input: rowIndex = 0
//Output: [1]

//Example 3:
//Input: rowIndex = 1
//Output: [1,1]

//constraints
//0 <= rowIndex <= 33