package app;

public class Multiple extends Thread {
	
	int i = 0;

			public void run() {
				for(int i=1;i<6;i++) {
					System.out.println(i);
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m = new Multiple();
		m.start();
	}

}
