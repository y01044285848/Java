package sub1;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이승윤
 * 내용 : 자바 함수형 프로그래밍 실습
 * 
 * 함수형 프로그래밍
 *  - 프로그래밍 단위를 함수(메서드) 위주로 프로그래밍 하는 페러다임
 *  - 함수형 프로그래밍을 람다식으로 구현
 */

interface A {
	public void hello();
}

class B implements A {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello World...");
	}

}

public class FunctionalTest {
	public static void main(String[] args) {

		// 객체지향 프로그래밍
		A a1 = new B();
		a1.hello();

		// 익명 객체(인터페이스를 바로 객체 생성)
		A a2 = new A() {

			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Hello World..");
			}
		};
		a2.hello();

		// 함수형 프로그래밍
		// interface로만 사용
		A a3 = () -> {
			System.out.println("Hello World.");
		};
		a3.hello();
	}
}
