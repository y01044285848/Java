package step3;

import java.util.Scanner;

public class Main3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a * i);
		}

	}

}
