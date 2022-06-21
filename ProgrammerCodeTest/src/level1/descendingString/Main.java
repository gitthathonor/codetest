package level1.descendingString;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char a = 'a';
		char b = 'b';
		System.out.println(a>b);
		Solution sol = new Solution();
		String answer = sol.solution("aBdohJOKddsv");
		System.out.println(answer);
	}
}

class Solution {
	public String solution(String s) {
		String answer = "";
		//char[] arr = new char[s.length()];
		
//		for(int i=0; i<s.length(); i++) {
////			arr[i] = s.charAt(i);
////			while(arr[i]>arr[i-1] && arr[i] != arr[0]) {
////				arr[i-1] = arr[i];
////				arr[i] = arr[i-1];
////			}
//			answer += s.charAt(i);
//			if(s.charAt(i)>s.charAt(i-1) && s.charAt(i) != s.charAt(0)) {
//				
//			}
//		}
//		int i = 0;
//		char a = s.charAt(i);
//		char b = s.charAt(i+1);
//		while(a<b) {
//			
//			i++;
//			if(i == s.length()-1) {
//				break;
//			}
//		}
		char[] arr = new char[s.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i >= 0; i--) {
			answer += arr[i];
		}
		
		return answer;
	}
}