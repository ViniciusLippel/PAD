package sleep;

public class MinhaThread1 extends Thread {
	@Override
	public void run() {
		for(int x=0; x<5; x++) {
			System.out.print("T1 | ");
			Thread.currentThread();
			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
