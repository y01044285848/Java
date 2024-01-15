package sub4;

/*
 * 날짜 : 2024/01/15
 * 이름 : 이승윤
 * 내용 : Java Thread 제어 실습하기
 * 
 */
public class ThreadWaitTest {
	public static void main(String[] args) {
		
		Store store = new Store();
		
		Thread producer = new Producer(store);
		Thread consumer = new Consumer(store);
		
		producer.start();
		consumer.start();
		
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
