package For;

import java.util.Scanner;

public class Q_10950 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		for(int j=0; j<i; j++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
	}

}
