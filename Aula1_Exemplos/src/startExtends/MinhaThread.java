package startExtends;

/*O m�todo start() requisita ao SO os recursos da CPU.
 * Apenas habilita a thread a ser executada, uma thread 
 * execut�vel n�o est� necessariamente sendo executada.
 */

public class MinhaThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread em Java");
	}
}
