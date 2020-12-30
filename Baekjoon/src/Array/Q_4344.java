package Array;

import java.util.Scanner;

public class Q_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//테스트 케이스
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();	//학생 수
			double sum=0;	//성적 합
			double avg=0;	//평균 합
			int cnt=0;	//평균 넘은 학생의 수 
			int[] array = new int[num];	//성적
			
			for(int j=0; j<num; j++) {
				array[j]=sc.nextInt();	//성적 입력
				sum+=array[j];		//성적 더하기
			}
			avg = (double) sum/num;	//성적 평균
			
			for(int j=0; j<num; j++) {
				if(array[j]>avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", 100.0*cnt/num);
		}

	}

}
