package step3;

import java.util.Scanner;

public class Main3_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		for (int i = 1; i < j + 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
		}
		sc.close();
	}
}