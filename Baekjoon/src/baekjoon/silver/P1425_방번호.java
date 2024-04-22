package baekjoon.silver;

import java.util.Scanner;

public class P1425_방번호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		int count = 0;	// N의 자릿수
		int Ncount = 0;	// 6,9의 갯수
		int result = 0;
		int N = sc.nextInt();
		while(N != 0) {
			arr[count] = (N % 10);	// 1의 자릿수 배열에 0 ~ n 까지 저장
			N /= 10;	// 1의 자릿수 빼기
			count++;
		}
		
		for(int i = 0; i < count; i++) {
			if(arr[i] == 6 || arr[i] == 9) {
				Ncount++;
			} else {
				result++;
			}
		}
		
		if(Ncount % 2 != 0) {
			result++;
			Ncount /= 2;
		} else {
			Ncount /= 2;
		}
		System.out.println(result + Ncount);
	}

}