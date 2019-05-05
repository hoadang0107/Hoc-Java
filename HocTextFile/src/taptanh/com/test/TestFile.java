package taptanh.com.test;

import java.util.ArrayList;

import taptanh.com.io.TestFileFactory;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String>dsData = new ArrayList<String>();
		dsData.add("Obama");
		dsData.add("Hoa");
		dsData.add("Nam");
		dsData.add("Dong");
		dsData.add("Huong");
		
		boolean kq = TestFileFactory.luuFile(dsData, "E:/dulieutest.txt");
		if(kq == true) System.out.println("Luu file thanh cong");
		else System.out.println("Luu file that bai.");*/
		
		ArrayList<String>dsData= TestFileFactory.docFile("E:/dulieutest.txt");
		for(String data: dsData) {
			System.out.println(data);
		}
		
	}

}
