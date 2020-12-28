package While;

import java.util.Scanner;

public class Q_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		int cnt=0;
		int cp = n;
		
		while(true) {
			/* 1. 먼저 2+6은 필수로 시작해야돼
			   2. 그 다음부터는 알아서 (오른쪽 수*10)+(결과값%10)을 연산해야돼
			   3. 계속 연산하다가 처음 입력한 값이랑 같다면 종료해야돼*/
			
			n = ((n%10)*10)+(((n%10)+(n/10))%10);
			cnt++;
			if(cp==n) {
				break;
			}
			
		}
		System.out.println(cnt);
	}

}