package doit.chap03;

import java.util.Scanner;

public class P11720_숫자의합 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
		int sum = 0;
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		for (int i = 0; i < sNum.length(); i++) {
			sum += cNum[i] - '0'; // cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
		}
		
		System.out.println(sum);
	}
}
