package doit.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
	public static void main(String[] args) throws IOException { // StringTokenizer 예외 throws
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());

		int nNum = Integer.parseInt(str.nextToken());
		int mNum = Integer.parseInt(str.nextToken());
		long[] S = new long[nNum + 1]; // 배열의 총합을 위해 +1

		str = new StringTokenizer(br.readLine());
		for (int i = 1; i <= nNum; i++) {
			S[i] = S[i - 1] + Integer.parseInt(str.nextToken()); // 합 배열 S를 만드는 공식 S[i] = S[i - 1] + A[i]
		}
		for (int k = 0; k < mNum; k++) {
			str = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(str.nextToken());
			int j = Integer.parseInt(str.nextToken());
			System.out.println(S[j] - (S[i - 1])); // 구간 합을 구하는 공식 S[j] - S[i - 1]
		}
	}
}