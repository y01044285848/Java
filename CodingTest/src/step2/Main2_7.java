package step2;

import java.util.Scanner;

public class Main2_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = 0;

		int[] arr = { a, b, c };

		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		if (arr[0] == arr[1] && arr[1] == arr[2] && arr[0] == arr[2]) {
			result = 10000 + (arr[0] * 1000);
		} else if (arr[0] == arr[1]) {
			result = 1000 + (arr[0] * 100);
		} else if (arr[1] == arr[2]) {
			result = 1000 + (arr[1] * 100);
		} else {
			result = arr[2] * 100;
		}
		
		System.out.println(result);
		
	}
}
