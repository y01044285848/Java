package ch02.sec02;
//p43
public class LongExample {
	public static void main(String[] args) {
		long var1 = 10; 
		long var2 = 20L;
		//long var3 = 1000000000000; long타입 접미사 L이 빠질경우 int로 인식하여 에러 발생
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
