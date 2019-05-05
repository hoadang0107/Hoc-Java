package taptanh.com.model;

public abstract class NhanVien {
	
	private int ma;
	private String ten;
	public int getMa() {
		return ma;
	}
	public NhanVien() {
		super();
	}
	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	// lớp abstract bắt buộc phải có trong lớp con của nó
	public abstract void tinhLuong();

}
