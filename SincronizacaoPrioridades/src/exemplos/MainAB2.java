package exemplos;

public class MainAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AltaPrioridade2 a = new AltaPrioridade2();
		BaixaPrioridade2 b = new BaixaPrioridade2();
		System.out.println("Iniciando threads...");
		b.start();
		a.start();
		Thread.currentThread();
		Thread.yield();
		System.out.println("Main Finalizado");
	}

}
