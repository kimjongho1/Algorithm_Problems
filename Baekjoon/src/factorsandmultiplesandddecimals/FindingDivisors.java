package factorsandmultiplesandddecimals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindingDivisors {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(str.nextToken());
		int k = Integer.parseInt(str.nextToken());
		int result = 0;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
				}
			if(count == k) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}

