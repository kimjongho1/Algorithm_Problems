package baekjoon.silver;

import java.util.Scanner;

public class P1748_수이어쓰기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = 0;
		
		for(int i = 1; i < n + 1; i++) {
			result += String.valueOf(i).length();
		}
		System.out.println(result);
	}

}
