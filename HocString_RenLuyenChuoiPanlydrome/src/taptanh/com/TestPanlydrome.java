package taptanh.com;

import java.util.Scanner;

public class TestPanlydrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Moi ban nhap vao 1 chuoi: ");
		String s = sc.nextLine();
		char []arr = s.toCharArray();
		boolean flag = true;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != arr[arr.length-1-i]) {
				flag = false;
				break;
			}
		}
		if(flag)
		System.out.println(s+"-> chuoi panlydrome");
		else System.out.println(s+"->khong phai panlydrome");

	}

}
