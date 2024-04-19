package baekjoon.silver;

import java.util.Scanner;

public class P1094_막대기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 첫째 줄에 X가 주어진다. X는 64보다 작거나 같은 자연수이다.
		int result = 0;
		int stick = 64;
		int X = sc.nextInt();
		while(X > 0) {
			if(stick > X) {
				stick /= 2;
			} else {
				X -= stick;
				result++;
			}
		}
		System.out.println(result);
	}
}
