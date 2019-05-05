import java.util.Scanner;
import java.util.StringTokenizer;

public class CTDemSoAm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("Chương Trình Đếm số âm");
				Scanner scan = new Scanner(System.in);
				String s;
				System.out.println("Nhap vao 1 chuoi: ");
				s = scan.nextLine();
				int i;
				StringTokenizer token1 = new StringTokenizer(s,"-");
				System.out.println("Cac số âm trong chuỗi là: ");
				while(token1.hasMoreTokens()) {
					String temp = token1.nextToken();
					char []arr = temp.toCharArray();
					for(i =0; i < arr.length; i++ ){
						if( i ==0 && Character.isDigit(arr[i]) == true){
							System.out.print("-");
						}
						if(Character.isDigit(arr[i]) == false) {
						 break;
						 }else System.out.print(arr[i]);
					}
					System.out.println();
					
				}

	}

}
