package taptanh.com;

public class TestToiUu {
	
	
	public static String toiUu(String s) {
		String sToiUu = s;
		sToiUu = sToiUu.trim();
		String []arrWord = sToiUu.split(" ");
		sToiUu = "";
		for(String word: arrWord) {
			String newword = word.toLowerCase();
			if(newword.length() >0) {
				newword = newword.replaceFirst(newword.charAt(0)+"", (newword.charAt(0)+"").toUpperCase()); 
				sToiUu += newword+ " ";
				
			}
		}
		
		return sToiUu.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "    DAng  THi hoA   ";
		System.out.println(s);
		String sToiUu = toiUu(s);
		System.out.println(sToiUu);

	}

}
