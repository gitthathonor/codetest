package low.sec03;

public class Solution {
	// x는 양의 정수
	// 하샤드 수는 x의 자릿수의 합이 x로 나누어 떨어지는 수 == 나머지가 0인 것
	// x는 1이상 10000이하
	// 자릿수는 1~5까지 나옴
	// 1~9 : 전부 하샤드 수
	// 10~99
	// 100~999
	// 1000~9999
	// 10000
	// 자릿수의 합은 1~36 사이의 범위
	

	public boolean solution(int x) {
		boolean answer = true;
		int num = x;
		int sum = 0;
		
		while(num != 0) {
			sum += num%10;
			num = num/10;
		}
		
		if(x%sum != 0) {
			answer = false;
		}

		return answer;
	}
}
