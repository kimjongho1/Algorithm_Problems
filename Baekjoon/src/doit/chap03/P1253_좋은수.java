package doit.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int result = 0;
		for(int k = 0; k < N; k++) {
			int i = 0;
			int j = N - 1;
			while(i < j) {
				if(A[i] + A[j] == A[k]) {
					if(i != k && j != k) {
						result++;
						break;
					} else if(i == k){
						i++;
					} else {
						j--;
					}
				} else if(A[i] + A[j] < A[k]) {
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
