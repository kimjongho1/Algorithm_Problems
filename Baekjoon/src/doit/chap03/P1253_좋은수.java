package doit.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int result = 0;
		for(int k = 0; k < N; k++) {
			int num = arr[k];
			int i = 0;
			int j = N - 1;
			while(i < j) {
				if (arr[i] + arr[j] == num) {
					if(i != num && j != k) {
						result++;
						break;
					} else if(i == k) {
						i++;
					} else {
						j--;
					}
				} else if (arr[i] + arr[j] < num) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(result);
		br.close();
	}

}
