package taptanh.com;

public class testStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");//noi chuoi
		sb.append("\n");
		sb.append("Obama");
		sb.insert(4, "xxx"); // chen vao
		String s = sb.toString();
		System.out.println(s);
		sb.delete(5, 8); // xoa ddi
		s = sb.toString();
		System.out.println(s);
		

	}

}
