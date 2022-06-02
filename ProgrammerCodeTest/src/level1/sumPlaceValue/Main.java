package level1.sumPlaceValue;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int answer = sol.solution(45222334);
		System.out.println(answer);
		
	}

	}
	
	class Solution {
	    public int solution(int n) {
	    	int answer = 0;
	        while(n/10 != 0) {
	            answer += n%10;
	            n = n/10;    
	        } //10으로 나눠서 나머지는 더하고, 몫으로 새로운 n 대입
	        answer += n;
	        return answer;
	    }
	
}
