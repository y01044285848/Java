package step3;

import java.util.*;

public class Main3_9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i < num + 1; i++) {
			for (int j = num; j > 0; j--) {
				if (i < j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}