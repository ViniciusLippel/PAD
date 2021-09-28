package yieldConcorrencia;

/*O método yield() permite a suspensão da execução da Thread atual,
 * com isso outra Thread que necessita poderá obter a atenção do processador.
 */

public class Imprimir implements Runnable {
	String str;
	
	public Imprimir(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int x=0; x<10; x++) {
			System.out.println(str);
			Thread.currentThread();
			Thread.yield();
		}
	}
}
