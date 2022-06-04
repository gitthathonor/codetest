package level1.reportResultKakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		int[] answer = sol.solution(id_list, report, k);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        //한 사람이 같은 사람에게 여러 번 신고 가능, 그렇지만 이 경우 1번 신고당한 것으로 처리
        //report배열의 각 원소의 값이 같은 경우 1번으로 처리
        //k번 이상 신고당한 유저가 정지당했다는 사실을 그 유저를 신고한 유저들에게 전부 메일이 전달
        int[] answer = new int[id_list.length];
        
        // 1. 중복 제거
        HashSet<String> reportSet = new HashSet<String>();
        for(String rep : report)
        	reportSet.add(rep);
        
        // 2. report에서 각 사람이 신고당한 횟수를 countHash으로 정의하기
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for(String rep : reportSet) {
        	int blankIdx = rep.indexOf(" ");
        	String reporter = rep.substring(0, blankIdx);
        	String reportee = rep.substring(blankIdx + 1);
        	
        	ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
        	if(reporterList == null) reporterList = new ArrayList<>();
        	
        	reporterList.add(reporter);
        	notifyListHash.put(reportee, reporterList);
        }
        
        // 3. notifyListHash를 기반으로 reportHash 만들기
        HashMap<String, Integer> reporterHash = new HashMap<>();
        for(ArrayList<String> notifyList : notifyListHash.values())
        	if(notifyList.size() >= k)
        		for(String reporter : notifyList) {
        			reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);	
        		}
        
        // 4. reporterHash 정보를 answer에 옮겨담기
        for(int i=0; i<id_list.length; i++) {
        	answer[i] = reporterHash.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}