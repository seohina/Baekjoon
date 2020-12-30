package Array;

import java.util.Scanner;

public class Q_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] score = new String[n];
		for(int i=0; i<score.length; i++) {
			score[i] = sc.next();
		}
		for(int i=0; i<n; i++) {
			int sum=0;
			int cnt=0;
			for(int j=0; j<score[i].length(); j++) {
				if(score[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum+=cnt;
			}
			System.out.println(sum);
		}
	}

}
