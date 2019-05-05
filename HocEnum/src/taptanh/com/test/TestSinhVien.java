package taptanh.com.test;

import java.util.ArrayList;

import taptanh.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<SinhVien>dsSV = new ArrayList<SinhVien>();
		dsSV.add(new SinhVien(1,"Hoa", 6));
		dsSV.add(new SinhVien(2,"Nam", 9));
		dsSV.add(new SinhVien(3,"Dong", 7));
		dsSV.add(new SinhVien(4,"Huong", 3));
		
		for(SinhVien sv: dsSV)
			System.out.println(sv);
		

	}

}
