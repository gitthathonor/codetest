package level1.sqrtInteger;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		long answer = sol.solution(4);
		System.out.println(answer);
	}

}

// n은 1이상, 50,000,000,000,000 이하인 양의 정수입니다.
// n이 양의 정수 x의 제곱이라면, answer는 x+1의 제곱을 리턴
// n이 양의 정수 x의 제곱이 아니라면, answer는 -1을 리턴

class Solution {
	public long solution(long n) {
		long answer = 0;
		
		// 일단 n이 양의 정수 x의 제곱인지 아닌지를 판별
		// 제곱근이 정수가 아니라면 소수점이 생김
		// 제곱근이 정해졌을 때, 소수점 버림의 값이 같으면 양의 정수의 제곱근
		// 제곱근과 버림값이 다를 경우에는 -1
		
		double i = Math.sqrt(n);
		double j = Math.floor(i);
		if(i == j) {
			long a = (long)i;
			answer = (a+1)*(a+1);
		} else {
			answer = -1;
		}
		
		
		return answer;
	}
}