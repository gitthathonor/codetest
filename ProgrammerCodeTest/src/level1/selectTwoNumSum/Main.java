package level1.selectTwoNumSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numbers = {2,1,4,3,1};
		int[] answer = sol.solution(numbers);
		System.out.println(Arrays.toString(answer));
		
		int[] numbers2 = {5,0,2,7};
		answer = sol.solution(numbers2);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution {
	public int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}

		int[] answer = new int[set.size()];
		int idx = 0; // answer의 인덱스 값

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			answer[idx] = (int) iterator.next();
			idx++;
		}

		Arrays.sort(answer);

		return answer;
	}
}