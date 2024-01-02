package step4;

import java.util.Scanner;

public class Main4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		String result = "";
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			if(x > k) {
				result += k + " ";
			}
		}
		sc.close();
		System.out.println(result);
	}
}
