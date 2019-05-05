package taptanh.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestluyenTap {
	static int []M;
	
	public static void menu() {
		System.out.println("1. Nhập mảng.");
		System.out.println("2. Xuất mảng.");
		System.out.println("3. Tổng mảng.");
		System.out.println("4. Tìm kiếm.");
		System.out.println("5. Lớn nhất.");
		System.out.println("6. Nhỏ nhất.");
		System.out.println("7. Số Nguyên tố.");
		System.out.println("8. Sắp tăng");
		System.out.println("9.Sắp giảm.");
		System.out.println("-1: Thoát");
		System.out.println("Mời bạn chọn:");
		int chon = new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:
			nhapMang();
			break;
		case 2:
			xuatMang();
			break;
		case 3:
			tongMang();
			break;
		case 4:
			timKiem();
			break;
		case 5:
			lonNhat();
			break;
		case 6:
			nhoNhat();
			break;
		case 7: 
			soNguyenTo();
			break;
		case 8:
			sapTang();
			break;
		case 9:
			sapGiam();
			break;
		case -1:
			System.out.println("Cảm ơn ban đã dùng phần mềm.");
			System.exit(0);
		default:
			System.out.println("Nhập sai rồi!");
			break;
		}
	}
	
	private static void sapGiam() {
		// TODO Auto-generated method stub
		for(int i =0; i < M.length-1; i++) {
			for(int j =i +1; j < M.length ; j++) {
				if(M[i] < M[j]) {
					int temp = M[i];
					M[i] = M[j];
					M[j] = temp;
				}
			}
		}
		System.out.println("Mang sau khi sắp xếp giảm dần là:");
		for(int i = 0; i < M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
		
	}

	private static void sapTang() {
		// TODO Auto-generated method stub
		Arrays.parallelSort(M);
		System.out.println("Mang sau khi sắp xếp tăng dần là:");
		for(int i = 0; i < M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
		
		
	}

	private static void soNguyenTo() {
		// TODO Auto-generated method stub
		System.out.println("Các số nguyên tố: ");
		for(int i =0; i < M.length; i++) {
			int flag = 1;
			for(int j = 2; j <= M[i]/2 ; j++) {
				if( M[i] % j == 0) {
					flag =0; 
					break;
				}
			}
			if(flag == 1) {
				System.out.print(M[i] + "\t");
			}
		}
		System.out.println();
	}

	private static void nhoNhat() {
		// TODO Auto-generated method stub
		int min = M[0];
		for(int x: M) {
			if(x < min)
				min = x;
		}
		System.out.println("Min: " + min);
		
	}

	private static void lonNhat() {
		// TODO Auto-generated method stub
		int max = M[0];
		for(int x: M) {
			if(x > max)
				max = x;
		}
		System.out.println("Max: " + max);
	}

	private static void timKiem() {
		// TODO Auto-generated method stub
		int x;
		int soLan =0;
		String s = "";
		System.out.println("Nhập phần tử bạn muốn tìm kiếm");
		x= new Scanner(System.in).nextInt();
		for(int i =0; i < M.length; i++) {
			if(M[i] == x) {
				soLan++;
				s+= i+";";
			}	
		}
		if(soLan ==0)
			System.out.println("Không tìm thấy "+x+" trong mảng");
		else {
			System.out.println("Tìm thấy "+x+" ở các vị trí :" + s);
		}
	}

	private static void tongMang() {
		// TODO Auto-generated method stub
	int sum = 0; 
	for(int x: M) {
		sum = sum +x;
	}
	System.out.println("Tổng của mảng là : "+sum);
		
	}

	private static void xuatMang() {
		// TODO Auto-generated method stub
		System.out.println("Các phần từ trong mảng là: ");
		for(int i = 0; i < M.length; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}

	private static void nhapMang() {
		// TODO Auto-generated method stub
		System.out.println("Mời bạn nhập số phần tử: ");
		int n = new Scanner(System.in).nextInt();
		M = new int[n];
		Random rd = new Random();
		for(int i =0; i < n; i++) {
			M[i] = rd.nextInt(100);
		}
		
	}

	public static void main(String[] args) {
		
		while(true) {
			menu();
		}
		
	}

}
