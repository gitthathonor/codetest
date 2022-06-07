package level1.collatz;

// 1-1. 입력된 수가 짝수라면 2로 나눕니다. 
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
// 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.


public class Main {
	public static void main(String[] args) {
		
	}
}


class Solution {
	public int solution(long num) { //long으로 바꿔줘야 하는 이유는 중간에 짝수일 때, int의 범위를 넘어가기 때문
		int answer = 0;
		
		
		while(num != 1) {
			if(num%2 == 0) {
	            num /= 2;
	        } else {
	        	num = num * 3 + 1;
	        }
			answer++;
			if(answer == 500) {
				answer = -1;
				break;
			}
		}
		 
		return answer;
	}
}