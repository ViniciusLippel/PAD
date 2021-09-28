package sleep;

/*O método sleep() suspende a execução da thread por um período, assim
 * libera o processador para outras threads. Esse período é definido em 
 * milissegundos ou nanossegundos e não pode ser considerado um tempo
 * preciso, pois existem uma série de fatores que irão influenciar 
 * (Prioridades, JVM, SO, ...).
 */

public class Main {

	public static void main(String[] args) {
		new MinhaThread1().start();
		new MinhaThread2().start();
	}

}
