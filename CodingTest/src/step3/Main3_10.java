package step3;

import java.util.Scanner;

public class Main3_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println(a + b);
			}
		}
		sc.close();
	}
}
