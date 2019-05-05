package taptanh.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		map.put(1, "Hoa");
		map.put(2,"Nam");
		map.put(3, "Mai");
		map.put(4, "Đông");
		map.put(5, "Hương");
		
		Collection<String> dsTen = map.values();
		for(String ten: dsTen) {
			System.out.println(ten);
			
		}
		System.out.println("Danh sách mã: ");
		Set<Integer>dsMa = map.keySet();
		for(int ma: dsMa) {
			System.out.println(ma);
		}
		//truy suất phần tử bất kì qua khoa chính
		String ten = map.get(2);
		System.out.println(ten);
		
		//Ghi đè, thay đổi thông tin
		
		map.put(5, "Happy");
		
		System.out.println("Danh sách tên:");
		dsTen = map.values();
		for(String ten1: dsTen) {
			System.out.println(ten1);
			
		}
		
		//Xóa 
		map.remove(1);
		System.out.println("----------------------");
		System.out.println("Danh sách tên:");
		dsTen = map.values();
		for(String ten1: dsTen) {
			System.out.println(ten1);
			
		}
		
		//Xóa toàn bộ
		map.clear();
		System.out.println("-------------------");
		System.out.println("Danh sách tên:");
		dsTen = map.values();
		for(String ten1: dsTen) {
			System.out.println(ten1);
			
		}
	}

}
