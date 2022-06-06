package level1.delMinimum;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {4,3,3,1};
		
		int[]answer = sol.solution(arr);
		
		System.out.println(Arrays.toString(answer));
	}

}

class Solution {
	
	protected int arrLengthCheck(int[] arr) {
		int arrLength = 0;
		if(arr.length == 1) {
			arrLength = 2;
		} else {
			arrLength = arr.length;
		}
		return arrLength;
	}
	
	
	
	
	
	public int[] solution(int[] arr) {
		int arrLength = arrLengthCheck(arr);
		int[] answer = new int[arrLength-1];
		
		for(int i=0; i<arr.length; i++) {
			
		}
		
		
		
		return answer;
	}
	
	
}