package multithreading_CWJohn;

public class MultithreadThing extends Thread {
	
	private int threadNumber;
	
	public MultithreadThing(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	
	//Only other thing to make multithreadble
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i + " from thread " + threadNumber);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
