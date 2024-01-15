package sub4;

public class Producer extends Thread {

	private Store store;

	public Producer(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		
		for (int i = 0; i <= 10; i++) {
			store.produce();
			
			/*try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
	}
}
