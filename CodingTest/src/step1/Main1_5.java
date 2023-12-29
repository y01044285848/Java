package step1;

import java.util.Scanner;

public class Main1_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println((double)a / b);
		scan.close();

	}
}
