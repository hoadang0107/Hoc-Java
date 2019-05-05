package taptanh.com.model;

public class NhanVienThoiVu extends NhanVien{

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Nhân viên thời vụ tính lương");
		
	}

	public NhanVienThoiVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

}
