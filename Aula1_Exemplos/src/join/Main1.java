package join;

public class Main1 {

	public static void main(String[] args) {
		MinhaThread1 t1 = new MinhaThread1();
		MinhaThread2 t2 = new MinhaThread2();
		t1.start();
		t2.start();
		System.out.println("Main Finalizado");
	}

}
