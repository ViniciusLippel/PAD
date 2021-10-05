package synchronized_Loiane;

public class Teste {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
		//Sem synchronized: Como a variavel soma em calculadora e compartilhada,
		//ambas as threads alteram a variavel ao mesmo tempo e a soma da errado
		
	}

}
