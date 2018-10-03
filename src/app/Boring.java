package app;

public class Boring extends Thread {
	
		public void run() {
			
			for(int i=1;i<3;i++) {
				System.out.println(i);
				System.out.println(Thread.currentThread().getName());
			}
			
			for(int i=3;i<6;i++) {
				System.out.println(Thread.currentThread().getId());
				System.out.println(i);
			}
			
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Boring b = new Boring();
		Boring b1 = new Boring();
		Boring b2 = new Boring();
		b.start();
		b.sleep(5000);
		b.suspend();
		b1.start();
		b2.start();
		b.join();
		b2.stop();
		b1.setPriority(MAX_PRIORITY);
		b.resume();
	}

}
