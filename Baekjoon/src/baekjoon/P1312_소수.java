package baekjoon;

import java.util.Scanner;

public class P1312_소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        int result = 0;
		
        for(int i = 0; i < n; i++) {
        	a = (a % b) * 10;
        	result = a / b;
        }
        
        System.out.println(result);
	}

}
