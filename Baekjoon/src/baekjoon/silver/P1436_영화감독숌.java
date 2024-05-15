package baekjoon.silver;

import java.util.Scanner;

public class P1436_영화감독숌 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
 
		int num = 666;
		int count = 1;
        
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}

}
