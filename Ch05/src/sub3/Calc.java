package sub3;

public class Calc {
	
	// 싱글톤 객체 생성
	private static Calc instance = new Calc();
	public static Calc getInstance() {return instance;} // 접근 할 수 있도록 getter생성
	private Calc() {} // 객체를 생성하지 못하게 접근 권한 private로 생성자 만들기
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
}
