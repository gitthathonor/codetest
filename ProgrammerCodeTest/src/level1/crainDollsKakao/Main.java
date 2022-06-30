package level1.crainDollsKakao;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = sol.solution(board, moves);
		System.out.println(answer);
	}
}

// 예시 5*5
// 초기 단계 [0,0,0,0,0],[0,0,1,0,2],[0,3,4,0,1],[5,3,5,5,3],[2,4,1,2,1]
// moves [1,5,3,5,1,2,1,4]
// result 4
// moves 배열의 각 원소들의 값은 1이상이며, board 배열의 가로 크기 이하인 자연수 입니다.
// 5*5~~30*30

// board의 원소의 값이 0이면 지나쳐서 내려간다.
// 같은 원소는 같은 인형이므로, 넣는 칸에 들어오면 result += 2;
// 크레인이 인형을 꺼내고 나면 그 인형이 있던 배열의 원소는 0으로 바뀐다.
// 후입선출 : Stack 구조를 통해서 풀어야 하는가?


class Solution {
    public int solution(int[][] board, int[] moves) {
//         int answer = 0;
// 		List<Integer> list = new ArrayList<Integer>();
// 		int leng = 0; // 인형을 뽑고 난 이후 넣는 바구니의 인덱스
		
// 		for(int i=0; i<moves.length; i++) {
// 			for(int j=0; j<board.length; j++) {
// 				if(board[j][moves[i]] == 0) {
// 					continue;
// 				} else {
// 					list.add(board[j][moves[i]]);
// 					leng++;
// 					if(list.size() > 1) {
// 						 int a = (int)list.get(leng);
// 						 int b = (int)list.get(leng-1);
// 						 if(a == b) {
// 							 list.remove(leng);
// 							 list.remove(leng-1);
// 							 answer += 2;
// 							 leng -= 2;
// 						 }
// 					}
// 				}
// 			}
			
// 		}
		
// 		return answer;
        
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>(); // 인형을 담을 바구니를 하나 만든다.(LIFO 방식의 Stack으로 구현)
        stack.push(0);


        for(int move : moves) {
            for(int j=0; j<board.length; j++) {
                if(board[j][move-1] != 0) { // board[j][move-1]이 0이 아니라면
                   if(stack.peek() == board[j][move-1]) { // stack의 가장 최신 인형이 크레인으로 뽑은 인형과 같다면
                        stack.pop(); // stack 에서 제거 후
                        answer += 2; // answer에 2를 더한다.
                   } else {
                        stack.push(board[j][move-1]); // 같지 않다면, 그냥 stack에다가 인형을 넣는다.
                   }
                   board[j][move-1] = 0; // 뽑은 자리는 인형이 없으므로 0으로 초기화 시켜준다.
                   break; // 반복문 탈출 moves의 다음 배열 값으로 넘어간다. 이중for문에서 break를 안쪽에서 하면
                            // 안쪽 반복만 탈출하고 다시 감싸고 있는 반복문을 실행한다.
                }
            }
        }
    return answer;
    }
}