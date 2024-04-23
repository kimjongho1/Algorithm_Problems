package baekjoon.silver;

import java.util.Scanner;

public class P1789_수들의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong();	// 1 <= S <= 4,294,967,295
		int count = 0;
		int sum = 0;
		
		while(S/2 > sum) {
			sum += count + 1;
			count++;
		}
		
		System.out.println(count * 2);
	}
}