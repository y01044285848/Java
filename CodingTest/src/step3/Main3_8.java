package step3;

import java.util.*;

public class Main3_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i < num + 1; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
