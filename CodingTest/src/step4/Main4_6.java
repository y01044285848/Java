package step4;

import java.util.Scanner;

public class Main4_6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		for(int j = 0;j<m;j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tmp = arr[a];
			arr[a] = arr[b];
			arr[b] = tmp;
		}
		for(int k=1; k<arr.length;k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
