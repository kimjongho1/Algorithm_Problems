package generalmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheFountain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 2;
		int value = 1;
		if(x == 1) {
			System.out.println("1/1");
		} else {
			while(range <= x) {
				range = range + 1 + count;
				count++;
			}
			for(int i = 1; i < count; i++) {
				value *= i;
			}
			if(count % 2 != 0) {
				System.out.println(count + "/" + (x - value));
			} else {
//				System.out.println(connt + "/" + ());
			}
		}
	}
}
