package step4;

import java.util.Scanner;

public class Main4_7 {
	public static void main(String[] args) {
		int arr[] = new int[28];
		Scanner sc = new Scanner(System.in);
		for(int a = 0; a < arr.length;a++) {
			arr[a] = sc.nextInt();
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		int check = 0;
		for(int b = 1; b <= 30; b++) {
			if(arr[check]!=b) {
				System.out.println(b);
			}else {
				check++;
			}
		}
	}
}
