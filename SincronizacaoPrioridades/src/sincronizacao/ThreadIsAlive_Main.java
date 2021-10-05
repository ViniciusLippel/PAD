package sincronizacao;

public class ThreadIsAlive_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadIsAlive ta = new ThreadIsAlive();
		ta.start();
		while (ta.isAlive()) {
			System.out.println("Thread Ativa");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread Inativa");
	}

}
