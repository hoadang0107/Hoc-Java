package taptanh.com.test;

import java.util.ArrayList;
import java.util.Collections;

import taptanh.com.model.SanPham;

public class TestSanPhan {
	public static void main(String[] args) {
		ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
		
		dsSP.add(new SanPham(1,"Coca",8));
		dsSP.add(new SanPham(2, "Pepsi", 10));
		dsSP.add(new SanPham(3, "Redbull",9));
		
		System.out.println("Danh sach san pham:");
		for(SanPham sp: dsSP) {
			System.out.println(sp);
		}
		
		Collections.sort(dsSP);
		System.out.println("Danh sach san pham sau khi sap xep");
		for(SanPham sp: dsSP) {
			System.out.println(sp);
		}
	}

}
