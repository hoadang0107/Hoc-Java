package taptanh.com;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
	
	public static void choi() {
		Random rd = new Random();
		int soMay = rd.nextInt(101);
		System.out.println("May da nha ra 1 so [0...100], moi ban doan: ");
		int soLanDoan = 1;
		int soDoan;
		while( soLanDoan <= 7) {
			soDoan = new Scanner(System.in).nextInt();
			System.out.println("Lan doan thu "+soLanDoan);
			soLanDoan++;
			if(soDoan == soMay) {
				System.out.println("Chuc mung ban da doan dung !!!");
				break;
			}else if(soDoan > soMay) System.out.println("So ban doan lon hon so can doan.");
			else  System.out.println("So ban doan nho hon so can tim");
			if(soLanDoan == 8) System.out.println("Ban da thua. Da het 7 lan doan");
			
		}
	}
	
	public static void main(String[] args) {
		choi();
	}

}
