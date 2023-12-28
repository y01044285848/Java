package sub3;


/*
 * 날짜 : 2023/12/27
 * 이름 : 이승윤
 * 내용 : Ch03, Java 반복문
 */

public class ForTest {
	public static void main(String[] args) {
		
		// for
		for(int i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
		}
		
		
		// 1부터 10까지 합
		int sum = 0;
		for(int k = 1; k <= 10; k++) {
			sum += k;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		
		
		// 1부터 10까지 짝수합
		int tot = 0;
		for(int k = 1; k <= 10; k++) {
			if(k%2 == 0) tot += k;
		}
		System.out.println("1부터 10까지 짝수 합 : " + tot);
		
		
		// for 중첩
		for(int a = 1; a <=3; a++) {
			System.out.println("a : " + a);
			for(int b = 1; b <= 5; b++) {
				System.out.println("b : " + b);				
			}
		}
		
		// 구구단
		for(int x = 2; x <10; x++) {
			System.out.println(x+"단");
			for(int y = 1; y < 10; y++) {
				System.out.printf("%d x %d = %d\n", x, y, x*y);
				// System.out.println(x + "x" + y + "=" + x*y);
			}
		}
		
		// 별삼각형
		for(int start = 1; start <=10; start++) {
			for(int end = 1; end <= start; end++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		for(int start = 1; start <=10; start++) {
			for(int end = 10; end >= start; end--) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
