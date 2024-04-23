package baekjoon.silver;

import java.util.Scanner;

public class P1789_수들의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong();	// 1 <= S <= 4,294,967,295
		int count = 0;
		long sum = 0;
		
		for(int i=1; ; i++) {
			if(sum > S) break;
			sum += i;
			count ++;
		}
		
		System.out.println(count);
	}
}