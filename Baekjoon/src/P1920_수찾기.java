import java.util.Scanner;

public class P1920_수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nArr[] = new int[n];
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int mArr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			mArr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(mArr[i] == nArr[j]) {
					count++;
				}
				
				}
				System.out.println(count);
				count = 0;
		}
	}
}
