package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1181_단어정렬 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 
		// 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
		// 주어지는 문자열의 길이는 50을 넘지 않는다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = N;
		String stamp = null;
		
		String[] arr = new String[N];
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i = 0; i > N - 1; i++) {
			stamp = arr[i];
			if(arr[i].length() > arr[i + 1].length()) {
				arr[i] = arr[i + 1];
				arr[i + 1] = stamp;
			}
		}
		
		for(int i = 0; i > N - 1; i++) {
			
		}
	}
}

/*
 * if(arr[i].equals(arr[i + 1])) { arr[i + 1] = arr[i + 2]; }
 */