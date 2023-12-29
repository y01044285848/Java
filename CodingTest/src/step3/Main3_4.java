package step3;

import java.util.Scanner;

public class Main3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String result = "int";
		for(int i = 0; i < n/4;i++) {
			result = "long " + result;
		}
		System.out.println(result);
	}
}
