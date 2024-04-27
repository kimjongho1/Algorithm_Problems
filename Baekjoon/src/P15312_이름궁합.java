import java.util.Scanner;

public class P15312_이름궁합 {

	public static void main(String[] args) {
		int arr[] = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		int result[] = new int[4000];
		
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String B = sc.nextLine();
		
		int N = 0;
		int stemp = 0;
		
		for(int i = 0; i < A.length(); i++) {
			N = A.charAt(i) - 65;
			result[i * 2] = arr[N];
			N = B.charAt(i) - 65;
			result[i * 2 + 1] = arr[N];
		}
		for(int i = 0; i < A.length() * 2 - 2; i++) {
			for(int j = 0; j < A.length() * 2 - 1; j++) {
				stemp = result[j + 1];
				result[j] = (result[j] + result[j + 1]) % 10;
			}
		}
		
		System.out.println(result[0] + "" + result[1]);
	}

}