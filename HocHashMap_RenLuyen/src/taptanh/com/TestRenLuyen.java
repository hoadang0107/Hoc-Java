package taptanh.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestRenLuyen {
	
	static HashMap<Integer, String>map = new HashMap<Integer, String>();
	
	public static void menu() {
		System.out.println("1. Thêm");
		System.out.println("2. Xuất");
		System.out.println("3. sửa");
		System.out.println("4. Xóa");
		System.out.println("5. Tìm kiếm");
		System.out.println("6. Thoát");
		System.out.println("chọn gì đi bạn: ");
		int chon = new Scanner(System.in).nextInt();
		switch(chon) {
		case 1: 
			them();
			break;
		case 2: 
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			timKiem();
			break;
		case 6:
			System.out.println("Cảm ơn đã sử dụng chương trình!");
			System.exit(0);
			break;
		default:
			break;
		}
	}

	private static void timKiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhập tên sách muốn tìm:");
		String ten = new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String>item: map.entrySet()) {
			if(item.getValue().contains(ten)) {
				System.out.println(item.getKey()+"\t"+item.getValue());
			}
		}
	}

	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("Mời bạn nhập vào mã muốn sửa: ");
		int key =new Scanner(System.in).nextInt();
		if(map.containsKey(key) == false) {
			System.out.println("Mã không tồn tại");
		}else {
			System.out.println("Nhập tên sách mới: ");
			String ten = new Scanner(System.in).nextLine();
			map.put(key, ten);
		}
		
	}

	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("Mời bạn nhập vào mã sách muốn xóa: ");
		int key =new Scanner(System.in).nextInt();
		if(map.containsKey(key) == false) {
			System.out.println("Mã không tồn tại");
		}else {
			map.remove(key);
		}
		
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Mã\tTen Sách");
		for(Map.Entry<Integer, String>item :map.entrySet() ) {
			System.out.println(item.getKey()+"\t"+item.getValue());
		}
		
	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã sách: ");
		int key = new Scanner(System.in).nextInt();
		System.out.println("Nhập tên sách: ");
		String ten = new Scanner(System.in).nextLine();
		if(map.containsKey(key) == false) {
			map.put(key, ten);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
		}

	}

}
