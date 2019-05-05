package taptanh.com;

public class TestTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   Đặng Thị Hoa  ";
		System.out.println("Chieu dai la: " +s.length());
		s = s.trim();
		System.out.println("Chieu dai la: " + s.length());
		
		String s1 = "   Hôm nay t đi chơi   ";
		int vtL = 0,vtR= 0;
		for(int i =0; i < s.length(); i++) {
		char c= s1.charAt(i);
		if( c== ' ')
			vtL = i;
		else break;
		}
		s1 = s1.substring(vtL+1);
		System.out.println(s1);
		for(int i = s1.length()-1; i >=0; i--) {
			char c2 = s1.charAt(i);
			if(c2 == ' ') 
				vtR = i;
			else	break;
		}
		s1 = s1.substring(0, vtR);
		System.out.println(s1+"end");
		

	}

}
