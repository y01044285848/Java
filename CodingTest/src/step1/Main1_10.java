package step1;

import java.util.Scanner;

public class Main1_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int temp = b%100;
		int x = (b/100)*a;
		int y = temp/10*a;
		temp %= 10;
		int z = temp*a;
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		System.out.println(a*b);


		scan.close();

	}
}
