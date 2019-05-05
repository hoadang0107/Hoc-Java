package taptanh.com;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
	
	public static void main(String[] args) {
		ArrayList ds1 = new ArrayList();
		ds1.add(1);
	//	ds1.add(new Date("dd/MM/yyyy"));
		ds1.add("Hoa");
		
		ArrayList<Integer>ds2 = new ArrayList<Integer>();
		ArrayList<Double>ds3 = new ArrayList<Double>();
		ArrayList<String>ds5 = new ArrayList<String>();
		
		ds5.add("Hoa");
		ds5.add("Nam");
		ds5.add("Dong");
		ds5.add("Huong");
		for(int i =0; i < ds5.size(); i++) {
			System.out.print(ds5.get(i)+ "\t");
		}
		System.out.println();
		//chèn thêm phần tử
		ds5.add(1, "BoMe");
		
		for(int i =0; i < ds5.size(); i++) {
			System.out.print(ds5.get(i)+ "\t");
		}
		System.out.println();
		//xóa phần tử
		ds5.remove(2);
		for(int i =0; i < ds5.size(); i++) {
			System.out.print(ds5.get(i)+ "\t");
		}
		System.out.println();
		
		//sửa
		
		ds5.set(2, "Baba");
		for(int i =0; i < ds5.size(); i++) {
			System.out.print(ds5.get(i)+ "\t");
		}
		System.out.println();
		System.out.println("Số phần tử hiện tại: "+ ds5.size());
		// clear: xóa tất cả
		ds5.clear();
		System.out.println("Số phần tử sau clear là: " + ds5.size());
	}

}
