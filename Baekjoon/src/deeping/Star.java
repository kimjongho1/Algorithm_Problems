package deeping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int star = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= star; i++) {
			for(int j = 0; j < star - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= star - 1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < star * 2 - (2 * i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
