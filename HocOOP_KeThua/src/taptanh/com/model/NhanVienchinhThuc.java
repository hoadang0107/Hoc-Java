package taptanh.com.model;

public class NhanVienchinhThuc extends NhanVien {
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		super.tinhLuong();
		System.out.println("Đây là nhân viên chính thức");
		
	}
	
	public NhanVienchinhThuc() {
		super();
	}
	
	public NhanVienchinhThuc(int ma, String ten) {
		super(ma,ten);
	}

}
