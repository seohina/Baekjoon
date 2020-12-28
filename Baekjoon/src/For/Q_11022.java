package For;

import java.util.Scanner;

public class Q_11022 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();

		for(int j=1; j<=i; j++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #"+j+": "+a+" + "+b+" = "+(a+b));
		}
	}

}
