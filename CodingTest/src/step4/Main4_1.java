package step4;

import java.util.Scanner;

public class Main4_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		sc.close();
		for (int x : arr) {
			if(x==v) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
