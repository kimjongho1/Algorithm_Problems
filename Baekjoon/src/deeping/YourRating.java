package deeping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YourRating {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double score = 0;
		double sumScore = 0;
		double sumGrade = 0;

		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String subject = st.nextToken().toString();
			double grade = Double.parseDouble(st.nextToken().toString());
			String mark = st.nextToken().toString();
			if (!mark.equals("P")) {
				sumGrade += grade;
				switch (mark) {
				case "A+":
					score = 4.5;
					break;
				case "A0":
					score = 4.0;
					break;
				case "B+":
					score = 3.5;
					break;
				case "B0":
					score = 3.0;
					break;
				case "C+":
					score = 2.5;
					break;
				case "C0":
					score = 2.0;
					break;
				case "D+":
					score = 1.5;
					break;
				case "D0":
					score = 1.0;
					break;
				default:
					score = 0.0;
					break;
				}
				sumScore += (grade*score);
			}
		}
		System.out.printf("%.6f", sumScore/sumGrade);
	}
}
