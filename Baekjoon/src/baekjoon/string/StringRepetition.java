package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRepetition {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] strArr1 = new String[T];
		
		for(int i = 0; i < T; i++) {
			int R = Integer.parseInt(br.readLine());
			String str = br.readLine();
			for(int k = 0; k < R; k++) {
				String temp = str.substring(k, str.length() - (str.length() - k - 1));
				
			}
		}
	}

}
