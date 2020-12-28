package For;

import java.util.Scanner;

public class Q_10871{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			if(a<x)
				System.out.print(a+ " ");
		}

	}

}
