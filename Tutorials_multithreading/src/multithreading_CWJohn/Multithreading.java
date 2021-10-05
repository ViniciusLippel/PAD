package multithreading_CWJohn;

public class Multithreading {

	public static void main(String[] args) {
		
		MultithreadThing myThing = new MultithreadThing(1);
		MultithreadThing myThing2 = new MultithreadThing(2);
		MultithreadRunnable myRun = new MultithreadRunnable(3);
		//Will kick of a new thread
		//Java will branch a new thread and start running the run method
		myThing.start();
		myThing2.start();
		
		//Join: program stops and wait this thread to complete
		/*try {
			myThing2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//vvvvv Everything bellow will wait vvvvv
		
		//For Runnable implementation is different
		Thread myRunThread = new Thread(myRun);
		myRunThread.start();
		
		
		//isAlive: return a boolean indicating if the thread is still running
		System.out.println(myThing.isAlive());
	}

}
