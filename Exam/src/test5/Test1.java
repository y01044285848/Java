package test5;

/*
 * 날짜 : 2024-01-26
 * 이름 : 이승윤
 * 내용 : 자바 총정리 연습문제
 */
public class Test1 {
	public static void main(String[] args) {
		char var1 = 'A';
		int var2 = var1;
		char var3 = 'B';
		int var4 = var1 + var3;
		String var5 ="""
				Hello World!
				Hello Korea!
				Hello Busan!
				""";
				
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println(var5);

		int a = 10;
		int b = 5;
		System.out.println(a > b || a == b);
		System.out.println(a < b && a == b);

		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);

		// &인 경우 연산자 앞뒤 모두 실행 후 판단
		// &&인 경우 연산자 앞이 falus일 경우 뒤는 실행하지 않음
		// 방어코드 : &&를 오류가 나올 상황 앞에 넣어 조건이 만족하지 않으면 실행되지 않도록 함 
		System.out.println(a == b & test(1));
		System.out.println(a == b && test(2));

		System.out.println(b > 0 & (a / b > 0));
		System.out.println(b > 0 && (a / b > 0));

	}

	public static boolean test(int n) {
		System.out.println("test(" + n + ") 실행...");
		return true;
	}
}
