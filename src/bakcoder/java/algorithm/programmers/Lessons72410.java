package bakcoder.java.algorithm.programmers;

import java.util.ArrayList;
import java.util.List;

public class Lessons72410 {
	public static void main(String[] args) {
		System.out.println(new Lessons72410().otherSolution2("=.="));
	}

	public String solution(String new_id) {
		char[] newIdCharArr = new_id.toLowerCase().toCharArray();
		
		// a : 49, z : 74
		List<Character> charList = new ArrayList<>();
		int pointer = 0;
		
		for(int i=0 ; i<newIdCharArr.length ; i++) {
			if((newIdCharArr[i] - '0' >= 0 && newIdCharArr[i] - '0'<= 9) ||
			    (newIdCharArr[i]- '0' >= 49 && newIdCharArr[i] - '0'<= 74) || 
				newIdCharArr[i] == '-' ||
				newIdCharArr[i] == '_' ||
				newIdCharArr[i] == '.' ) {
				
				if(newIdCharArr[i] == '.'){
					if(pointer != 0 && charList.get(pointer-1) != '.') {
						charList.add(newIdCharArr[i]);
						pointer++;
					}
				} else {	
					charList.add(newIdCharArr[i]);
					pointer++;
				}
			}
		}
		
		StringBuffer result = new StringBuffer();
		
		for(int i=0 ; i < charList.size() ; i++) {
			result.append(charList.get(i));
		}
		
		if(result.length() > 15) {
			result.delete(15, result.length());
		}

		if("".equals(String.valueOf(result))) {
			result.append("a");
		}
		
		if(result.charAt(result.length()-1) == '.') {
			result.delete(result.length()-1, result.length());
		}
		
		if(result.length() <= 2){
			char endChar = result.charAt(result.length()-1);
			while (result.length() < 3) {
				result.append(endChar);
			}
		}
		
		return result.toString();
	}
	
	public String otherSolution1(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        System.out.println(temp);
        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");
        System.out.println(temp.length());
        if(temp.equals(""))
            temp += "a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
	}
	
	public String otherSolution2(String new_id) {
		String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();


        return s;
	}
	
	private static class KAKAOID {
        private String s;

        KAKAOID(String s) {
            this.s = s;
        }

        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() {
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KAKAOID toSingleDot() {
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        private KAKAOID noStartEndDot() {
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        private KAKAOID noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) {
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", "");
            return this;
        }

        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            s = sBuilder.toString();
            return this;
        }

        private String getResult() {
            return s;
        }
    }
}

// 신규 아이디 추천 https://programmers.co.kr/learn/courses/30/lessons/72410