package tt.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javafx.collections.transformation.SortedList;
import model.Contact;
import tt.io.SerializeFileFactory;

public class TestContact {
	
	static HashMap<Integer, Contact>csdl = new HashMap<Integer,Contact>();
	
	public static void menu() {
		System.out.println("1. Thêm");
		System.out.println("2. Xuất");
		System.out.println("3. Sửa");
		System.out.println("4. Xóa");
		System.out.println("5. Tìm");
		System.out.println("6. Sắp xếp");
		System.out.println("7. Lưu file");
		System.out.println("8. Đọc file");
		System.out.println("-1. Thoát");
		
		System.out.println("Bạn muốn gì?");
		int n = new Scanner(System.in).nextInt();
		switch(n) {
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
			tim();
			break;
		case 6:
			sapxep();
			break;
		case 7:
			luuFile();
			break;
		case 8:
			docFile();
			break;
		case -1:
			System.out.println("Cảm ơn vì đã dùng ứng dụng.");
			System.exit(0);
			break;
		
			
		}
	}

	private static void docFile() {
		// TODO Auto-generated method stub
		csdl = SerializeFileFactory.readFile("E:/csdlcontact.dat");
		
		
	}

	private static void luuFile() {
		// TODO Auto-generated method stub
		boolean t = SerializeFileFactory.saveFile(csdl, "E:/csdlcontact.dat");
		if(t == true) System.out.println("Lưu file thành công");
		
	}

	private static void sapxep() {
		// TODO Auto-generated method stub
		ArrayList<Contact> contactById = new ArrayList<Contact>(csdl.values());
		Collections.sort(contactById);
		System.out.println("Danh sách danh bạ:");
		for(Contact temp: contactById) {
			System.out.println(temp);
		}
		
		
	}

	private static void tim() {
		// TODO Auto-generated method stub
		System.out.println("Nhập phone: ");
		String phone = new Scanner(System.in).nextLine();
		for (Map.Entry<Integer, Contact> item : csdl.entrySet()) {
			if (item.getValue().getPhone().startsWith(phone))
				System.out.println(item.getValue());
		}
	}

	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã: ");
		int ma = new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)) {
			csdl.remove(ma);
		}else
			System.out.println("Không tìm thấy mã "+ma+" để xóa!");
		
	}

	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã muốn sửa:");
		int ma = new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)) {
			System.out.println("Nhập tên: ");
			String ten = new Scanner(System.in).nextLine();
			System.out.println("Nhập phone: ");
			String phone = new Scanner(System.in).nextLine();
			Contact temp = new Contact(ma, ten, phone);
			csdl.put(ma, temp);
		}else System.out.println("mã "+ ma+" không tồn tại.");
		
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Danh sách danh bạ sau sắp xếp:");
		for(Map.Entry<Integer, Contact>item: csdl.entrySet()) {
			System.out.println(item.getValue());
		}
		
	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã: ");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Nhập tên: ");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Nhập phone: ");
		String phone = new Scanner(System.in).nextLine();
		
		Contact temp = new Contact(ma, ten, phone);
		if(csdl.containsKey(temp.getId()) == false) {
			csdl.put(temp.getId(), temp);
			System.out.println("Mã "+ ma+ " đã tồn tại, không thêm được.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
		}
		

	}

}
