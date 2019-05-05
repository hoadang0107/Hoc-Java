package taptanh.com;

public class TestBaiHat {
	
	public static String tenBaiHat(String baiHat) {
		int vtCuoi = baiHat.lastIndexOf("/");
		String ten = baiHat.substring(vtCuoi+1);
		return ten;
		
	}
	public static String tenBaiHatKhongMp3(String baiHat) {
		int vtCuoi = baiHat.lastIndexOf("/");
		int vtcc = baiHat.lastIndexOf(".");
		String ten = baiHat.substring(vtCuoi+1,vtcc);
		return ten;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baiHat = "D:/music/nhacedm/haiconvit.mp3";
		String kq = tenBaiHat(baiHat);
		System.out.println(kq);
		String kq2 = tenBaiHatKhongMp3(baiHat);
		System.out.println(kq2);

	}

}
