package low.sec02;

public class Main {
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println((int) Math.ceil(Math.random() * 10));
		
		int m = (int)Math.ceil(Math.random() * 10);
		int n = (int)Math.ceil(Math.random() * 10);
		
		
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*10);
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = (int)(Math.random()*10);
			}
		}
		
		
		
		Solution sol = new Solution();
		int[][] c = sol.solution(a, b);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.println("c[" + i + "][" + j + "] : " + c[i][j]);
			}
		}
	}
}
