package While;

import java.util.Scanner;

public class Q_10951 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a+b);
		}
		scan.close();
	}

}
