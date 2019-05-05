package taptanh.com.model;

public class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i =0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+",i="+i);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
