package baekjoon.bronze;

import java.util.Scanner;

public class P2163_초콜릿자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		
		count = N * M - 1;
		
		System.out.println(count);
	}

}
