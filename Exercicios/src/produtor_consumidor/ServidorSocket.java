package produtor_consumidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ServidorSocket {
	
	public static void main (String[] args) throws IOException{
		ServerSocket servidor = null;
		Socket conexao = null;
		BufferedReader entrada = null;
		final int bSize = 2; 
		Queue<Integer> buffer = new LinkedList<>();
		Random rand = new Random();
			
		try {
			servidor = new ServerSocket(7000);
			conexao = servidor.accept();
			entrada = new BufferedReader (new InputStreamReader (conexao.getInputStream()));
			
			do {
				String texto = entrada.readLine();
				if(texto == null) {
					break;
				}
				
				String[] msg = texto.split(" ");
			
				
				if(msg[0].equals("fib")) {
					ThreadFibonacci t = new ThreadFibonacci(rand.nextInt(20));
					t.start();
					try {
						t.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					buffer.add(t.getResult());

				}
				
				
				else if(msg[0].equals("getFib")) {
					if(buffer.peek() != null)
						new ThreadGetFib(buffer.poll()).start();
				}
				
			}while (!"sair".equals(entrada.toString()));
		
		}catch (IOException e) {
			System.out.println("Algo de errado aconteceu");
		}finally {
			conexao.close();
			servidor.close();
		}
	}
}
