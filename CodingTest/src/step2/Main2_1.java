package step2;

import java.util.Scanner;
public class Main2_1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1==num2) System.out.println("==");
        if(num1>num2) System.out.println(">");
        if(num1<num2) System.out.println("<");
        scan.close();
    }
}