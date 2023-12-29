package step3;

import java.util.Scanner;

public class Main3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt() ;
		for(int i = 0; i < testCase;i++) {
			System.out.println(sc.nextInt()+sc.nextInt());
		}
		sc.close();
	}
}
