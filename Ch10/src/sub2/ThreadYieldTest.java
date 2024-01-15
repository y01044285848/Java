package sub2;
/*
 * 날짜 : 2024/01/15
 * 이름 : 이승윤
 * 내용 : Java Thread Yield 실습하기
 */

class SubThread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("SubThread1 : " + i);

			Thread.yield();
		}
	}
}

class SubThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("SubThread2 : " + i);

		}
	}
}

public class ThreadYieldTest {
	public static void main(String[] args) {
		
		SubThread1 sub1 = new SubThread1();
		SubThread2 sub2 = new SubThread2();
		
		sub1.start();
		sub2.start();
		
		try {
			sub1.join();
			sub2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램(메인 스레드) 종료...");
		
		
	}
}
