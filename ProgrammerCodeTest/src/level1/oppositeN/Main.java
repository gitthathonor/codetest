package level1.oppositeN;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long[] answer = sol.solution(9876543215L);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution {
	public long[] solution(long n) {
		String longStr = String.valueOf(n); 
		int i = 0;
		long[] answer = new long[longStr.length()];
		while(n/10 != 0) {
			answer[i] = n%10;
			i += 1;
			n = n/10;
		}
		
		if(n/10 == 0) {
			answer[i] = n%10;
		}
		return answer;
	}
}