package taptanh.com;

public class TestHanChe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []M = {2,4,5,3,2};
		System.out.println(M[4]);
		//Mở rộng mảng
		int M2[] = new int [M.length+1];
		for(int i =0; i < M.length; i++) {
			M2[i] = M[i];
		}
		M2[M2.length-1] = 1;
		for(int i =0; i < M2.length; i++) {
			System.out.print(M2[i] +"\t");
		}

	}

}
