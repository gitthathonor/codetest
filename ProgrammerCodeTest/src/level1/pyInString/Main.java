package level1.pyInString;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String a = "Pyy";
		boolean answer = sol.solution(a);
		System.out.println(answer);
		 
	}

}

class Solution {
	boolean solution(String s) {
		boolean answer = false;
        int pNum = 0; //p의 갯수가 담길 변수
        int yNum = 0; //y의 갯수가 담길 변수

        for(int i=0; i<s.length(); i++) {
        	if((s.charAt(i)+"").equals("p")  || (s.charAt(i)+"").equals("P")) {
        		pNum += 1;
        	} else if((s.charAt(i)+"").equals("y") || (s.charAt(i)+"").equals("Y")) {
        		yNum += 1;
        	}
        }
        
        if(pNum == yNum) {
        	answer = true;
        }
    
        return answer;
    }
}
