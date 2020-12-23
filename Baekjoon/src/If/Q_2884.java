package If;

import java.util.Scanner;

public class Q_2884 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt()-45;

		if(b<0) {
			a-=1;
			b+=60;
			
			if(a<0) {
				a+=24;
			}
		}
		System.out.println(a+" "+b);
		

	}

}
