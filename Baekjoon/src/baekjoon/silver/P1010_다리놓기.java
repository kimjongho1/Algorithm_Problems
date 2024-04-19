package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010_다리놓기 {
	// 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다.
	// 그 다음 줄부터 각각의 테스트케이스에 대해 강의 서쪽과 동쪽에 있는 사이트의 개수 정수 N, M (0 < N ≤ M < 30)이 주어진다.
	
	static int[][] dp = new int[30][30];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		StringTokenizer str;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			str = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(str.nextToken());
			int M = Integer.parseInt(str.nextToken());
			sb.append(combi(M, N)).append('\n');
		}
		
		System.out.println(sb);
	}

	static int combi(int n, int m) {
			if(dp[n][m] > 0) {
				return dp[n][m]; 
			}
			
			if(n == m || m == 0) {
				return dp[n][m] = 1;
			}
			
			return dp[n][m] = combi(n - 1, m - 1) + combi(n - 1, m);
	}
}
