package startExtends;

/*O método start() requisita ao SO os recursos da CPU.
 * Apenas habilita a thread a ser executada, uma thread 
 * executável não está necessariamente sendo executada.
 */

public class MinhaThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread em Java");
	}
}
