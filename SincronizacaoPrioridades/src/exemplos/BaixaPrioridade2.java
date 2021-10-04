package exemplos;

public class BaixaPrioridade2 extends Thread{
	public void run() {
		setPriority(1);
		for(int y = 0; y<10; y++) 
			System.out.println("Baixa Prioridade...");
		try {
			sleep(100);
		} catch(InterruptedException e) {
			System.exit(0);
		}
	}
}
