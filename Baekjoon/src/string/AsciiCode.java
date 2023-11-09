package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiCode {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char str = br.readLine().charAt(0);
		br.close();
		
		System.out.println((int)str);
	}

}
