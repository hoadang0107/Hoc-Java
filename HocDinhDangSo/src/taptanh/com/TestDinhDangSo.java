package taptanh.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class TestDinhDangSo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao diem toan: ");
		double toan = scan.nextDouble();
		System.out.println("Nhap vao diem ly: ");
		double ly = scan.nextDouble();
		System.out.println("Nhap vao diem hoa: ");
		double hoa = scan.nextDouble();
		double TB = (toan+ly+hoa)/3;
		System.out.println("diem trung binh: "+TB);
		
		DecimalFormat dcf = new DecimalFormat("#.##");
		System.out.println("DTB: "+dcf.format(TB));
		
		//test dinh dang symbol
		
		int x = 371528353;
		DecimalFormat dcf1 = new DecimalFormat("#,###");
		DecimalFormatSymbols dcfs = new DecimalFormatSymbols(Locale.getDefault());
		
		dcfs.setGroupingSeparator(',');
		dcf1.setDecimalFormatSymbols(dcfs);
		
		System.out.println(x);
		System.out.println(dcf1.format(x));
	}
	
	
	
    
			

}
