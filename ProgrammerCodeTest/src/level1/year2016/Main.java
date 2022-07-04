package level1.year2016;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		int a = 4;
		int b = 21;
		
		Solution sol = new Solution();
		String answer = sol.solution(a, b);
		System.out.println(answer);
	}

}

class Solution {
	public String solution(int a, int b) {
        String answer = "";
		Date startDate = Date.valueOf("2016-1-1");
		Date endDate = Date.valueOf("2016-"+a+"-"+b); // 매개 변수로 받은 a와 b를 넣어서 날짜를 구한다.
		long period = endDate.getTime() - startDate.getTime(); // 밀리세컨드로 값이 나오는 getTime메서드를 이용해 사이 시간을 뺀다.
		long period2 = period/(24*60*60*1000); // 밀리 세컨드를 일수로 처리하는 과정
		
		int realPeriod = (int)period2;
		
		switch (realPeriod%7) {
		case 0:
			answer = "FRI";
			break;
		case 1:
			answer = "SAT";
			break;
		case 2:
			answer = "SUN";
			break;
		case 3:
			answer = "MON";
			break;
		case 4:
			answer = "TUE";
			break;
		case 5:
			answer = "WED";
			break;
		case 6:
			answer = "THU";
			break;
		default:
			break;
		}
		
		
		return answer;
    }
}