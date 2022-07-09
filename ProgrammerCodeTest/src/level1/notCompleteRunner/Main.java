package level1.notCompleteRunner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String[] part = {"leo" , "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		Solution sol = new Solution();
		String answer = sol.solution(part, comp);
		System.out.println(answer);
	}

}

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}
		for(String player : completion) {
			map.put(player, map.get(player) - 1);
		}
		
			Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
			
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			if(entry.getValue() != 0) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;
	}
}
