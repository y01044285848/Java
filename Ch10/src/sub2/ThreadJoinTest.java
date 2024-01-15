package sub2;
/*
 * 날짜 : 2024/01/15
 * 이름 : 이승윤
 * 내용 : Java Thread 상태 실습하기
 */
class ChildThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 1; i <= 10; i++) {
			System.out.println("i : " + i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("자식 스레드 종료...");
	}
}

public class ThreadJoinTest {
	public static void main(String[] args) {
		ChildThread ct = new ChildThread();
		
		ct.start();
		
		try {
			ct.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램(메인 스레드) 종료...");
	}
}
