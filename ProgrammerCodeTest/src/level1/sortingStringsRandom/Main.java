package level1.sortingStringsRandom;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

	}

}

class Solution {
	public String[] Solution(String[] strings, int n) {
		String[] answer = {};
		char[] charArr = new char[strings.length];
		
		for(int i=0; i<strings.length; i++) {
			charArr[i] = strings[i].charAt(n);
		}
		
		Arrays.sort(charArr);
		
		return answer;
	}
	
//	public boolean CompareString(String a,  String b, int n) {
//		boolean action = true;
//		action = Character.compare(a.charAt(n), b.charAt(n));
//		
//		if() {
//			
//		}
//		
//		return action;
//	}
}
