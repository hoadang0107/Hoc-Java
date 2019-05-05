package taptanh.com.model;

import java.io.Serializable;

public class KhanhHang implements Serializable{
	
	private int ma;
	private String ten;
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
	public KhanhHang(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	

}
