package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int cnt = 1;
		for(int i=0; i<array.length; i++) {
			array[i]=sc.nextInt()%42;
		}
		Arrays.sort(array);
		for(int i=0; i<array.length-1; i++) {
			if(array[i]!=array[i+1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
