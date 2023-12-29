package step3;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main3_11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println(sc.nextInt() + sc.nextInt());
			} catch (NoSuchElementException a) {
				return;
			}
		}
		
	}
}
