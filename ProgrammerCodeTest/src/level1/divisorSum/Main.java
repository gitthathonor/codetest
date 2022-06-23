package level1.divisorSum;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int answer = sol.solution(200);
		System.out.println(answer);
	}

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
				// n>0 이면, answer를 1로 초기화 해두고, 2부터 n까지 나누어 떨어지는 수들을 더했다.
        if(n>0) {
            answer = 1;
            for(int i=2; i<=n; i++) {
                if(n%i == 0) {
                    answer += i;
                } else {
                    continue;
                }
            }
        }
        
				// n == 0 이면 answer도 0이다.
        if(n == 0) {
           answer = 0;
        }
        
        return answer;
    }
}