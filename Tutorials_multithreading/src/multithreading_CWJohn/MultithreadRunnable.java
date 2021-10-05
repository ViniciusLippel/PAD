package multithreading_CWJohn;

public class MultithreadRunnable implements Runnable {
	
	private int threadNumber;
	
	public MultithreadRunnable(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	
	//Only other thing to make multithreadble
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i + " from thread " + threadNumber);
			
			/*try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}
