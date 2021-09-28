package main;

public class ThreadSocket implements Runnable{
	
	private String str;
	private int n;
	
	public ThreadSocket(int n, String str) {
		this.n = n;
		this.str = str;
	}
	
	public void run() {
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