package baekjoon.bronze;

import java.util.Scanner;

public class P1546_평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[101];
		int avg[] = new int[1000];

		double sum = 0;
		int score = 0;
		int max = -1;

		for(int i = 0; i < N; i++) {
			score = sc.nextInt();
			arr[score]++;
			avg[i] = score;
		}
		
		for(int i = 1; i < 101; i++) {
			if(arr[i] >= 1) {
				max = i;
			}
		}
		
		for(int i = 0; i < N; i++) {
			sum += (double)avg[i] / max * 100;
		}
		
		System.out.println(sum / N);
	}
}
