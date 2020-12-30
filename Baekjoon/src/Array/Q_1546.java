package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] score = new double[n];
		
		int sum=0;
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextDouble();
			sum+=score[i];
		}
		Arrays.sort(score);
		
		double avg = (sum/score[n-1]/n)*100;
		System.out.println(avg);
	}

}
