package step2;

import java.util.Scanner;

public class Main2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int addTime = sc.nextInt();
		
		sc.close();
		
		int total = (hour * 60) + min + addTime;
		if (total >= 24 * 60)
			total -= 24 * 60;
		System.out.printf("%d %d", total / 60, total % 60);

	}
}
