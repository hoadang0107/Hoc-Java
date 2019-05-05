
public class TestDoiChuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Xin chao Nam! To la Hoa";
		s.replace("Nam", "Hai");
		System.out.println(s);//s khong doi do gua gan lai s
		String s0 = s.replace("a", "e");
		System.out.println(s0);
		String s1 = s.replaceFirst("a", "e");
		System.out.println(s1);

	}

}
