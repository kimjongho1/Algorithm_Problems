package deeping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder str = new StringBuilder();
		
		int a = 1 - Integer.parseInt(st.nextToken());
		int b = 1 - Integer.parseInt(st.nextToken());
		int c = 2 - Integer.parseInt(st.nextToken());
		int d = 2 - Integer.parseInt(st.nextToken());
		int e = 2 - Integer.parseInt(st.nextToken());
		int f = 8 - Integer.parseInt(st.nextToken());
		
		str.append(a);
		str.append(" ");
		str.append(b);
		str.append(" ");
		str.append(c);
		str.append(" ");
		str.append(d);
		str.append(" ");
		str.append(e);
		str.append(" ");
		str.append(f);
		
		System.out.println(str);
		
	}

}
