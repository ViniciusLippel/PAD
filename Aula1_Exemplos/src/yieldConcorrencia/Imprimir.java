package yieldConcorrencia;

/*O m�todo yield() permite a suspens�o da execu��o da Thread atual,
 * com isso outra Thread que necessita poder� obter a aten��o do processador.
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
