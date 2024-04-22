package baekjoon.silver;

import java.util.Scanner;

public class P2167_2차원배열의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[300][300];
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int K = sc.nextInt();
		
		for(int k = 0; k < K; k++) {
			int sum = 0;
			
			int I = sc.nextInt();
			int J = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			for(int i = I; i <= X; i++) {
				for(int j = J; j <= Y; j++) {
					sum += arr[i][j];
				}
			}
			System.out.println(sum);
		}
		
	}

}
