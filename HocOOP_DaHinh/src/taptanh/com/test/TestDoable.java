package taptanh.com.test;

import taptanh.com.model.IDoable;
import taptanh.com.model.NhanVien;
import taptanh.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDoable x;
		x = new SinhVien();
		x.doSomething();
		
		x= new NhanVien();
		x.doSomething();
				
	}

}
