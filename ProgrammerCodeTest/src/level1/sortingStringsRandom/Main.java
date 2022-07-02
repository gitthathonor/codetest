package level1.sortingStringsRandom;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] strings = {"sun", "bed", "car"};
		String[] answer = sol.solution(strings, 1);
		for(String a : answer) {
			System.out.println(a);
		}
	}	

}

class Solution {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		
		Arrays.sort(strings);
		
		for(int i = 0; i<strings.length; i++) {
			strings[i] = strings[i].substring(n, n+1) + strings[i];
		}
		
		Arrays.sort(strings);
		
		for(int j = 0; j<strings.length; j++) {
			answer[j] = strings[j].substring(1);
		}
		
		return answer;
	}
	
}
