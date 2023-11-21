package generalmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenterShiftAlgorithm {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(A(n));
	}
	public static int A(double n) {
		double result = 0;
		if (n != 0) {
			n = Math.pow(2, n - 1) + n;
			result = Math.pow(2 , n);
		} else {
			result = 0;
		}
		return (int)result;
	}
}
