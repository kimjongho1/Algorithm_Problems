package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MeasureWordLength {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		br.close();
		System.out.println(str.length());
	}

}
