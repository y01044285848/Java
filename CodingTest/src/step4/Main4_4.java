package step4;

import java.util.Scanner;

public class Main4_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = num;
		int maxPoint = 1;
		for (int i = 2; i < 10; i++) {
			num = sc.nextInt();
			if (max < num) {
				max = num;
				maxPoint = i;
			}
		}
		sc.close();
		System.out.println(max);
		System.out.println(maxPoint);
	}
}
