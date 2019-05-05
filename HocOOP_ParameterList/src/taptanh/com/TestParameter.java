package taptanh.com;

public class TestParameter {
	
	public static int sum(int ...arr) {
		int s =0; 
		for(int i =0; i < arr.length; i++) {
			s += arr[i];
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = sum(1,3,2,4,3);
		System.out.println(s);
		int s2 = sum();
		System.out.println(s2);
		int s3 = sum(1,3);
		System.out.println(s3);

	}

}
