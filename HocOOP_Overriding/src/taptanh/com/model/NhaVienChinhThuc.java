package taptanh.com.model;

public class NhaVienChinhThuc extends NhanVien {

	@Override
	public void tinhLuong(int ngayCong) {
		// TODO Auto-generated method stub
		
		if(ngayCong < 20)
			System.out.println("5 triệu");
		else System.out.println("20 triệu"); // hó

	}

}
