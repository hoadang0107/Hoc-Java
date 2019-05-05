package taptanh.com;

import java.util.StringTokenizer;

public class testStringTokenizer {
	public static void main(String[] args) {
		String s = "Obama Plutin Un";
		StringTokenizer token1 = new StringTokenizer(s);
		while(token1.hasMoreTokens()) {
			String value = token1.nextToken();
			System.out.println(value);
		}
		
		String s2 = "Hoa- Nam -Huong -Dong!vo nam";
		StringTokenizer token2 = new StringTokenizer(s2,"-!");//tuy y tach theo bn ki tu cung dk
	
		while(token2.hasMoreTokens()) {
			String value = token2.nextToken();
			System.out.println(value);
		}
	}

}
