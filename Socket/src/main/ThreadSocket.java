package main;

public class ThreadSocket extends Thread{
	
	private int n;
	private String str;
	private int prioridade;
	
	public ThreadSocket(int n, String str, int prioridade) {
		this.n = n;
		this.str = str;
		this.prioridade = prioridade;
	}
	
	public void run() {
		setPriority(prioridade);
		for(int x=0; x<n; x++) {
			System.out.print(str);
			System.out.println(" " + (x+1) + "/" + n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
