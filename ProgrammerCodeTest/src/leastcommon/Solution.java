package leastcommon;

//int n,m은 1~1000000 의 자연수
public class Solution {
	public int[] solution(int n, int m) {
		 	//매개변수로 입력된 두수 n,m의 최대공약수와 최소공배수를 구해야 한다.
		 	//최대 공약수나 최소공배수 모두 두 수 주에서 한 수가 그 값이 될 수 있다.
		 	//최대 공약수의 조건 : 두 수가 동시에 약수로 만족하는 최댓값
		 	//최소 공배수의 조건 : 두 수가 동시에 배수로 만족하는 최솟값
		 	int maxDivideCommon = 0; //최대공약수
		 	int minMultiplyCommon = 0; //최소공배수
		 	
		 	//둘이 나누어 떨어질 때는 서로가 최대공약수랑 최소공배수로 나누어진다.
		 	try {
		 	if(n%m==0) {
		 		maxDivideCommon = m;
		 		minMultiplyCommon = n;
		 	} else if(m%n==0) {
		 		maxDivideCommon = n;
		 		minMultiplyCommon = m;
		 	} else { //나누어 떨어지지 않을때
		 		//최대공약수
		 		//약수가 되는 조건을 살펴보자
		 		//두 수가 나누어 떨어지면, 둘 중에 작은 수가 최대공약수
		 		//두 수가 나누어 떨어지지 않는다면,
		 		// 1) 짝수끼리면 최대공약수는 2
		 		// 2) 홀수끼리면 최대공약수는 1
		 		// 3) 홀짝이 다르다면, 1
		 		
		 		//최소공배수
		 		//두 수가 나누어 떨어지면, 둘 중에 큰 수가 최소공배수
		 		//두 수가 나누어 떨어지지 않는다면,
		 		// 1) 짝수끼리면 최소공배수는 두 수를 곱한 것/2
		 		// 2) 홀수끼리면 최소공배수는 두 수를 곱한 것
		 		// 3) 홀짝이 다르면 최소공배수는 두 수를 곱한 것
			 	
		 		if(n%2==0 && m%2==0) {
		 				maxDivideCommon = 2;
		 				minMultiplyCommon = (n*m)/2;
		 		} else if(n%2!=0 && m%2!=0) {
		 			maxDivideCommon = 1;
		 			minMultiplyCommon = n*m;
		 		} else {
		 			maxDivideCommon = 1;
		 			minMultiplyCommon = n*m;
		 		}
		 	}
		 	
		 	} catch(Exception e) {
		 		e.printStackTrace();
		 	}
	        int[] answer = {maxDivideCommon, minMultiplyCommon};
	        return answer;
	    }

}
