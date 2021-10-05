package synchronized_Loiane;

public class MinhaThreadSoma implements Runnable {
	
	private String nome;
	private int[] nums;
	//static == recurso compartilhado entre todas as instancias da classe
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
		/*Thread t = new Thread(this, nome);
		t.start();*/
	}
	
	public void run() {
		
		System.out.println(this.nome + " iniciada");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para thread " + this.nome + " �: " + soma);
		
		System.out.println(this.nome + " terminada");
	}
}