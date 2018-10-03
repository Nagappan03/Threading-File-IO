package app;

public class Multiple1 implements Runnable {
	
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple1 m1 = new Multiple1();
		Thread t1 = new Thread(m1);
		t1.start();
	}

}
