package taptanh.com;

public class TestDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =5; 
		int b =8; 
		double c;
		try {
		 c= (double)a/b;
			System.out.println("c = "+ c);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
