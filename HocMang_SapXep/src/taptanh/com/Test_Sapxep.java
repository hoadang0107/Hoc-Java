package taptanh.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test_Sapxep {
	
	public static void nhapMang(int M[]) {
		
		Random rd = new Random();
		for(int i =0; i < M.length; i++) {
			
			M[i]= rd.nextInt(100);
		}
	}
	public static void xuatMang(int M[]) {
		for(int i = 0; i < M.length; i ++) {
			System.out.print(M[i]+"  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Moi ban nhap so phan tu: ");
		int n = sc.nextInt();
		int M[] = new int[n];
		nhapMang(M);
		System.out.println("Mảng sau khi nhập ngẫu nhiên:");
		xuatMang(M);
		System.out.println("\nMảng đã sắp xếp:");
		Arrays.parallelSort(M);
		xuatMang(M);

	}

}
