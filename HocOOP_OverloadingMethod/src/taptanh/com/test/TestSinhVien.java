package taptanh.com.test;

import taptanh.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien hoa = new SinhVien(1,"Đặng Thị Hoa",9);
		hoa.xetTotNghiep();
		hoa.xetTotNghiep(1, 4);

	}

}
