package averagetest;

class Solution {
	public double solution(int[] arr) {
		int sumArr = 0;
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			sumArr += arr[i];
		}
		answer = sumArr / arr.length;
		return answer;
		
		
	}
	
	public static void main(String[] args) {
		Solution sol1 = new Solution();
		//sol1.solution();
	}
}
