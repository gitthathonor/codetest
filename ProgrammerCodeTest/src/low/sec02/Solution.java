package low.sec02;

public class Solution {
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		
		int i = 0;
	    int[][] answer = new int[arr1.length][arr1[i].length];
        for(i=0; i<arr1.length; i++) {
			for(int k=0; k<arr1[i].length; k++) {
				answer[i][k] = arr1[i][k] + arr2[i][k];
			}
		}

		return answer;
	}
}
