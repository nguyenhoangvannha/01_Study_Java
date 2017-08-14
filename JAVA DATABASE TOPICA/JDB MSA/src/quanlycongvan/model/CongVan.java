package quanlycongvan.model;

import java.io.Serializable;
import java.sql.Date;

public class CongVan implements Serializable {
	private int ID;
	private int loaiCongVanID, nguoiNhanID, coQuanID;
	private Date ngayThangVaoSo, ngayVanBan;
	private String soVanBan;
	private String ghiChu;
	
	public CongVan() {
		super();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getLoaiCongVanID() {
		return loaiCongVanID;
	}
	public void setLoaiCongVanID(int loaiCongVanID) {
		this.loaiCongVanID = loaiCongVanID;
	}
	public int getNguoiNhanID() {
		return nguoiNhanID;
	}
	public void setNguoiNhanID(int nguoiNhanID) {
		this.nguoiNhanID = nguoiNhanID;
	}
	public int getCoQuanID() {
		return coQuanID;
	}
	public void setCoQuanID(int coQuanID) {
		this.coQuanID = coQuanID;
	}
	public Date getNgayThangVaoSo() {
		return ngayThangVaoSo;
	}
	public void setNgayThangVaoSo(Date ngayThangVaoSo) {
		this.ngayThangVaoSo = ngayThangVaoSo;
	}
	public Date getNgayVanBan() {
		return ngayVanBan;
	}
	public void setNgayVanBan(Date ngayVanBan) {
		this.ngayVanBan = ngayVanBan;
	}
	public String getSoVanBan() {
		return soVanBan;
	}
	public void setSoVanBan(String soVanBan) {
		this.soVanBan = soVanBan;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
}
