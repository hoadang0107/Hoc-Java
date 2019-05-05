package taptanh.com.model;

public class SanPham implements Comparable<SanPham>{
	
	private int ma;
	private String ten;
	private double gia;
	public SanPham() {
		super();
	}
	public SanPham(int ma, String ten, double gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
	}
	public int getMa() {
		return ma;
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
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma+"\t"+this.ten+"\t"+this.gia;
	}
	@Override
	public int compareTo(SanPham arg0) {
		/*if(this.gia < arg0.gia) return 1;
		if ( this.gia> arg0.gia) return -1;
		return 0;*/
		
		return this.ten.compareToIgnoreCase(arg0.getTen());
	}

}
