package taptanh.com.io;

import java.util.ArrayList;

import taptanh.com.model.KhanhHang;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayList<KhanhHang>dsKH = new ArrayList<KhanhHang>();
		dsKH.add(new KhanhHang(1,"Tun"));
		dsKH.add(new KhanhHang(2,"Hoa"));
		dsKH.add(new KhanhHang(4,"Nam"));
		dsKH.add(new KhanhHang(3,"Huong"));
		
		boolean kq = SerializeFileFactory.luuFile(dsKH, "E:/data_kh.dat");
		if(kq ==true) {
			System.out.println("Luu file thanh cong");
		}else System.out.println("Luu file that bai");*/
		
		Object data = SerializeFileFactory.docfile("E:/data_kh.dat");
		ArrayList<KhanhHang>dsKH = (ArrayList<KhanhHang>) data;
		for(KhanhHang kh: dsKH) {
			System.out.println(kh.getMa()+"\t"+kh.getTen());
		}
	}

}
