package bakcoder.java.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(new PascalTriangle().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0 ; i<numRows ; i++) {
            List<Integer> subResult  = new ArrayList<>();
            for(int j=0 ; j<=i ; j++) {
                if(j == 0 || j == i) subResult.add(1);
                else {
                    subResult.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(subResult);
        }

        return result;
    }
}


//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

//Example 1:
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

//Example 2:
//Input: numRows = 1
//Output: [[1]]

// constraints
//1 <= numRows <= 30