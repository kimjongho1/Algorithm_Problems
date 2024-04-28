package baekjoon.silver;

import java.util.Scanner;

public class P1065_한수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sN = sc.nextLine();
		int n = Integer.parseInt(sN);
		int result = 0;
		int arr[] = new int[3];
		String stemp = null;
		
		if(!(n < 100) && n != 1000) {
			result = 99;
			for(int i = 100; i <= n; i++) {
				stemp = Integer.toString(i);
				for(int j = 0; j < sN.length(); j++) {
					arr[j] = stemp.charAt(j) - '0';
				}
				if(arr[0] - arr[1] == arr[1] - arr[2]) {
					result++;
				}
			}
		} else if (n != 1000) {
			result = n;
		} else {
			result = 144;
		}
		System.out.println(result);
	}
}
