package baekjoon.silver;

import java.util.Scanner;

public class P1476_날짜계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		int E = sc.nextInt();	// 1 <= E <= 15
		int S = sc.nextInt();	// 1 <= S <= 28
		int M = sc.nextInt();	// 1 <= M <= 19
		
		int e = 0;
		int s = 0;
		int m = 0;
		
		while(E != e || S != s || M != m) {
			e++;
			s++;
			m++;
			result++;

			if(e == 16) e = 1;
			if(s == 29) s = 1;
			if(m == 20) m = 1;
		}
		System.out.println(result);
	}
}
