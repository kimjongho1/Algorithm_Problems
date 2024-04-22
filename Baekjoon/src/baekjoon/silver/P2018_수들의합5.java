package baekjoon.silver;

import java.util.Scanner;

public class P2018_수들의합5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int number = 0;
		int temp = 0;
		
		for(int i = 0; i < N; i++) {
			temp = i;
			while(N > number) {
				temp += 1;
				number += temp;
				if(number == N) {
					result++;
				}
			}
			number = 0;
		}
		System.out.println(result);
	}

}
