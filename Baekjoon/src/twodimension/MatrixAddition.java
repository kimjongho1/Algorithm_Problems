package twodimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixAddition {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
	
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			str = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(str.nextToken());
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			str = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j] + Integer.parseInt(str.nextToken()) + " ");
            }
            sb.append("\n");
		}
		System.out.println(sb);
	}

}
