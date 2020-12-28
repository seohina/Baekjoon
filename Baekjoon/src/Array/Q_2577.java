package Array;

import java.util.Scanner;

public class Q_2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		int sum=1;
		
		for(int i=0; i<3; i++) {
			array[i] = sc.nextInt();
			sum*=array[i];
		}
		String str = Integer.toString(sum);
		
		for(int i=0; i<10; i++) {
			int cnt=0;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j)-'0')==i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

}
