package taptanh.com.model;

public class NhanVienThoiVu extends NhanVien{
	
	public NhanVienThoiVu() {
		super();
	}
	
	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
	}
	
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		super.tinhLuong();
		System.out.println("==> Đây là nhân viên thời vụ");
	}

}
