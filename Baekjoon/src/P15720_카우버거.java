import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P15720_카우버거 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int result = 0;
		int nDResult = 0;

		Integer burger[] = new Integer[B];
		Integer side[] = new Integer[C];
		Integer drink[] = new Integer[D];

		for (int i = 0; i < B; i++) {
			burger[i] = sc.nextInt();
		}
		for (int i = 0; i < C; i++) {
			side[i] = sc.nextInt();
		}
		for (int i = 0; i < D; i++) {
			drink[i] = sc.nextInt();
		}

		// 최솟값 구하기
		int min = Math.min(B, Math.min(C, D));

		Arrays.sort(burger, Collections.reverseOrder());
		Arrays.sort(side, Collections.reverseOrder());
		Arrays.sort(drink, Collections.reverseOrder());

		for (int i = 0; i < min; i++) {
			int calc = 0;
			calc += burger[i];
			calc += side[i];
			calc += drink[i];
			nDResult += calc;
			result += (int) (calc * 0.9);
		}

		for (int i = min; i < burger.length; i++) {
			nDResult += burger[i];
			result += burger[i];
		}
		for (int i = min; i < side.length; i++) {
			nDResult += side[i];
			result += side[i];
		}
		for (int i = min; i < drink.length; i++) {
			nDResult += drink[i];
			result += drink[i];
		}
		System.out.println(nDResult);
		System.out.println(result);
	}
}
