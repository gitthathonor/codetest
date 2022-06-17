package level1.findingPrimeNumber;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int a = sol.solution(120);
		System.out.println(a);
	}

}

// 소수의 정의 : 1과 자기 자신만으로 나누어 떨어지는 수
// 소인수분해 : 모든 자연수는 소수의 곱으로 표현할 수 있다.
// 유클리드의 소수 증명 : 유한한 소수들의 곱으로 만든 수에다가 1을 더하면
// 유한한 어떤 소수로 나눠도 1이 남는다.
// 그 수가 소수면 그것으로 최대 소수 이상의 소수가 있다는 점이 증명
// 그 수가 소수가 아니라면, 소인수분해 법칙에 의해서 역시 또다른 소수가 있다는 것이 증명
// 소수인지 아닌지 확인하는 방법 : 약수의 갯수가 2개인지 아닌지 확인
// 또는 그 이전의 소수들로 나누어 떨어지는지 아닌지 확인


//확인된 방법으로는 3가지
//1. 2~n까지의 수를 배열로 만들어서 다시 2~n까지 각각의 수를 나누어서 약수가 1과 본인인 수들을 계산 (but, 시간이 많이 걸린다)
//2. 자연수 n이 소수이기 위한 필요 충분 조건은 n이 n의 제곱근보다 작은 어떤 소수로도 나눠지지 않는다. 수를 수로 나누어 떨어진다면,
//그때의 몫은 반드시 그 수의 제곱근보다 작시 때문이다.
//첫 번째 방법에서 범위를 n이 아닌 sqrt(n)으로 설정하면 된다.
//3. 에라토스테네스의 체
//2~n까지의 모든 수 나열
//2는 소수, 2의 배수들은 소수가 아니므로 n까지의 자기 자신을 제외한 2의 배수를 모두 지운다.
//3은 소수, 똑같이 3의 배수를 모두 지워준다.
//n의 제곱근 전의 최대 소수까지 반복해준다.


class Solution {
	public int solution(int n) {
		
		
		//소수들을 담을 배열을 만든다.
		//List<Integer> list = new ArrayList<Integer>();
		//int[] primeArr = new int[n-1];
		
//		for(int i=0; i<n-1; i++) {
//			primeArr[i] = i+2;
//			System.out.println(primeArr[i]); 
//		}
		
		// 1과 n 사이의 숫자를 구한다.
		// 각각의 숫자가 소수인지 아닌지 판별 - 맞으면 answer가 1 증가
		
//		for(int i=2; i<=n; i++) {
//			for(int j=2; j<=i; j++) {
//				if(i != j && i%j == 0) {
//					break;
//				} else if(i == j && i%j == 0) {
//					answer += 1;
//					break;
//				}
//			}
//			
//		}
		
		int answer = 0;
        
        int[] number = new int[n+1];
        
        //2부터 n까지의 수를 배열에 넣는다.
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }
        
        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for(int i=2; i<=n; i++) {
            if(number[i]==0) continue;
            
            for(int j= 2*i; j<=n; j += i) {
                number[j] = 0;
            }
        }
        
        //배열에서 0이 아닌 것들의 개수를 세준다.
        for(int i=0; i<number.length; i++) {
            if(number[i]!=0) {
                answer++;
            }
        }
        
        return answer;
		
		
		
		
		
	}
}