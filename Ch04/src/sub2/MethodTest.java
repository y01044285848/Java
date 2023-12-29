package sub2;

/*
 * 날짜 : 2023/12/29
 * 이름 : 이승윤
 * 내용 : 메서드 실습하기
 */
public class MethodTest {

	int num = 1;

	// main method : 자바 프로그램 시작 메서드
	public static void main(String[] args) {

		// 메서드1 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);

		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);

		// 메서드2 호출
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);

		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);

		for (int i = 1; i < 10; i++) {
			System.out.println(fibo(i));
		}

	}

	// 메서드1 정의
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}

	// 메서드2 정의
	public static int sum(int start, int end) {

		int total = 0;
		for (int k = start; k <= end; k++) {
			total += k;
		}
		return total;
	}

	public static int fibo(int a) {

		if (a <= 1) {
			return a;
		} else {
			return fibo(a - 1) + fibo(a - 2);
		}

	}

}
