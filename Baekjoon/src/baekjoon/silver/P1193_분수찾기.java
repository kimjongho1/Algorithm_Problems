package baekjoon.silver;

import java.util.Scanner;

public class P1193_분수찾기 {
	// 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 
	// 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
	// X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int floor = 0;	// 층
		int stamp = 0;
		while(X - stamp > 0) {
			X = X - stamp;
			floor++;
			stamp = stamp + 1;
		}
		if(floor % 2 != 0) {	// 짝수일 경우
			System.out.println((floor - (X - 1)) + "/" + X);
		} else {				// 홀수일 경우
			System.out.println(X + "/" + (floor - (X - 1)));
		}
	}
}
