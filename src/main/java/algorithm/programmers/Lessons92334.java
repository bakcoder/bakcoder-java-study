package algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lessons92334 {
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"}; 
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		System.out.println(Arrays.toString(new Lessons92334().solution(id_list, report, k)));
	}
	
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> reportListMap = new HashMap<>();
        Map<String, Integer> reportedUserCountMap = new HashMap<>();
        for(String strReport : report) {
        	if(!reportListMap.containsKey(strReport)) {
        		reportListMap.put(strReport, 0);
        		String reportedId = strReport.split(" ")[1];
        		reportedUserCountMap.put(reportedId, reportedUserCountMap.getOrDefault(reportedId, 0) + 1);
        	}
        }
        
        Iterator<String> key = reportedUserCountMap.keySet().iterator();
        
        while(key.hasNext()) {
        	String reportedId = key.next();
        	if(reportedUserCountMap.get(reportedId) >= k) {
        		for(int j=0 ; j<id_list.length ; j++) {
        			if(reportListMap.containsKey(new StringBuffer(id_list[j]).append(" ").append(reportedId).toString())) {
        				answer[j]++;
        			}
        		}
        	}
        }
        
        return answer;
    }
    
    public int[] otherSolution(String[] id_list, String[] report, int k) {
    	List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
    	
    	HashMap<String, Integer> count = new HashMap<>();
    	for (String s : list) {
    		String target = s.split(" ")[1];
    		count.put(target, count.getOrDefault(target, 0) + 1);
    	}
    	
    	return Arrays.stream(id_list).map(_user -> {
    		final String user = _user;
    		List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
    		return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
    	}).mapToInt(Long::intValue).toArray();
	}
    
    
}

// �Ű� ��� �ޱ� (https://programmers.co.kr/learn/courses/30/lessons/92334)