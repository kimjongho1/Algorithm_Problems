package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String[] str = new String[num];
		
		for(int i = 0; i < num; i++) {
			String temp =  br.readLine();
			str[i] = temp.substring(0,1) + temp.substring(temp.length() - 1 ,temp.length());
		}
		
		br.close();
		
		for(int i = 0; i < num; i++) {
			System.out.println(str[i]);
		}
	}
}