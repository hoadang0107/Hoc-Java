package taptanh.com.model;

public class MyThread extends Thread{
	
	public void run() {
		super.run();
		for(int i =0; i < 10; i++) {
			try {
				Thread.sleep(500);
				
				System.out.println(Thread.currentThread().getName()+"i: ="+i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
