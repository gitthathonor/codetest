package level1.commonValue;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answer = sol.solution(123, 12);
		System.out.println(Arrays.toString(answer));
	}

}

// 최대공약수(a)와 최소공배수(b)의 성질
// m*n = a*b
// 최대공약수 구하는 것 => 유클리드 호제법
// n>m 일 때, n%m을 하게 되어서 0이 아니면 n=m, m=n%m을 해서 다시 식을 계산
// 결과적으로 n%m이 0이 될 때, 그 때의 m은 최대공약수가 된다.


class Solution {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		// 큰 수
		int a = Math.max(n, m);
		// 작은 수
		int b = Math.min(n, m);
		
		// 작은 수(나누는 수)가 0이 될 때까지 반복
		while(b > 0) {
			// 작은 수(나누는 수)의 임시 변수
			int temp = b;
			// 나머지는 나누는 수가 된다.
			b = a%b;
			// 작은 수는 큰 수가 된다.
			a = temp;
		}
		
		//최대 공약수
		answer[0] = a;
		//최소 공배수
		answer[1] = n*m/a;
		
		
		
		return answer;
	}
}