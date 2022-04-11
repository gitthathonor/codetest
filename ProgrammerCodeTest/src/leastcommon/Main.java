package leastcommon;

public class Main {
	public static void main(String[] args) {
		Solution sol1 = new Solution();
		int[] arr = sol1.solution(12, 256242);
		for(int i=0; i<arr.length-1; i++) {
			System.out.println("{" +arr[i]+","+arr[i+1]+"}");
		}
	}
}
