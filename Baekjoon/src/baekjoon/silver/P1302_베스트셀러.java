package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class P1302_베스트셀러 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<String, Integer>();	// 책 제목과 책 개수를 위한 hashMap 설정
		String str = new String();										// String 인스턴스 생성
		
		for(int i = 0; i < N; i++) {									// N 값만큼 반복
			str = br.readLine();										// N 값만큼 책제목 저장
			if(map.containsKey(str)) {									// 책제목과 동일한 Key 조회 
				map.replace(str, map.get(str) + 1);						// 있다면 기존 value에 +1
			} else {
				map.put(str, 1);										// 없다면 새로운 map 생성
			}
		}
		
		int max = 0;													// 값이 큰 int값 초기화
		
		for(String a : map.keySet()) {									
			max = Math.max(max, map.get(a));							// 해쉬맵을 전체 탐색하여 가장 큰 value를 max에 저장
		}
		
		ArrayList<String> a1 = new ArrayList<String>(map.keySet());		// 해쉬맵의 key들을 리스트로 옮김
		Collections.sort(a1);											// 리스트를 정렬
		for(String a : a1) {
			if(map.get(a) == max) {
				System.out.println(a);									// 리스트에서 value값이 max값인 key를 하나만 출력
				break;
			}
		}
		br.close();
	}
}
