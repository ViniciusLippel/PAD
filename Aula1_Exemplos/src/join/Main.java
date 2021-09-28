package join;

public class Main {

	public static void main(String[] args) {
		MinhaThread1 t1 = new MinhaThread1();
		MinhaThread2 t2 = new MinhaThread2();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Finalizado");
	}

}
