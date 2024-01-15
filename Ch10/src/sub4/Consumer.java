package sub4;

public class Consumer extends Thread {

	private Store store;

	public Consumer(Store store) {
		super();
		this.store = store;
	}

	@Override
	public void run() {
		
		for (int i = 0; i <= 10; i++) {
			store.consume();
			
			/*try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
	}
}
