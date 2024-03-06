package baekjoon.generalmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laundry {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < t; i++) {
			int c = Integer.parseInt(br.readLine());
			str.append(c / quarter + " ");
			c %= quarter;
			str.append(c / dime + " ");
			c %= dime;
			str.append(c / nickel + " ");
			c %= nickel;
			str.append(c / penny + "\n");
		}
		System.out.println(str);
		br.close();
	}

}
