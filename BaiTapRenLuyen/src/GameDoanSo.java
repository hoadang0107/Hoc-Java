import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {
	
	public static boolean choi(){
		int point = 5;
		Random rd = new Random();
		Scanner  scan = new Scanner(System.in);
		int soDoan = 0;
		int dich; 
		while (point > 0) {
			dich = rd.nextInt(6);
			System.out.println("Nhap vao so ban doan [0,5]: ");
			soDoan = scan.nextInt();
			if (soDoan != dich ) {
				point --;
				System.out.println("Ban doan sai roi!!!");
				System.out.println("Ban con "+ point+ " diem");
			}else if(point < 9){
				point++;
				System.out.println("Chuc mung ban da doan dung! Choi tiep nao!!");
				System.out.println("Ban con "+ point+ " diem");
			}else {
				System.out.println("Chuc mung ban da dat 10 diem!!!");
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("GAME DOAN SO\n");
		if(choi() == false) {
			System.out.println("Ban da that bai! Hen lan sau nha!!!");
			System.out.println("Game Over!!!!!");
		}
		else System.out.println("Congratilations! You win");

	}

}
