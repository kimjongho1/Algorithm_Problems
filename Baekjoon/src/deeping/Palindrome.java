package deeping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		StringBuilder str2 = new StringBuilder(str).reverse();
		String str3 = str2.toString();
		
		if(str.equals(str3)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
