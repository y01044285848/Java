package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/12/28
 * 이름 : 이승윤
 * 내용 : 자바 기본 입출력 연습문제
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt();
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt();
		System.out.print("이름 입력 : ");
		name = sc.next(); // nextLine으로 하면 동작 안하고 넘어가버림.
		
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
		
		sc.close();
	}
}
