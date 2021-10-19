package main;

public class CaraCoroa_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaraCoroa cc = new CaraCoroa();
		ThreadCC cara = new ThreadCC("Cara", cc);
		ThreadCC coroa = new ThreadCC("Coroa", cc);
		try {
			cara.t.join();
			coroa.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
