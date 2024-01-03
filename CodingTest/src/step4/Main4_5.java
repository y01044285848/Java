package step4;

import java.util.Scanner;

public class Main4_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int m = sc.nextInt();

        for(int x = 1; x < m+1; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int y = i; y < j+1; y++) {
                arr[y] = k;
            }
        }
        sc.close();
        for(int z = 1; z < arr.length; z++) {
            System.out.print(arr[z] + " ");
        }
    }
}
