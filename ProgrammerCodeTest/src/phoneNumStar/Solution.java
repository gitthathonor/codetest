package phoneNumStar;

public class Solution {
	
	
	public void solution(String phoneNum) {
		int a = phoneNum.length();
		String[] phoneArr = new String[a];
		for(int i=0; i<phoneArr.length-4; i++) {
			System.out.print("*");
		}
		for(int j=phoneArr.length-4; j<phoneArr.length; j++) {
			System.out.print(phoneNum.charAt(j));
		}
		
	
	}
}


