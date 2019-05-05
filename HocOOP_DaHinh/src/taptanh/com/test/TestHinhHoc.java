package taptanh.com.test;

import taptanh.com.model.HinhChuNhat;
import taptanh.com.model.HinhHoc;
import taptanh.com.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h;
		h = new HinhChuNhat(4, 5);
		
		System.out.println("Chu vi: "+ h.tinhChuVi());
		System.out.println("Dien tich: "+ h.tinhDienTich());
		
		h = new HinhVuong(5);
		System.out.println("Chu vi : "+ h.tinhChuVi());
		System.out.println("Dien tich: "+ h.tinhDienTich());
		
		HinhChuNhat hv1 = new HinhVuong(5);
		System.out.println("Chu vi : "+ hv1.tinhChuVi());
		System.out.println("Dien tich: "+ hv1.tinhDienTich());
	}

}
