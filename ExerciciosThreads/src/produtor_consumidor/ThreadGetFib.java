package produtor_consumidor;

public class ThreadGetFib extends Thread {
	
	private int value;
	
	public ThreadGetFib (int value) {
		this.value = value;
	}
	
	public synchronized void run() {
		
		System.out.println("Valor: " + this.value);
		
		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
