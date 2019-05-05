package taptanh.com.model;

public class NhanVien {
	private String ho;
	private String ten;
	private int soSP;
	public NhanVien(String ho, String ten, int soSP) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.soSP = soSP;
		if(soSP < 0) this.soSP = 0;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	
	public double getLuong() {
		if(this.soSP < 200) return this.soSP*0.5;
		else if(this.soSP < 400) return this.soSP*0.55;
		else if(this.soSP < 600) return this.soSP*0.6;
		else return this.soSP*0.65;
	}
	
	public boolean lonHon(NhanVien nv2) {
		if(this.soSP > nv2.getSoSP())
			return true;
		return false;
	}
	
}
