package taptanh.com.test;

import taptanh.com.model.NhanVienThoiVu;
import taptanh.com.model.NhanVienchinhThuc;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienchinhThuc  teo = new NhanVienchinhThuc(1,"Nguyễn Văn Tèo");
		NhanVienThoiVu ty = new NhanVienThoiVu(2,"Trần Thị tý");
		
		teo.tinhLuong();
		ty.tinhLuong();

	}

}
