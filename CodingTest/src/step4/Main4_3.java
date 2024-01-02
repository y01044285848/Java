package step4;

import java.util.Scanner;

public class Main4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int num = sc.nextInt();
		int max = num, min = num;
		for (int i = 1; i < j; i++) {
			num = sc.nextInt();
			if (max < num)
				max = num;
			if (min > num)
				min = num;
		}
		System.out.println(min + " " + max);
		sc.close();
	}
}
