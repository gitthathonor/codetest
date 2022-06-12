package level1.findingPrimeNumber;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int a = sol.solution(1000000);
		System.out.println(a);
	}

}

// 소수의 정의 : 1과 자기 자신만으로 나누어 떨어지는 수
// 소인수분해 : 모든 자연수는 소수의 곱으로 표현할 수 있다.
// 유클리드의 소수 증명 : 유한한 소수들의 곱으로 만든 수에다가 1을 더하면
// 유한한 어떤 소수로 나눠도 1이 남는다.
// 그 수가 소수면 그것으로 최대 소수 이상의 소수가 있다는 점이 증명
// 그 수가 소수가 아니라면, 소인수분해 법칙에 의해서 역시 또다른 소수가 있다는 것이 증명
// 소수인지 아닌지 확인하는 방법 : 약수의 갯수가 2개인지 아닌지 확인
// 또는 그 이전의 소수들로 나누어 떨어지는지 아닌지 확인

class Solution {
	public int solution(int n) {
		int answer = 0;
		
		//소수들을 담을 배열을 만든다.
		//List<Integer> list = new ArrayList<Integer>();
		//int[] primeArr = new int[n-1];
		
//		for(int i=0; i<n-1; i++) {
//			primeArr[i] = i+2;
//			System.out.println(primeArr[i]); 
//		}
		
		// 1과 n 사이의 숫자를 구한다.
		// 각각의 숫자가 소수인지 아닌지 판별 - 맞으면 answer가 1 증가
		
//		for(int i=2; i<=n; i++) {
//			for(int j=2; j<=i; j++) {
//				if(i != j && i%j == 0) {
//					break;
//				} else if(i == j && i%j == 0) {
//					answer += 1;
//					break;
//				}
//			}
//			
//		}
		
		for(int i=2; i<=n; i++) {
			
		}
		
		return answer;
	}
}