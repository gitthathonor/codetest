package low.sec01;

import java.util.ArrayList;

public class Between {

	public static void main(String[] args) {

		Solution s = new Solution();
		long[] a = s.solution(12,5);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}

class Solution {
	
	public long[] solution(int x, int n) {
		long[] answer = {};
		
		if(( 1<=n && n<=1000 ) && (- 10000000<=x && x<=10000000 )) {
			answer = new long[n];
			for(int i=0; i<n; i++) {
				answer[i] = (i + 1) * x;
			}
		}
		
		return answer;
	}
}
