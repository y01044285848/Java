package test1;
/*
 * 날짜 : 2023/12/28
 * 이름 : 이승윤
 * 내용 : 자바 연산자 연습문제
 */
public class Test3 {
	public static void main(String[] args) {
		int result = 0;
		int num = 1;
		
		result = num++;
		System.out.println("result : "  + result);
		
		result = ++num;
		System.out.println("result : "  + result);
		
		result = num--;
		System.out.println("result : "  + result);
		
		result = --num;
		System.out.println("result : "  + result);
	}
}
