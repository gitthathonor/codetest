package level1.kNum;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,209,33,5,9,2,4,156};
		int[][] commands = {{2,7,5},{3,6,1},{1,6,3}};
		Solution sol = new Solution();
		int[] answer = sol.solution(array, commands);
		System.out.println(Arrays.toString(answer));
		
	}
}
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
        	int[] array2 = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	Arrays.sort(array2);
        	answer[i] = array2[commands[i][2]-1];
        }
        return answer;
    }
}