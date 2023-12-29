package step2;

import java.util.Scanner;

public class Main2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();

		sc.close();

		if ((hour * 60) + min < 45)
			hour = 24;
		int total = ((hour * 60) + min) - 45;
		System.out.printf("%d %d", total / 60, total % 60);
	}
}
