package ex1;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		int[] array = {1,3,6,7,4,12};
		int[][] commands = {{3,3,2},{1,5,3},{5,6,1}};
		
		
		Solution sol = new Solution(); 
		int[] arrEx = sol.solution(array, commands);
		
		System.out.println(Arrays.toString(arrEx));
	}
}

	//array의 길이는 1이상 100이하
	//array의 각 원소는 1이상 100이하
	//commands의 길이는 1이상 50이하
	//commands의 각 원소는 길이가 3입니다.
	
class Solution {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        for(int i=0; i<commands.length; i++) {
        	int a = commands[i][0];
        	int b = commands[i][1];
        	int c = commands[i][2];
        	
        	System.out.println(a);
        	System.out.println(b);
        	System.out.println(c);
        	
        	
            int[] arr = Arrays.copyOfRange(array,a,b+1);
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            
            answer[i] = arr[c-1];
            
            
            
        }
        
        return answer;
    }
}