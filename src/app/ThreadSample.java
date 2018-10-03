package app;

public class ThreadSample extends Thread {
	
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSample ts = new ThreadSample();
		ThreadSample ts1 = new ThreadSample();
		ts.start();
		ts.suspend();
		ts1.start();
		ts.resume();
	}

}
