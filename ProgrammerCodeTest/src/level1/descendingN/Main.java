package level1.descendingN;

import java.util.Arrays;
import java.util.Comparator;

//정수 n은 1이상 8000000000이하인 자연수
//n의 자릿수를 내림차순으로 다시 정렬한 새로운 정수 리턴



public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long n = sol.solution(122414);
		System.out.println(n);
		
	}
}

class Solution {
	public long solution(long n) {
		long answer = 0;
		String str = ""+n;
		String[] array = str.split("");
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		String number = "";
		for(String s:array) {
			number+=s;
		}
		answer = Long.parseLong(number);
		return answer;
	}
}
