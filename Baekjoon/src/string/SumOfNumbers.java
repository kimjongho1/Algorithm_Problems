package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// N값은 필요없으므로, 변수처리를 하지 않음
		br.readLine();
		
		int sum = 0;
		
		// getBytes() 문자열을 입력받을 때 해당 문자열을 쉽게 각 자릿값을 반환받을 수 있는 방법
		// 문자열을 바이트 배열로 변환
		for(byte value: br.readLine().getBytes()) {
			// ASCII 코드 값으로 저장되기 때문에 '0'값을 빼주어야 함
			sum += value - '0';
		}
		br.close();
		
		System.out.println(sum);
	}
}