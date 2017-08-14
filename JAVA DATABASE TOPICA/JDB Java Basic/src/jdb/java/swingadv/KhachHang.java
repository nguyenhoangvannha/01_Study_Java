package jdb.java.swingadv;

public class KhachHang {
	String ma;
	String ten;
	String soDienThoai;
	String email;
	NhomKhachHang nhom;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public KhachHang() {
		super();
	}
	public KhachHang(String ma, String ten, String soDienThoai, String email) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.soDienThoai = soDienThoai;
		this.email = email;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public NhomKhachHang getNhom() {
		return nhom;
	}
	public void setNhom(NhomKhachHang nhom) {
		this.nhom = nhom;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ten;
	}
}
