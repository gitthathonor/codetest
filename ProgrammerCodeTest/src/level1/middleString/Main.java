package level1.middleString;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "abcdefg";
		String answer = sol.solution(s);
		System.out.println(answer);
	}

}

class Solution {
	public String solution(String s) {
		String answer = "";
//		String[] arr = new String[s.length()];
//		double length = s.length();
//		for(int i=0; i<s.length(); i++) {
//			arr[i] = String.valueOf(s.charAt(i));
//			System.out.println(arr[i]);
//		}
//		
//		if(length%2 != 0) {
//			answer = 
//		} else {
//			
//		}
		if(s.length()%2 != 0) {
			answer = s.substring(s.length()/2, s.length()/2+1);
		} else {
			answer = s.substring(s.length()/2-1,s.length()/2+1);
		}
		
		return answer;
	}
}