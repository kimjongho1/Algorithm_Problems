package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1475_방번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String N = br.readLine();
			int cnt[] = new int[9];
			
			for(int i = 0; i < N.length(); i++) {
				int num = N.charAt(i) - '0';
				
				if(num == 9) num = 6;
				cnt[num]++;
			}
			cnt[6] = cnt[6] / 2 + cnt[6] % 2;

			Arrays.sort(cnt);
			System.out.println(cnt[8]);
	}

}