package startConcorrencia;

public class Imprimir implements Runnable {
	String str;
	public Imprimir(String str) {
		this.str = str;
	}
	public void run() {
		for(int x=0; x<10; x++) {
			System.out.println(str);
		}
		
	}
}
