package baekjoon.bronz;

import java.util.Arrays;
import java.util.Scanner;

public class P1157_단어공부 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int[] abc = new int[26];
		int hi = -1;
		char ch = '?';

		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.toUpperCase().charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {
			abc[(arr[i] - 'A')]++;
		}
		for (int i = 0; i < 26; i++) {
			if(hi < abc[i]) {
				hi = abc[i];
				ch = (char)(i + 65);
			} else if(hi == abc[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
