package taptanh.com.test;

import taptanh.com.model.NhanVienChinhThuc;
import taptanh.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1, "Tèo Teo");
		teo.tinhLuong();
		
		NhanVienThoiVu ty = new NhanVienThoiVu(2, "Tý sẹo");
		ty.tinhLuong();

	}

}
