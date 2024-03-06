package baekjoon.twodimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumValue {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		int max = 0;
		String row = null;
		String column = null;
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(str.nextToken());
			}
		}
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					row = String.valueOf(i + 1);
					column = String.valueOf(j + 1);
				}
			}
		}
		if(max == 0) {
			row = "0";
			column = "0";
		}
		System.out.println(max);
		System.out.print(row + " " + column);
	}
}