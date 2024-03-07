package doit.chap03;

import java.util.Scanner;

public class P2018_연속된자연수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_idx = 1;
		int end_idx = 1;
		int sum = 1;
		while(end_idx != N) {
			if(sum == N) {			// 현재 연속 합이 N과 같은 경우
				count++;
				end_idx++;
				sum = sum + end_idx;
			} else if(sum > N) {	// 현재 연속 합이 N보다 더 큰 경우
				sum = sum - start_idx;
				start_idx++;
			} else {				// 현재 연속 합이 N보다 작은 경우
				end_idx++;
				sum = sum + end_idx;
			}
		}
	}
}
