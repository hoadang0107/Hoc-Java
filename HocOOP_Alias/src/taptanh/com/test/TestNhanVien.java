package taptanh.com.test;

import taptanh.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien(1, "Obama");
		NhanVien nv2 = new NhanVien(2, "Putin");
		nv1 = nv2; //nv1 trỏ về ô nhớ của nv2
		nv2.setTen("Kim Jong Un");
		System.out.println("Ten cua nhan vien 1: "+ nv1.getTen());
		nv1.setTen("Hồ Cẩm Đào");
		System.out.println("Ten cua nhan vien 2: "+ nv2.getTen());
		
		NhanVien nv3 = new NhanVien(3, "Hoa");
		NhanVien nv4 = new NhanVien(4,"Nam");
		
		nv3 = nv4.copy();
		System.out.println("Tên nhân viên 3: "+ nv3.getTen());
		nv4.setTen("Đông");
		System.out.println("Tên nhân viên 3: "+ nv3.getTen());
		
		
	}

}
