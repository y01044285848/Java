package ch02.sec11;
//p67
public class VariableScopExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5; v2가 if문 안에 선언돼있어 에러 발생
	}
}
