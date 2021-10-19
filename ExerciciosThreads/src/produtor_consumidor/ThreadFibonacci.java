package produtor_consumidor;

public class ThreadFibonacci extends Thread {

	private int fibNum;
	private int result;

	public ThreadFibonacci(int n) {
		this.fibNum = n;
	}

	public synchronized void run() {
		int n1=1, n2=1, n3=0, count = this.fibNum;      

		for(int i=2; i<count; ++i)  
		{    
			n3=n1+n2;      
			n1=n2;    
			n2=n3;
			Thread.yield();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(n3);
		result = n3;
	}
	
	public synchronized int getResult() {
		return this.result;
	}
}
