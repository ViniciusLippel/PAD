package sincronizacao;

public class ThreadIsAlive extends Thread {
	public void run() {
		for(int y=0; y<10; y++) {
			System.out.println(y);
		}
		try {
			sleep(100);
		} catch(InterruptedException e) {
			System.exit(0);
		}
	}
}
