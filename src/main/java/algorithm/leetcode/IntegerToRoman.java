package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println("integerToRoman result = " + integerToRoman.intToRoman(58));

    }

    public String intToRoman(int num) {
        Map<Integer, String> romansMap = initRomanMap();
        StringBuffer sb = new StringBuffer();

        while(num > 0) {
            int comparator = getComparator(num);
            int quotient = num / comparator;
            if(quotient >= 5 && quotient <= 8) {
                quotient = 5;
            }

            if(romansMap.containsKey(quotient * comparator)) {
                sb.append(romansMap.get(quotient * comparator));
                num -= (quotient * comparator);
            } else {
                sb.append(romansMap.get(comparator));
                num -= comparator;
            }
        }

        return sb.toString();
    }

    public int getComparator(int num) {
        if(num >= 1000) {
            return 1000;
        } else if(num >= 100) {
            return 100;
        } else if(num >= 10) {
            return 10;
        } else {
            return 1;
        }
    }

    public Map<Integer, String> initRomanMap() {
        Map<Integer, String> romansMap = new HashMap<>();
        romansMap.put(1, "I");
        romansMap.put(4, "IV");
        romansMap.put(5, "V");
        romansMap.put(9, "IX");
        romansMap.put(10, "X");
        romansMap.put(40, "XL");
        romansMap.put(50, "L");
        romansMap.put(90, "XC");
        romansMap.put(100, "C");
        romansMap.put(400, "CD");
        romansMap.put(500, "D");
        romansMap.put(900, "CM");
        romansMap.put(1000, "M");
        return romansMap;
    }
 }


/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

ex1)
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.

ex2)
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

ex3)
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

constratints)
1 <= num <= 3999


*/