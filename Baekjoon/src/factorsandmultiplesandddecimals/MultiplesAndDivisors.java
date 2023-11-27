package factorsandmultiplesandddecimals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiplesAndDivisors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			if(!(a == 0 && b == 0)) {
				if(a % b == 0 && b % a == 0) {
					System.out.println("multiple");
				} else if (a % b == 0 || b % a == 0) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			} else {
				break;
			}
		}
	}
}
