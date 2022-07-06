package level1.hateSameNum;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	}

}

// arr = {1,1,5,3,2,2,2,2,3,4,4}
// answer = {1,5,3,2,3,4}

// 요소 기준으로 다음 요소 비교시 같으면 인덱스 증가 시켜서 비교 아니면, stop
// 다음 요소가 다른 것이 나오면 반복문 빠져 나오고 배열을 한 칸 올린다.

class Solution {
	public int[] solution(int []arr) {
        // answer의 배열 길이를 먼저 구하자
		int length = 1;
		for(int i=1; i<arr.length; i++) {
			
			if(i>0) {
				if(arr[i] != arr[i-1]) {
					length += 1;
				} 
			}
			
		}
		System.out.println(length);
        
        
        
       int[] answer = new int[length];
		int idx = 1;
		answer[0] = arr[0];
		
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				continue;
			} else {
				// answer에다가 값 넣기
				answer[idx] = arr[i];
				idx++;
			}
		}
		
		return answer;
       
    }
}
