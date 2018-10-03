package app;

public class ThreadDemo extends Thread {

	public void run() {
		for (char a = 'a'; a < 'd'; a++) {

			try {
				System.out.println(a);
				Thread.sleep(1000);

			} catch (Exception e) {

			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		for (int i = 1; i < 4; i++) {

			try {
				System.out.println(i);
				Thread.sleep(1000);

			} catch (Exception e) {

			}

		}

	}
}
