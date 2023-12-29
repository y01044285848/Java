package step2;

import java.util.Scanner;

public class Main2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int status = 0;
		if(x>0) {
			if(y>0) {
				status = 1;
			}else {
				status = 4;
			}
		}else {
			if(y>0) {
				status = 2;
			}else {
				status = 3;
			}
		}
		System.out.println(status);
	}
}
