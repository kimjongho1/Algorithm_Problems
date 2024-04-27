import java.util.Scanner;

public class P9625_BABBA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]= new int[2];
		
		int K = sc.nextInt();
		int stemp = 0;
		
		for(int i = 0; i < K; i++) {
			if(arr[0] == 0 && arr[1] == 0) {
				arr[1]++;
			} else {
				stemp = arr[1];
				arr[1] = arr[0] + stemp;
				arr[0] = stemp;
			}
		}
		System.out.println(arr[0] + " " + arr[1]);
	}

}
