package baekjoon.silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1026_보물 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int result = 0;
		
		int A[] = new int[S];
		Integer B[] = new Integer[S];
		
		for(int i = 0; i < S; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < S; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		for(int i = 0; i < S; i++) {
			result = result + A[i] * B[i];
		}
		System.out.println(result);
	}

}
