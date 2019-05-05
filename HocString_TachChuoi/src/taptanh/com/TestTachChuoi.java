package taptanh.com;

public class TestTachChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoa = "20161600.Dang thi Hoa. Viet Nhat C";
		String[] arr = hoa.split("\\."); //khi gap ki tu dac biet: nen them \\ dang trk, chi tach dk theo 1 ki tu
		if(arr.length == 3) {
			System.out.println("Ma: " +arr[0]);
			System.out.println("Ten: " + arr[1]);
			System.out.println("Lop: "+ arr[2]);
		}
		
		System.out.println("-----------------------------");
		for(int i =0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------------------");
		for(String x: arr) {
			System.out.println(x);
		}

	}

}
