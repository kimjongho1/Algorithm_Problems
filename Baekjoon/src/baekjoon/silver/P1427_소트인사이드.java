package baekjoon.silver;

import java.util.Scanner;

public class P1427_소트인사이드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		// int n = Integer.parseInt(N);
		int arr[] = new int[N.length()];
		
		for(int i = 0; i < N.length() - 1; i++) {
			arr[i] = Integer.parseInt(N.charAt(i));
			System.out.println(arr[i]);
		}
		
	}
}
