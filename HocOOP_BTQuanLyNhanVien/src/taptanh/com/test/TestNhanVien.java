package taptanh.com.test;

import taptanh.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NhanVien nv1 = new NhanVien("Đặng", "Hoa", 273);
		NhanVien nv2 = new NhanVien("Đặng", "Nam", 863);
		
		System.out.println("Lương của "+nv1.getTen()+"\t"+ nv1.getLuong());;
		System.out.println("Lương của "+nv2.getTen()+"\t"+nv2.getLuong());
		

		if(nv1.lonHon(nv2)) 
			System.out.println(nv1.getTen()+" có số lượng sản phẩm lớn hơn "+nv2.getTen()+": "+ (nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		else
			System.out.println(nv2.getTen()+" có số lượng sản phẩm lớn hơn "+nv1.getTen()+": "+ (nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
		
		if(nv1.getSoSP()> nv2.getSoSP()) 
			System.out.println(nv1.getTen()+" có số lượng sản phẩm lớn hơn "+nv2.getTen()+": "+ (nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		else
			System.out.println(nv2.getTen()+" có số lượng sản phẩm lớn hơn "+nv1.getTen()+": "+ (nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
	}

}
