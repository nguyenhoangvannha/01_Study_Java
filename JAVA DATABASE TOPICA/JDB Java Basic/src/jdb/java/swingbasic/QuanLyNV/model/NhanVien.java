/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdb.java.swingbasic.QuanLyNV.model;

import java.util.Date;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class NhanVien {
    private String maNV;
    private String tenNV;
    private Date ngayVaoLamViec;
    public NhanVien(String maNV, String tenNV, Date ngayVaoLamViec, Date namSinh) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngayVaoLamViec = ngayVaoLamViec;
		this.namSinh = namSinh;
	}

	public NhanVien() {
		super();
	}

	private Date namSinh;
    private PhongBan phong;

    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.tenNV;
    }
    
    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the tenNV
     */
    public String getTenNV() {
        return tenNV;
    }

    /**
     * @param tenNV the tenNV to set
     */
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    /**
     * @return the ngayVaoLamViec
     */
    public Date getNgayVaoLamViec() {
        return ngayVaoLamViec;
    }

    /**
     * @param ngayVaoLamViec the ngayVaoLamViec to set
     */
    public void setNgayVaoLamViec(Date ngayVaoLamViec) {
        this.ngayVaoLamViec = ngayVaoLamViec;
    }

    /**
     * @return the namSinh
     */
    public Date getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @return the phong
     */
    public PhongBan getPhong() {
        return phong;
    }

    /**
     * @param phong the phong to set
     */
    public void setPhong(PhongBan phong) {
        this.phong = phong;
    }
}
