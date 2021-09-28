package sleep;

/*O m�todo sleep() suspende a execu��o da thread por um per�odo, assim
 * libera o processador para outras threads. Esse per�odo � definido em 
 * milissegundos ou nanossegundos e n�o pode ser considerado um tempo
 * preciso, pois existem uma s�rie de fatores que ir�o influenciar 
 * (Prioridades, JVM, SO, ...).
 */

public class Main {

	public static void main(String[] args) {
		new MinhaThread1().start();
		new MinhaThread2().start();
	}

}
