package jdb.java.swingadv;

import java.util.Vector;

public class NhomKhachHang {
	String ma;
	String ten;
	Vector<KhachHang> dsKH;
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Vector<KhachHang> getDsKH() {
		return dsKH;
	}
	public void setDsKH(Vector<KhachHang> dsKH) {
		this.dsKH = dsKH;
	}
	public NhomKhachHang(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.dsKH = new Vector<KhachHang>();
	}
	public NhomKhachHang() {
		super();
		this.dsKH = new Vector<KhachHang>();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTen();
	}
	public void themKH(KhachHang kh) {
		dsKH.add(kh);
		kh.setNhom(this);
	}
}
